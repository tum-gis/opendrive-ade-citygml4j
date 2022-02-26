module opendrive.ade.citygml4j.main {
    requires org.citygml4j;
    requires opendrive.ade.citygml4j.gml.linear.referencing.main;

//    exports implementing_ades.model;
//    exports implementing_ades.adapter to org.xmlobjects;
//    exports implementing_ades.walker to org.citygml4j;
//
//    uses org.citygml4j.xml.ade.ADEContext;
//    provides org.citygml4j.xml.ade.ADEContext with implementing_ades.TestADEContext;
//
//    opens implementing_ades.model to org.citygml4j;
//    opens processing_citygml to org.citygml4j;

    exports org.citygml.ade.opendrive;

    exports org.citygml.ade.opendrive.model.core;
    exports org.citygml.ade.opendrive.model.road;
    exports org.citygml.ade.opendrive.model.object;
    exports org.citygml.ade.opendrive.model.junction;
    exports org.citygml.ade.opendrive.model.geometry;
    exports org.citygml.ade.opendrive.model.lane;

    exports org.citygml.ade.opendrive.adapter.core to org.xmlobjects;
    exports org.citygml.ade.opendrive.adapter.road to org.xmlobjects;
    exports org.citygml.ade.opendrive.adapter.object to org.xmlobjects;
    exports org.citygml.ade.opendrive.adapter.junction to org.xmlobjects;
    exports org.citygml.ade.opendrive.adapter.geometry to org.xmlobjects;
    exports org.citygml.ade.opendrive.adapter.lane to org.xmlobjects;

    exports org.citygml.ade.opendrive.walker to org.citygml4j;

    uses org.citygml4j.xml.ade.ADEContext;
    provides org.citygml4j.xml.ade.ADEContext with org.citygml.ade.opendrive.OpenDRIVEADEContext;

    opens org.citygml.ade.opendrive.model.core to org.citygml4j;
    opens org.citygml.ade.opendrive.model.road to org.citygml4j;
    exports org.citygml.ade.opendrive.model.linearReferencing;
    opens org.citygml.ade.opendrive.model.linearReferencing to org.citygml4j;

}