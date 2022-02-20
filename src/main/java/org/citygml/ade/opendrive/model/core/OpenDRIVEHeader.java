package org.citygml.ade.opendrive.model.core;

import org.citygml4j.model.ade.ADEObject;
import org.citygml4j.model.core.ADEOfCityModel;
import org.xmlobjects.gml.model.GMLObject;

import java.time.OffsetDateTime;

public class OpenDRIVEHeader extends ADEOfCityModel implements ADEObject, OpenDRIVEElement {
//    private OffsetDateTime date;
    private String date;
    private Double east;
    private Double west;
    private Double north;
    private Double south;
    private Integer revMinor;
    private Integer revMajor;
    private String name;
    private String vendor;
    private String version;
    private OpenDRIVEOffsetProperty offset;
    private String georeference;
    private OpenDRIVEAdditionalDataProperty additionalData;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getEast() {
        return east;
    }

    public void setEast(Double east) {
        this.east = east;
    }

    public Double getWest() {
        return west;
    }

    public void setWest(Double west) {
        this.west = west;
    }

    public Double getNorth() {
        return north;
    }

    public void setNorth(Double north) {
        this.north = north;
    }

    public Double getSouth() {
        return south;
    }

    public void setSouth(Double south) {
        this.south = south;
    }

    public Integer getRevMinor() {
        return revMinor;
    }

    public void setRevMinor(Integer revMinor) {
        this.revMinor = revMinor;
    }

    public Integer getRevMajor() {
        return revMajor;
    }

    public void setRevMajor(Integer revMajor) {
        this.revMajor = revMajor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public OpenDRIVEOffsetProperty getOffset() {
        return offset;
    }

    public void setOffset(OpenDRIVEOffsetProperty offset) {
        this.offset = offset;
    }

    public String getGeoreference() {
        return georeference;
    }

    public void setGeoreference(String georeference) {
        this.georeference = georeference;
    }

    @Override
    public void setAdditionalData(OpenDRIVEAdditionalDataProperty additionalData) {
        this.additionalData = additionalData;
    }

    @Override
    public OpenDRIVEAdditionalDataProperty getAdditionalData() {
        return this.additionalData;
    }
}
