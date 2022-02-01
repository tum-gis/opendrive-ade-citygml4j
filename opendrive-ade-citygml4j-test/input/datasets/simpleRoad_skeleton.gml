<?xml version="1.0" encoding="UTF-8"?>
<core:CityModel xmlns:bldg="http://www.opengis.net/citygml/building/3.0" xmlns:gts="http://www.isotc211.org/2005/gts" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:con="http://www.opengis.net/citygml/construction/3.0" xmlns:gmllrtr="http://www.opengis.net/gml/3.3/lrtr" xmlns:pfx0="urn:oasis:names:tc:ciq:xal:3" xmlns:gss="http://www.isotc211.org/2005/gss" xmlns:brid="http://www.opengis.net/citygml/bridge/3.0" xmlns:gmllr="http://www.opengis.net/gml/3.3/lr" xmlns:gmllro="http://www.opengis.net/gml/3.3/lro" xmlns:core="http://www.opengis.net/citygml/3.0" xmlns:odr="http://www.citygml.org/ade/openDRIVE" xmlns:grp="http://www.opengis.net/citygml/cityobjectgroup/3.0" xmlns:dyn="http://www.opengis.net/citygml/dynamizer/3.0" xmlns:gsr="http://www.isotc211.org/2005/gsr" xmlns:frn="http://www.opengis.net/citygml/cityfurniture/3.0" xmlns:tun="http://www.opengis.net/citygml/tunnel/3.0" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:app="http://www.opengis.net/citygml/appearance/3.0" xmlns:gmd="http://www.isotc211.org/2005/gmd" xmlns:gco="http://www.isotc211.org/2005/gco" xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:gmllrov="http://www.opengis.net/gml/3.3/lrov" xmlns:tran="http://www.opengis.net/citygml/transportation/3.0" xmlns:ct="urn:oasis:names:tc:ciq:ct:3" gml:id="UUID_30dd8d0a-293d-4429-bb45-97d230848557">
	<core:cityObjectMember>
		<odr:OpenDRIVEStandardRoad gml:id="id-road-1.2_ODR_id_1">
			<tran:class>inherited class attribute</tran:class>
			<odr:length>1.0000000000000000e+02</odr:length>
			<odr:roadName>Test road</odr:roadName>
			<odr:rule>RHT</odr:rule>
		</odr:OpenDRIVEStandardRoad>
	</core:cityObjectMember>
	<core:cityObjectMember>
		<odr:OpenDRIVEJunction gml:id="id-junction-1.2_ODR_id_1">
			<tran:class>inherited class attribute</tran:class>
			<odr:junctionName>Test junction</odr:junctionName>
			<odr:junctionType>default</odr:junctionType>
		</odr:OpenDRIVEJunction>
	</core:cityObjectMember>
	<core:cityObjectMember>
		<bldg:Building gml:id="FZK_GUID_1F3E679D-E226-4535-926C-7390977FB25A">
			<core:adeOfAbstractCityObject>
				<odr:LinearReferencing>
					<odr:positionExpression>
						<gmllr:PositionExpression gml:id="UUID_585610f3-46fc-4649-92d3-5f15b88d318a">
							<gmllr:linearElement>
								<gmllr:LinearElement>
									<gmllr:feature xlink:href="#UUID_a0305fb9-9672-4005-9645-606db80d88b1"/>
									<gmllr:startValue uom="m" lrm="lrm-anyURI">100.0</gmllr:startValue>
								</gmllr:LinearElement>
							</gmllr:linearElement>
							<gmllr:lrm>
								<gmllr:LinearReferencingMethod>
									<gmllr:name/>
									<gmllr:type>absolute</gmllr:type>
									<gmllr:units>m</gmllr:units>
								</gmllr:LinearReferencingMethod>
							</gmllr:lrm>
							<gmllr:distanceExpression>
								<gmllr:DistanceExpression>
									<gmllr:distanceAlong>0.0000000000000000e+00</gmllr:distanceAlong>
									<gmllr:referent>
										<gmllr:AlongReferent>
											<gmllr:fromReferent xlink:href="#UUID_a1a532ee-2d86-11ec-8ad1-f875a4974e75"/>
										</gmllr:AlongReferent>
									</gmllr:referent>								
								</gmllr:DistanceExpression>
							</gmllr:distanceExpression>
						</gmllr:PositionExpression>
					</odr:positionExpression>
				</odr:LinearReferencing>
			</core:adeOfAbstractCityObject>
			<core:adeOfAbstractCityObject>
				<odr:OpenDRIVEAdditionalObjectData>
					<odr:additionalData>
						<odr:OpenDRIVEAdditionalData>
							<odr:userData>
								<odr:OpenDRIVEUserData>
									<odr:code>1000</odr:code>
									<odr:value>userDataContentValue</odr:value>
									<odr:userDataContent>
										<style sOffset="0.0" laneStyle="bo_curbstone01"/>
									</odr:userDataContent>
								</odr:OpenDRIVEUserData>
							</odr:userData>
							<odr:include>
								<core:ExternalReference/>
							</odr:include>
							<odr:dataQuality>
								<odr:OpenDRIVEDataQuality>
									<odr:error>
										<odr:OpenDRIVEDataError>
											<odr:xyAbsolute>0.54</odr:xyAbsolute>
											<odr:xyRelative>0.12</odr:xyRelative>
											<odr:zAbsolute>0.85</odr:zAbsolute>
											<odr:zRelative>3.85</odr:zRelative>
										</odr:OpenDRIVEDataError>
									</odr:error>
									<odr:rawData>
										<odr:OpenDRIVERawData>
											<odr:date>some date</odr:date>
											<odr:postProcessing>raw</odr:postProcessing>
											<odr:postProcessingComment>no post-processing</odr:postProcessingComment>
											<odr:source>cadastre</odr:source>
											<odr:sourceComment>data source: public authorities</odr:sourceComment>
										</odr:OpenDRIVERawData>
									</odr:rawData>
								</odr:OpenDRIVEDataQuality>
							</odr:dataQuality>
						</odr:OpenDRIVEAdditionalData>
					</odr:additionalData>
				</odr:OpenDRIVEAdditionalObjectData>
			</core:adeOfAbstractCityObject>
		</bldg:Building>
	</core:cityObjectMember>
	<core:cityObjectMember>
		<brid:Bridge>
			<core:adeOfAbstractCityObject>
				<odr:LinearReferencing>
					<odr:positionExpression>
						<gmllr:PositionExpression gml:id="UUID_585610f3-46fc-4649-92d3-5f15b88d318a">
						 <!-- xlink:href="#UUID_a0305fb9-9672-4005-9645-606db80d88b1" -->
							<gmllr:linearElement>
								<gmllr:LinearElement>
									<gmllr:startValue uom="m" lrm="lrm-anyURI">100.0</gmllr:startValue>
								</gmllr:LinearElement>
							</gmllr:linearElement>
							<gmllr:lrm>
								<gmllr:LinearReferencingMethod>
									<gmllr:name/>
									<gmllr:type>absolute</gmllr:type>
									<gmllr:units>m</gmllr:units>
								</gmllr:LinearReferencingMethod>
							</gmllr:lrm>
							<gmllr:distanceExpression>
								<gmllr:DistanceExpression>
									<gmllr:distanceAlong>0.0000000000000000e+00</gmllr:distanceAlong>
								</gmllr:DistanceExpression>
							</gmllr:distanceExpression>
						</gmllr:PositionExpression>
					</odr:positionExpression>
				</odr:LinearReferencing>
			</core:adeOfAbstractCityObject>
			<brid:adeOfBridge>
				<odr:OpenDRIVEBridgeProperties>
					<odr:bridgeName>bridge</odr:bridgeName>
					<odr:length>100.0</odr:length>
					<odr:type>concrete</odr:type>
				</odr:OpenDRIVEBridgeProperties>
			</brid:adeOfBridge>
		</brid:Bridge>
	</core:cityObjectMember>
	<core:cityObjectMember>
		<tun:Tunnel>
			<tun:adeOfTunnel>
				<odr:OpenDRIVETunnelProperties>
					<odr:tunnelName>tunnel</odr:tunnelName>
					<odr:length>100.0</odr:length>
					<odr:type>underpass</odr:type>
					<odr:daylight>0.4</odr:daylight>
					<odr:lightning>1.0</odr:lightning>
				</odr:OpenDRIVETunnelProperties>
			</tun:adeOfTunnel>
		</tun:Tunnel>
	</core:cityObjectMember>
	<core:adeOfCityModel>
		<odr:OpenDRIVEHeader>
			<odr:date>Mon Oct 28 14:02:13 2019</odr:date>
			<!-- <odr:date>2007-12-03T10:15:30+01:00</odr:date> -->
			<odr:east>0.0000000000000000e+00</odr:east>
			<odr:north>0.0000000000000000e+00</odr:north>
			<odr:revMajor>1</odr:revMajor>
			<odr:revMinor>6</odr:revMinor>
			<odr:south>0.0000000000000000e+00</odr:south>
			<odr:version>1.00</odr:version>
			<odr:west>0.0000000000000000e+00</odr:west>
			<odr:georeference>
				<![CDATA[+proj=tmerc +lat_0=0 +lon_0=9 +k=0.9996 +x_0=500000 +y_0=0 +datum=WGS84 +units=m +no_defs]]>
			</odr:georeference>
			<odr:offset>
				<odr:OpenDRIVEOffset>
					<odr:hdg>0.23</odr:hdg>
					<odr:x>0.0</odr:x>
					<odr:y>0.0</odr:y>
					<odr:z>0.0</odr:z>
				</odr:OpenDRIVEOffset>
			</odr:offset>
		</odr:OpenDRIVEHeader>
	</core:adeOfCityModel>
	<core:adeOfCityModel>
		<odr:OpenDRIVEAdditionalDatasetData>
			<odr:additionalData>
				<odr:OpenDRIVEAdditionalData>
					<odr:userData>
						<odr:OpenDRIVEUserData>
							<odr:code>1000</odr:code>
							<odr:value>userDataContentValue</odr:value>
							<odr:userDataContent>
								<style sOffset="0.0" laneStyle="bo_curbstone01"/>
							</odr:userDataContent>
						</odr:OpenDRIVEUserData>
					</odr:userData>
					<odr:include>
						<core:ExternalReference/>
					</odr:include>
					<odr:dataQuality>
						<odr:OpenDRIVEDataQuality>
							<odr:error>
								<odr:OpenDRIVEDataError>
									<odr:xyAbsolute>0.54</odr:xyAbsolute>
									<odr:xyRelative>0.12</odr:xyRelative>
									<odr:zAbsolute>0.85</odr:zAbsolute>
									<odr:zRelative>3.85</odr:zRelative>
								</odr:OpenDRIVEDataError>
							</odr:error>
							<odr:rawData>
								<odr:OpenDRIVERawData>
									<odr:date>some date</odr:date>
									<odr:postProcessing>raw</odr:postProcessing>
									<odr:postProcessingComment>no post-processing</odr:postProcessingComment>
									<odr:source>cadastre</odr:source>
									<odr:sourceComment>data source: public authorities</odr:sourceComment>
								</odr:OpenDRIVERawData>
							</odr:rawData>
						</odr:OpenDRIVEDataQuality>
					</odr:dataQuality>
				</odr:OpenDRIVEAdditionalData>
			</odr:additionalData>
		</odr:OpenDRIVEAdditionalDatasetData>
	</core:adeOfCityModel>
</core:CityModel>