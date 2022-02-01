package reader;

import org.citygml4j.ADERegistry;
import org.citygml4j.CityGMLContext;
import org.citygml4j.CityGMLContextException;
import org.citygml4j.model.ade.ADEObject;
import org.citygml4j.model.common.GeometryInfo;
import org.citygml4j.model.core.AbstractFeature;
import org.citygml4j.xml.ade.ADEContext;
import org.citygml4j.xml.ade.ADEException;
import org.citygml4j.xml.module.ade.ADEModule;
import org.citygml4j.xml.reader.ChunkOptions;
import org.citygml4j.xml.reader.CityGMLInputFactory;
import org.citygml4j.xml.reader.CityGMLReadException;
import org.citygml4j.xml.reader.CityGMLReader;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ServiceLoader;

public class OpenDRIVEADEReader {
    public static void main(String[] args) throws ADEException, CityGMLContextException, CityGMLReadException {
        ADERegistry adeRegistry = ADERegistry.getInstance();

        System.out.println("Loading ADE contexts using a service loader");
        for (ADEContext adeContext : ServiceLoader.load(ADEContext.class))
            adeRegistry.loadADEContext(adeContext);

        for (ADEModule module : adeRegistry.getADEModules()) {
            System.out.println("Loaded ADE module for namespace " + module.getNamespaceURI() +
                    " and CityGML version " + module.getCityGMLVersion());
        }

        CityGMLContext context = CityGMLContext.newInstance();

        CityGMLInputFactory in = context.createCityGMLInputFactory(); // .withChunking(ChunkOptions.chunkByFeatures());

        Path file = Paths.get("opendrive-ade-citygml4j-test/input/datasets/simpleRoad_skeleton.gml");
        System.out.println("Reading the TestADE file " + file + " chunk-wise by city model members");

        try (CityGMLReader reader = in.createCityGMLReader(file)) {
            while (reader.hasNext()) {
                AbstractFeature feature = reader.next();
                System.out.println("Found " + reader.getName().getLocalPart() + " with gml:id " + feature.getId());
                System.out.println("- class: " + feature.getClass().getName());
                System.out.println("- is ADE: " + (feature instanceof ADEObject));

                GeometryInfo geometryInfo = feature.getGeometryInfo();
                for (int lod = 0; lod < 5; lod++)
                    System.out.println("- has LoD " + lod + " geometry: " + geometryInfo.hasGeometries(lod));
            }
        }
    }
}
