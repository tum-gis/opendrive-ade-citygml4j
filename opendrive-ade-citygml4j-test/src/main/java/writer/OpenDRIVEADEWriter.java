package writer;

import org.citygml.ade.opendrive.OpenDRIVEADEContext;
import org.citygml.ade.opendrive.model.junction.OpenDRIVEJunction;
import org.citygml.ade.opendrive.model.junction.e_junction_type;
import org.citygml.ade.opendrive.model.road.OpenDRIVEStandardRoad;
import org.citygml4j.ADERegistry;
import org.citygml4j.CityGMLContext;
import org.citygml4j.CityGMLContextException;
import org.citygml4j.model.CityGMLVersion;
import org.citygml4j.model.core.AbstractCityObjectProperty;
import org.citygml4j.model.core.CityModel;
import org.citygml4j.xml.ade.ADEException;
import org.citygml4j.xml.writer.CityGMLOutputFactory;
import org.citygml4j.xml.writer.CityGMLWriteException;
import org.citygml4j.xml.writer.CityGMLWriter;
import org.xmlobjects.gml.model.measures.Length;

import java.nio.file.Path;
import java.nio.file.Paths;

public class OpenDRIVEADEWriter {
    public static void main(String[] args) throws ADEException, CityGMLContextException, CityGMLWriteException {
        ADERegistry.getInstance().loadADEContext(new OpenDRIVEADEContext());

        CityGMLContext context = CityGMLContext.newInstance();

        CityModel cityModel = new CityModel();

        OpenDRIVEStandardRoad standardRoad = new OpenDRIVEStandardRoad();
        standardRoad.setOpenDRIVERoadName("Writer test road");
        standardRoad.setOpenDRIVERoadLength(new Length(100.0));

        AbstractCityObjectProperty standardRoadProperty = new AbstractCityObjectProperty(standardRoad);

        cityModel.getCityObjectMembers().add(standardRoadProperty);

        OpenDRIVEJunction junction = new OpenDRIVEJunction();
        junction.setJunctionName("Writer test junction");
        junction.setJunctionType(e_junction_type.DEFAULT);

        AbstractCityObjectProperty junctionProperty = new AbstractCityObjectProperty(junction);

        cityModel.getCityObjectMembers().add(junctionProperty);

        Path outputFile = Paths.get("opendrive-ade-citygml4j-test/output/test.gml");

        CityGMLVersion version = CityGMLVersion.v3_0;
        CityGMLOutputFactory out = context.createCityGMLOutputFactory(version);

        CityGMLWriter writer = out.createCityGMLWriter(outputFile, "UTF-8");
        writer.withDefaultPrefixes();
//        writer.withDefaultNamespace(CoreModule.of(version).getNamespaceURI());
        writer.withIndent("    ");
        writer.write(cityModel);
        writer.close();


    }
}
