<?xml version="1.0" encoding="UTF-8"?>
<core:CityModel xmlns:gts="http://www.isotc211.org/2005/gts" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:con="http://www.opengis.net/citygml/construction/3.0" xmlns:gmllrtr="http://www.opengis.net/gml/3.3/lrtr" xmlns:pfx0="urn:oasis:names:tc:ciq:xal:3" xmlns:gss="http://www.isotc211.org/2005/gss" xmlns:brid="http://www.opengis.net/citygml/bridge/3.0" xmlns:gmllr="http://www.opengis.net/gml/3.3/lr" xmlns:gmllro="http://www.opengis.net/gml/3.3/lro" xmlns:core="http://www.opengis.net/citygml/3.0" xmlns:odr="http://www.citygml.org/ade/openDRIVE" xmlns:grp="http://www.opengis.net/citygml/cityobjectgroup/3.0" xmlns:dyn="http://www.opengis.net/citygml/dynamizer/3.0" xmlns:gsr="http://www.isotc211.org/2005/gsr" xmlns:frn="http://www.opengis.net/citygml/cityfurniture/3.0" xmlns:tun="http://www.opengis.net/citygml/tunnel/3.0" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:app="http://www.opengis.net/citygml/appearance/3.0" xmlns:gmd="http://www.isotc211.org/2005/gmd" xmlns:gco="http://www.isotc211.org/2005/gco" xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:gmllrov="http://www.opengis.net/gml/3.3/lrov" xmlns:tran="http://www.opengis.net/citygml/transportation/3.0" xmlns:ct="urn:oasis:names:tc:ciq:ct:3" gml:id="UUID_30dd8d0a-293d-4429-bb45-97d230848557">
	<core:cityObjectMember>
		<odr:OpenDRIVEStandardRoad gml:id="id-road-1.2_ODR_id_1">
			<odr:length>1.0000000000000000e+02</odr:length>
			<odr:name/>
			<odr:rule>RHT</odr:rule>
			<odr:laneSection>
				<odr:OpenDRIVELaneSection gml:id="id-laneSection-1.2.4.1">
					<core:adeOfAbstractCityObject>
						<odr:LinearReferencing>
							<odr:positionExpression>
								<gmllr:PositionExpression gml:id="UUID_bb024a1c-2741-446e-91b8-762fe7493243">
									<gmllr:linearElement xlink:href="#UUID_aa091071-136a-47b3-b946-417836ae4703"/>
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
					<odr:lane>
						<odr:OpenDRIVETrafficLane gml:id="id-lane-1.2.4.1.1.1">
							<tran:successor xlink:href="#id-lane-1.2.4.2.1.1"/>
							<odr:lateralLaneSection>left</odr:lateralLaneSection>
							<odr:laneID>1</odr:laneID>
							<odr:type>driving</odr:type>
							<odr:level>false</odr:level>
							<odr:roadMark>
								<odr:OpenDRIVELaneRoadMark gml:id="id-roadMark-1.2.4.1.1.1.3">
									<core:adeOfAbstractCityObject>
										<odr:LinearReferencing>
											<odr:positionExpression>
												<gmllr:PositionExpression gml:id="UUID_e702d7e6-25c2-11ec-b8db-f875a4974e75">
													<gmllr:linearElement xlink:href="#UUID_aa091071-136a-47b3-b946-417836ae4703"/>
													<gmllr:lrm>
														<gmllr:LinearReferencingMethod>
															<gmllr:name> </gmllr:name>
															<gmllr:type>relative</gmllr:type>
															<gmllr:units>m</gmllr:units>
														</gmllr:LinearReferencingMethod>
													</gmllr:lrm>
													<gmllr:distanceExpression>
														<gmllr:DistanceExpression>
															<gmllr:distanceAlong>0.0000000000000000e+00</gmllr:distanceAlong>
															<gmllr:referent>
																<gmllr:AlongReferent>
																	<gmllr:fromReferent xlink:href="#UUID_e702d7e5-25c2-11ec-812b-f875a4974e75"/>
																</gmllr:AlongReferent>
															</gmllr:referent>
														</gmllr:DistanceExpression>
													</gmllr:distanceExpression>
												</gmllr:PositionExpression>
											</odr:positionExpression>
										</odr:LinearReferencing>
									</core:adeOfAbstractCityObject>
									<odr:type>solid</odr:type>
									<odr:weight>standard</odr:weight>
									<odr:color>standard</odr:color>
									<odr:width>1.2000000000000000e-01</odr:width>
									<odr:laneChange>none</odr:laneChange>
									<odr:thickness>1.9999999552965164e-02</odr:thickness>
									<odr:laneRoadMarkType>
										<odr:OpenDRIVELaneRoadMarkType gml:id="id-type-1.2.4.1.1.1.3.1">
											<odr:roadMarkTypeName>solid</odr:roadMarkTypeName>
											<odr:width>1.2000000000000000e-01</odr:width>
											<odr:line>
												<odr:OpenDRIVELaneRoadMarkLine gml:id="id-line-1.2.4.1.1.1.3.1.1">
													<core:adeOfAbstractCityObject>
														<odr:LinearReferencing>
															<odr:positionExpression>
																<gmllr:PositionExpression gml:id="UUID_e702d7e8-25c2-11ec-9073-f875a4974e75">
																	<gmllr:linearElement xlink:href="#UUID_aa091071-136a-47b3-b946-417836ae4703"/>
																	<gmllr:lrm>
																		<gmllr:LinearReferencingMethod>
																			<gmllr:name> </gmllr:name>
																			<gmllr:type>relative</gmllr:type>
																			<gmllr:units>m</gmllr:units>
																		</gmllr:LinearReferencingMethod>
																	</gmllr:lrm>
																	<gmllr:distanceExpression>
																		<gmllro:LateralOffsetDistanceExpression>
																			<gmllr:distanceAlong>0.0000000000000000e+00</gmllr:distanceAlong>
																			<gmllr:referent>
																				<gmllr:AlongReferent>
																					<gmllr:fromReferent xlink:href="#UUID_e702d7e7-25c2-11ec-924f-f875a4974e75"/>
																				</gmllr:AlongReferent>
																			</gmllr:referent>
																			<gmllro:lateralOffsetExpression uom="m" lateralOffsetReferent="laneBorder" featureGeometry="#UUID_e4f64775-25c2-11ec-8841-f875a4974e75">0.0000000000000000e+00</gmllro:lateralOffsetExpression>
																		</gmllro:LateralOffsetDistanceExpression>
																	</gmllr:distanceExpression>
																</gmllr:PositionExpression>
															</odr:positionExpression>
														</odr:LinearReferencing>
													</core:adeOfAbstractCityObject>
													<odr:length>0.0000000000000000e+00</odr:length>
													<odr:width>1.2000000000000000e-01</odr:width>
													<odr:space>0.0000000000000000e+00</odr:space>
													<odr:rule>no passing</odr:rule>
												</odr:OpenDRIVELaneRoadMarkLine>
											</odr:line>
										</odr:OpenDRIVELaneRoadMarkType>
									</odr:laneRoadMarkType>
								</odr:OpenDRIVELaneRoadMark>
							</odr:roadMark>
							<odr:laneShape>
								<odr:OpenDRIVELaneShape gml:id="UUID_6a2d0704-5c91-4a5f-8a8c-53c7aacbdd3c">
									<odr:lateralLaneBoundary>
										<odr:OpenDRIVELateralLaneBoundary gml:id="UUID_e4f64775-25c2-11ec-8841-f875a4974e75">
											<odr:laneBorder>
												<odr:OpenDRIVELaneBorder gml:id="UUID_3022c7dd-5ff2-46f1-ad1d-667a610c8265">
													<odr:border>
														<odr:OpenDRIVECurve gml:id="UUID_b25f4831-3e3b-41ad-ac14-ea9ff73d7905">
															<odr:segment>
																<odr:OpenDRIVECubicPolynomial srsName="OpenDRIVEReferenceLineSystem" gml:id="UUID_b3922bb6-3bee-4770-9a49-2e6da4a3b0a6">
																	<odr:linearReferencing>
																		<odr:LinearReferencing>
																			<odr:positionExpression>
																				<gmllr:PositionExpression>
																					<gmllr:linearElement xlink:href="#UUID_aa091071-136a-47b3-b946-417836ae4703"/>
																					<gmllr:lrm>
																						<gmllr:LinearReferencingMethod>
																							<gmllr:name/>
																							<gmllr:type>relative</gmllr:type>
																							<gmllr:units>m</gmllr:units>
																						</gmllr:LinearReferencingMethod>
																					</gmllr:lrm>
																					<gmllr:distanceExpression>
																						<gmllr:DistanceExpression>
																							<gmllr:distanceAlong>0.0000000000000000e+00</gmllr:distanceAlong>
																							<gmllr:referent>
																								<gmllr:AlongReferent>
																									<gmllr:fromReferent xlink:href="#UUID_e702d7e5-25c2-11ec-812b-f875a4974e75"/>
																								</gmllr:AlongReferent>
																							</gmllr:referent>
																						</gmllr:DistanceExpression>
																					</gmllr:distanceExpression>
																				</gmllr:PositionExpression>
																			</odr:positionExpression>
																		</odr:LinearReferencing>
																	</odr:linearReferencing>
																	<odr:a>3.5699999999999998e+00</odr:a>
																	<odr:b>0.0000000000000000e+00</odr:b>
																	<odr:c>0.0000000000000000e+00</odr:c>
																	<odr:d>0.0000000000000000e+00</odr:d>
																</odr:OpenDRIVECubicPolynomial>
															</odr:segment>
														</odr:OpenDRIVECurve>
													</odr:border>
												</odr:OpenDRIVELaneBorder>
											</odr:laneBorder>
										</odr:OpenDRIVELateralLaneBoundary>
									</odr:lateralLaneBoundary>
								</odr:OpenDRIVELaneShape>
							</odr:laneShape>
						</odr:OpenDRIVETrafficLane>
					</odr:lane>
					<odr:lane>
						<odr:OpenDRIVETrafficLane gml:id="id-lane-1.2.4.1.2.1">
							<odr:lateralLaneSection>center</odr:lateralLaneSection>
							<odr:laneID>0</odr:laneID>
							<odr:type>driving</odr:type>
							<odr:level>false</odr:level>
							<odr:roadMark>
								<odr:OpenDRIVELaneRoadMark gml:id="id-roadMark-1.2.4.1.2.1.2">
									<core:adeOfAbstractCityObject>
										<odr:LinearReferencing>
											<odr:positionExpression>
												<gmllr:PositionExpression gml:id="UUID_e702d7e9-25c2-11ec-b499-f875a4974e75">
													<gmllr:linearElement xlink:href="#UUID_aa091071-136a-47b3-b946-417836ae4703"/>
													<gmllr:lrm>
														<gmllr:LinearReferencingMethod>
															<gmllr:name> </gmllr:name>
															<gmllr:type>relative</gmllr:type>
															<gmllr:units>m</gmllr:units>
														</gmllr:LinearReferencingMethod>
													</gmllr:lrm>
													<gmllr:distanceExpression>
														<gmllr:DistanceExpression>
															<gmllr:distanceAlong>0.0000000000000000e+00</gmllr:distanceAlong>
															<gmllr:referent>
																<gmllr:AlongReferent>
																	<gmllr:fromReferent xlink:href="#UUID_e702d7e5-25c2-11ec-812b-f875a4974e75"/>
																</gmllr:AlongReferent>
															</gmllr:referent>
														</gmllr:DistanceExpression>
													</gmllr:distanceExpression>
												</gmllr:PositionExpression>
											</odr:positionExpression>
										</odr:LinearReferencing>
									</core:adeOfAbstractCityObject>
									<odr:type>broken</odr:type>
									<odr:weight>standard</odr:weight>
									<odr:color>standard</odr:color>
									<odr:width>1.2000000000000000e-01</odr:width>
									<odr:laneChange>both</odr:laneChange>
									<odr:thickness>1.9999999552965164e-02</odr:thickness>
									<odr:laneRoadMarkType>
										<odr:OpenDRIVELaneRoadMarkType gml:id="id-type-1.2.4.1.2.1.2.1">
											<odr:roadMarkTypeName>broken</odr:roadMarkTypeName>
											<odr:width>1.2000000000000000e-01</odr:width>
											<odr:line>
												<odr:OpenDRIVELaneRoadMarkLine gml:id="id-line-1.2.4.1.2.1.2.1.1">
													<core:adeOfAbstractCityObject>
														<odr:LinearReferencing>
															<odr:positionExpression>
																<gmllr:PositionExpression gml:id="UUID_e702d7eb-25c2-11ec-b992-f875a4974e75">
																	<gmllr:linearElement xlink:href="#UUID_aa091071-136a-47b3-b946-417836ae4703"/>
																	<gmllr:lrm>
																		<gmllr:LinearReferencingMethod>
																			<gmllr:name> </gmllr:name>
																			<gmllr:type>relative</gmllr:type>
																			<gmllr:units>m</gmllr:units>
																		</gmllr:LinearReferencingMethod>
																	</gmllr:lrm>
																	<gmllr:distanceExpression>
																		<gmllro:LateralOffsetDistanceExpression>
																			<gmllr:distanceAlong>0.0000000000000000e+00</gmllr:distanceAlong>
																			<gmllr:referent>
																				<gmllr:AlongReferent>
																					<gmllr:fromReferent xlink:href="#UUID_e702d7ea-25c2-11ec-b304-f875a4974e75"/>
																				</gmllr:AlongReferent>
																			</gmllr:referent>
																			<gmllro:lateralOffsetExpression uom="m">0.0000000000000000e+00</gmllro:lateralOffsetExpression>
																		</gmllro:LateralOffsetDistanceExpression>
																	</gmllr:distanceExpression>
																</gmllr:PositionExpression>
															</odr:positionExpression>
														</odr:LinearReferencing>
													</core:adeOfAbstractCityObject>
													<odr:length>4.0000000000000000e+00</odr:length>
													<odr:width>1.2000000000000000e-01</odr:width>
													<odr:space>8.0000000000000000e+00</odr:space>
													<odr:rule>caution</odr:rule>
												</odr:OpenDRIVELaneRoadMarkLine>
											</odr:line>
										</odr:OpenDRIVELaneRoadMarkType>
									</odr:laneRoadMarkType>
								</odr:OpenDRIVELaneRoadMark>
							</odr:roadMark>
							<odr:laneShape>
								<odr:OpenDRIVELaneShape gml:id="UUID_44c2fa08-b601-4424-afad-5cdff2f52e0c"/>
							</odr:laneShape>
						</odr:OpenDRIVETrafficLane>
					</odr:lane>
					<odr:lane>
						<odr:OpenDRIVETrafficLane gml:id="id-lane-1.2.4.1.3.1">
							<tran:successor xlink:href="#id-lane-1.2.4.2.3.1"/>
							<odr:lateralLaneSection>right</odr:lateralLaneSection>
							<odr:laneID>-1</odr:laneID>
							<odr:type>driving</odr:type>
							<odr:level>false</odr:level>
							<odr:roadMark>
								<odr:OpenDRIVELaneRoadMark gml:id="id-roadMark-1.2.4.1.3.1.3">
									<core:adeOfAbstractCityObject>
										<odr:LinearReferencing>
											<odr:positionExpression>
												<gmllr:PositionExpression gml:id="UUID_e702d7ec-25c2-11ec-9015-f875a4974e75">
													<gmllr:linearElement xlink:href="#UUID_aa091071-136a-47b3-b946-417836ae4703"/>
													<gmllr:lrm>
														<gmllr:LinearReferencingMethod>
															<gmllr:name> </gmllr:name>
															<gmllr:type>relative</gmllr:type>
															<gmllr:units>m</gmllr:units>
														</gmllr:LinearReferencingMethod>
													</gmllr:lrm>
													<gmllr:distanceExpression>
														<gmllr:DistanceExpression>
															<gmllr:distanceAlong>0.0000000000000000e+00</gmllr:distanceAlong>
															<gmllr:referent>
																<gmllr:AlongReferent>
																	<gmllr:fromReferent xlink:href="#UUID_e702d7e5-25c2-11ec-812b-f875a4974e75"/>
																</gmllr:AlongReferent>
															</gmllr:referent>
														</gmllr:DistanceExpression>
													</gmllr:distanceExpression>
												</gmllr:PositionExpression>
											</odr:positionExpression>
										</odr:LinearReferencing>
									</core:adeOfAbstractCityObject>
									<odr:type>solid</odr:type>
									<odr:weight>standard</odr:weight>
									<odr:color>standard</odr:color>
									<odr:width>1.2000000000000000e-01</odr:width>
									<odr:laneChange>none</odr:laneChange>
									<odr:thickness>1.9999999552965164e-02</odr:thickness>
									<odr:laneRoadMarkType>
										<odr:OpenDRIVELaneRoadMarkType gml:id="id-type-1.2.4.1.3.1.3.1">
											<odr:roadMarkTypeName>solid</odr:roadMarkTypeName>
											<odr:width>1.2000000000000000e-01</odr:width>
											<odr:line>
												<odr:OpenDRIVELaneRoadMarkLine gml:id="id-line-1.2.4.1.3.1.3.1.1">
													<core:adeOfAbstractCityObject>
														<odr:LinearReferencing>
															<odr:positionExpression>
																<gmllr:PositionExpression gml:id="UUID_e702d7ee-25c2-11ec-baba-f875a4974e75">
																	<gmllr:linearElement xlink:href="#UUID_aa091071-136a-47b3-b946-417836ae4703"/>
																	<gmllr:lrm>
																		<gmllr:LinearReferencingMethod>
																			<gmllr:name> </gmllr:name>
																			<gmllr:type>relative</gmllr:type>
																			<gmllr:units>m</gmllr:units>
																		</gmllr:LinearReferencingMethod>
																	</gmllr:lrm>
																	<gmllr:distanceExpression>
																		<gmllro:LateralOffsetDistanceExpression>
																			<gmllr:distanceAlong>0.0000000000000000e+00</gmllr:distanceAlong>
																			<gmllr:referent>
																				<gmllr:AlongReferent>
																					<gmllr:fromReferent xlink:href="#UUID_e702d7ed-25c2-11ec-ab6b-f875a4974e75"/>
																				</gmllr:AlongReferent>
																			</gmllr:referent>
																			<gmllro:lateralOffsetExpression uom="m" lateralOffsetReferent="laneBorder" featureGeometry="#UUID_e5215d32-25c2-11ec-8770-f875a4974e75">0.0000000000000000e+00</gmllro:lateralOffsetExpression>
																		</gmllro:LateralOffsetDistanceExpression>
																	</gmllr:distanceExpression>
																</gmllr:PositionExpression>
															</odr:positionExpression>
														</odr:LinearReferencing>
													</core:adeOfAbstractCityObject>
													<odr:length>0.0000000000000000e+00</odr:length>
													<odr:width>1.2000000000000000e-01</odr:width>
													<odr:space>0.0000000000000000e+00</odr:space>
													<odr:rule>no passing</odr:rule>
												</odr:OpenDRIVELaneRoadMarkLine>
											</odr:line>
										</odr:OpenDRIVELaneRoadMarkType>
									</odr:laneRoadMarkType>
								</odr:OpenDRIVELaneRoadMark>
							</odr:roadMark>
							<odr:laneShape>
								<odr:OpenDRIVELaneShape gml:id="UUID_b543aa9c-5836-4d99-b063-60ed5e3f87e3">
									<odr:lateralLaneBoundary>
										<odr:OpenDRIVELateralLaneBoundary gml:id="UUID_e5215d32-25c2-11ec-8770-f875a4974e75">
											<odr:laneBorder>
												<odr:OpenDRIVELaneBorder gml:id="UUID_c4395218-59bc-4488-89b8-af94f983faaf">
													<odr:border>
														<odr:OpenDRIVECurve gml:id="UUID_f6292acb-22c8-4a32-b900-7c5a57326727">
															<odr:segment>
																<odr:OpenDRIVECubicPolynomial srsName="OpenDRIVEReferenceLineSystem" gml:id="UUID_0a1e1b6d-5809-4d1f-8fcd-82d90b4a21fb">
																	<odr:linearReferencing>
																		<odr:LinearReferencing>
																			<odr:positionExpression>
																				<gmllr:PositionExpression>
																					<gmllr:linearElement xlink:href="#UUID_aa091071-136a-47b3-b946-417836ae4703"/>
																					<gmllr:lrm>
																						<gmllr:LinearReferencingMethod>
																							<gmllr:name/>
																							<gmllr:type>relative</gmllr:type>
																							<gmllr:units>m</gmllr:units>
																						</gmllr:LinearReferencingMethod>
																					</gmllr:lrm>
																					<gmllr:distanceExpression>
																						<gmllr:DistanceExpression>
																							<gmllr:distanceAlong>0.0000000000000000e+00</gmllr:distanceAlong>
																							<gmllr:referent>
																								<gmllr:AlongReferent>
																									<gmllr:fromReferent xlink:href="#UUID_e702d7e5-25c2-11ec-812b-f875a4974e75"/>
																								</gmllr:AlongReferent>
																							</gmllr:referent>
																						</gmllr:DistanceExpression>
																					</gmllr:distanceExpression>
																				</gmllr:PositionExpression>
																			</odr:positionExpression>
																		</odr:LinearReferencing>
																	</odr:linearReferencing>
																	<odr:a>-3.5699999999999998e+00</odr:a>
																	<odr:b>-0.0000000000000000e+00</odr:b>
																	<odr:c>-0.0000000000000000e+00</odr:c>
																	<odr:d>-0.0000000000000000e+00</odr:d>
																</odr:OpenDRIVECubicPolynomial>
															</odr:segment>
														</odr:OpenDRIVECurve>
													</odr:border>
												</odr:OpenDRIVELaneBorder>
											</odr:laneBorder>
										</odr:OpenDRIVELateralLaneBoundary>
									</odr:lateralLaneBoundary>
								</odr:OpenDRIVELaneShape>
							</odr:laneShape>
						</odr:OpenDRIVETrafficLane>
					</odr:lane>
				</odr:OpenDRIVELaneSection>
			</odr:laneSection>
			<odr:laneSection>
				<odr:OpenDRIVELaneSection gml:id="id-laneSection-1.2.4.2">
					<core:adeOfAbstractCityObject>
						<odr:LinearReferencing>
							<odr:positionExpression>
								<gmllr:PositionExpression gml:id="UUID_22b57253-b9e2-4405-bab4-a127435c4522">
									<gmllr:linearElement xlink:href="#UUID_aa091071-136a-47b3-b946-417836ae4703"/>
									<gmllr:lrm>
										<gmllr:LinearReferencingMethod>
											<gmllr:name/>
											<gmllr:type>absolute</gmllr:type>
											<gmllr:units>m</gmllr:units>
										</gmllr:LinearReferencingMethod>
									</gmllr:lrm>
									<gmllr:distanceExpression>
										<gmllr:DistanceExpression>
											<gmllr:distanceAlong>5.0000000000000000e+01</gmllr:distanceAlong>
										</gmllr:DistanceExpression>
									</gmllr:distanceExpression>
								</gmllr:PositionExpression>
							</odr:positionExpression>
						</odr:LinearReferencing>
					</core:adeOfAbstractCityObject>
					<odr:lane>
						<odr:OpenDRIVETrafficLane gml:id="id-lane-1.2.4.2.1.1">
							<tran:predecessor xlink:href="#id-lane-1.2.4.1.1.1"/>
							<odr:lateralLaneSection>left</odr:lateralLaneSection>
							<odr:laneID>1</odr:laneID>
							<odr:type>driving</odr:type>
							<odr:level>false</odr:level>
							<odr:roadMark>
								<odr:OpenDRIVELaneRoadMark gml:id="id-roadMark-1.2.4.2.1.1.3">
									<core:adeOfAbstractCityObject>
										<odr:LinearReferencing>
											<odr:positionExpression>
												<gmllr:PositionExpression gml:id="UUID_e702d7f0-25c2-11ec-bd30-f875a4974e75">
													<gmllr:linearElement xlink:href="#UUID_aa091071-136a-47b3-b946-417836ae4703"/>
													<gmllr:lrm>
														<gmllr:LinearReferencingMethod>
															<gmllr:name> </gmllr:name>
															<gmllr:type>relative</gmllr:type>
															<gmllr:units>m</gmllr:units>
														</gmllr:LinearReferencingMethod>
													</gmllr:lrm>
													<gmllr:distanceExpression>
														<gmllr:DistanceExpression>
															<gmllr:distanceAlong>0.0000000000000000e+00</gmllr:distanceAlong>
															<gmllr:referent>
																<gmllr:AlongReferent>
																	<gmllr:fromReferent xlink:href="#UUID_e702d7ef-25c2-11ec-b220-f875a4974e75"/>
																</gmllr:AlongReferent>
															</gmllr:referent>
														</gmllr:DistanceExpression>
													</gmllr:distanceExpression>
												</gmllr:PositionExpression>
											</odr:positionExpression>
										</odr:LinearReferencing>
									</core:adeOfAbstractCityObject>
									<odr:type>solid</odr:type>
									<odr:weight>standard</odr:weight>
									<odr:color>standard</odr:color>
									<odr:width>1.2000000000000000e-01</odr:width>
									<odr:laneChange>none</odr:laneChange>
									<odr:thickness>1.9999999552965164e-02</odr:thickness>
									<odr:laneRoadMarkType>
										<odr:OpenDRIVELaneRoadMarkType gml:id="id-type-1.2.4.2.1.1.3.1">
											<odr:roadMarkTypeName>solid</odr:roadMarkTypeName>
											<odr:width>1.2000000000000000e-01</odr:width>
											<odr:line>
												<odr:OpenDRIVELaneRoadMarkLine gml:id="id-line-1.2.4.2.1.1.3.1.1">
													<core:adeOfAbstractCityObject>
														<odr:LinearReferencing>
															<odr:positionExpression>
																<gmllr:PositionExpression gml:id="UUID_e702d7f2-25c2-11ec-9919-f875a4974e75">
																	<gmllr:linearElement xlink:href="#UUID_aa091071-136a-47b3-b946-417836ae4703"/>
																	<gmllr:lrm>
																		<gmllr:LinearReferencingMethod>
																			<gmllr:name> </gmllr:name>
																			<gmllr:type>relative</gmllr:type>
																			<gmllr:units>m</gmllr:units>
																		</gmllr:LinearReferencingMethod>
																	</gmllr:lrm>
																	<gmllr:distanceExpression>
																		<gmllro:LateralOffsetDistanceExpression>
																			<gmllr:distanceAlong>0.0000000000000000e+00</gmllr:distanceAlong>
																			<gmllr:referent>
																				<gmllr:AlongReferent>
																					<gmllr:fromReferent xlink:href="#UUID_e702d7f1-25c2-11ec-9c9b-f875a4974e75"/>
																				</gmllr:AlongReferent>
																			</gmllr:referent>
																			<gmllro:lateralOffsetExpression uom="m" lateralOffsetReferent="laneBorder" featureGeometry="#UUID_e52d4a4b-25c2-11ec-9e63-f875a4974e75">0.0000000000000000e+00</gmllro:lateralOffsetExpression>
																		</gmllro:LateralOffsetDistanceExpression>
																	</gmllr:distanceExpression>
																</gmllr:PositionExpression>
															</odr:positionExpression>
														</odr:LinearReferencing>
													</core:adeOfAbstractCityObject>
													<odr:length>0.0000000000000000e+00</odr:length>
													<odr:width>1.2000000000000000e-01</odr:width>
													<odr:space>0.0000000000000000e+00</odr:space>
													<odr:rule>no passing</odr:rule>
												</odr:OpenDRIVELaneRoadMarkLine>
											</odr:line>
										</odr:OpenDRIVELaneRoadMarkType>
									</odr:laneRoadMarkType>
								</odr:OpenDRIVELaneRoadMark>
							</odr:roadMark>
							<odr:laneShape>
								<odr:OpenDRIVELaneShape gml:id="UUID_5577b37c-ff1b-479d-b584-8c1aa3e043a9">
									<odr:lateralLaneBoundary>
										<odr:OpenDRIVELateralLaneBoundary gml:id="UUID_e52d4a4b-25c2-11ec-9e63-f875a4974e75">
											<odr:laneBorder>
												<odr:OpenDRIVELaneBorder gml:id="UUID_6ca91028-b0f1-4468-8210-393e723c0eb7">
													<odr:border>
														<odr:OpenDRIVECurve gml:id="UUID_9a5e516d-5427-408c-a8a9-42ae73cb4eff">
															<odr:segment>
																<odr:OpenDRIVECubicPolynomial srsName="OpenDRIVEReferenceLineSystem" gml:id="UUID_4f0b73d7-0262-430d-8543-f0889efc7ef1">
																	<odr:linearReferencing>
																		<odr:LinearReferencing>
																			<odr:positionExpression>
																				<gmllr:PositionExpression>
																					<gmllr:linearElement xlink:href="#UUID_aa091071-136a-47b3-b946-417836ae4703"/>
																					<gmllr:lrm>
																						<gmllr:LinearReferencingMethod>
																							<gmllr:name/>
																							<gmllr:type>relative</gmllr:type>
																							<gmllr:units>m</gmllr:units>
																						</gmllr:LinearReferencingMethod>
																					</gmllr:lrm>
																					<gmllr:distanceExpression>
																						<gmllr:DistanceExpression>
																							<gmllr:distanceAlong>0.0000000000000000e+00</gmllr:distanceAlong>
																							<gmllr:referent>
																								<gmllr:AlongReferent>
																									<gmllr:fromReferent xlink:href="#UUID_e702d7ef-25c2-11ec-b220-f875a4974e75"/>
																								</gmllr:AlongReferent>
																							</gmllr:referent>
																						</gmllr:DistanceExpression>
																					</gmllr:distanceExpression>
																				</gmllr:PositionExpression>
																			</odr:positionExpression>
																		</odr:LinearReferencing>
																	</odr:linearReferencing>
																	<odr:a>3.5699999999999998e+00</odr:a>
																	<odr:b>0.0000000000000000e+00</odr:b>
																	<odr:c>0.0000000000000000e+00</odr:c>
																	<odr:d>0.0000000000000000e+00</odr:d>
																</odr:OpenDRIVECubicPolynomial>
															</odr:segment>
														</odr:OpenDRIVECurve>
													</odr:border>
												</odr:OpenDRIVELaneBorder>
											</odr:laneBorder>
										</odr:OpenDRIVELateralLaneBoundary>
									</odr:lateralLaneBoundary>
								</odr:OpenDRIVELaneShape>
							</odr:laneShape>
						</odr:OpenDRIVETrafficLane>
					</odr:lane>
					<odr:lane>
						<odr:OpenDRIVETrafficLane gml:id="id-lane-1.2.4.2.2.1">
							<odr:lateralLaneSection>center</odr:lateralLaneSection>
							<odr:laneID>0</odr:laneID>
							<odr:type>driving</odr:type>
							<odr:level>false</odr:level>
							<odr:roadMark>
								<odr:OpenDRIVELaneRoadMark gml:id="id-roadMark-1.2.4.2.2.1.2">
									<core:adeOfAbstractCityObject>
										<odr:LinearReferencing>
											<odr:positionExpression>
												<gmllr:PositionExpression gml:id="UUID_e702d7f3-25c2-11ec-9b49-f875a4974e75">
													<gmllr:linearElement xlink:href="#UUID_aa091071-136a-47b3-b946-417836ae4703"/>
													<gmllr:lrm>
														<gmllr:LinearReferencingMethod>
															<gmllr:name> </gmllr:name>
															<gmllr:type>relative</gmllr:type>
															<gmllr:units>m</gmllr:units>
														</gmllr:LinearReferencingMethod>
													</gmllr:lrm>
													<gmllr:distanceExpression>
														<gmllr:DistanceExpression>
															<gmllr:distanceAlong>0.0000000000000000e+00</gmllr:distanceAlong>
															<gmllr:referent>
																<gmllr:AlongReferent>
																	<gmllr:fromReferent xlink:href="#UUID_e702d7ef-25c2-11ec-b220-f875a4974e75"/>
																</gmllr:AlongReferent>
															</gmllr:referent>
														</gmllr:DistanceExpression>
													</gmllr:distanceExpression>
												</gmllr:PositionExpression>
											</odr:positionExpression>
										</odr:LinearReferencing>
									</core:adeOfAbstractCityObject>
									<odr:type>broken</odr:type>
									<odr:weight>standard</odr:weight>
									<odr:color>standard</odr:color>
									<odr:width>1.2000000000000000e-01</odr:width>
									<odr:laneChange>both</odr:laneChange>
									<odr:thickness>1.9999999552965164e-02</odr:thickness>
									<odr:laneRoadMarkType>
										<odr:OpenDRIVELaneRoadMarkType gml:id="id-type-1.2.4.2.2.1.2.1">
											<odr:roadMarkTypeName>broken</odr:roadMarkTypeName>
											<odr:width>1.2000000000000000e-01</odr:width>
											<odr:line>
												<odr:OpenDRIVELaneRoadMarkLine gml:id="id-line-1.2.4.2.2.1.2.1.1">
													<core:adeOfAbstractCityObject>
														<odr:LinearReferencing>
															<odr:positionExpression>
																<gmllr:PositionExpression gml:id="UUID_e702d7f5-25c2-11ec-9741-f875a4974e75">
																	<gmllr:linearElement xlink:href="#UUID_aa091071-136a-47b3-b946-417836ae4703"/>
																	<gmllr:lrm>
																		<gmllr:LinearReferencingMethod>
																			<gmllr:name> </gmllr:name>
																			<gmllr:type>relative</gmllr:type>
																			<gmllr:units>m</gmllr:units>
																		</gmllr:LinearReferencingMethod>
																	</gmllr:lrm>
																	<gmllr:distanceExpression>
																		<gmllro:LateralOffsetDistanceExpression>
																			<gmllr:distanceAlong>0.0000000000000000e+00</gmllr:distanceAlong>
																			<gmllr:referent>
																				<gmllr:AlongReferent>
																					<gmllr:fromReferent xlink:href="#UUID_e702d7f4-25c2-11ec-9bf6-f875a4974e75"/>
																				</gmllr:AlongReferent>
																			</gmllr:referent>
																			<gmllro:lateralOffsetExpression uom="m">0.0000000000000000e+00</gmllro:lateralOffsetExpression>
																		</gmllro:LateralOffsetDistanceExpression>
																	</gmllr:distanceExpression>
																</gmllr:PositionExpression>
															</odr:positionExpression>
														</odr:LinearReferencing>
													</core:adeOfAbstractCityObject>
													<odr:length>4.0000000000000000e+00</odr:length>
													<odr:width>1.2000000000000000e-01</odr:width>
													<odr:space>8.0000000000000000e+00</odr:space>
													<odr:rule>caution</odr:rule>
												</odr:OpenDRIVELaneRoadMarkLine>
											</odr:line>
										</odr:OpenDRIVELaneRoadMarkType>
									</odr:laneRoadMarkType>
								</odr:OpenDRIVELaneRoadMark>
							</odr:roadMark>
							<odr:laneShape>
								<odr:OpenDRIVELaneShape gml:id="UUID_88f6ace4-77fc-42dd-ad13-847d182b1aa4"/>
							</odr:laneShape>
						</odr:OpenDRIVETrafficLane>
					</odr:lane>
					<odr:lane>
						<odr:OpenDRIVETrafficLane gml:id="id-lane-1.2.4.2.3.1">
							<tran:predecessor xlink:href="#id-lane-1.2.4.1.3.1"/>
							<odr:lateralLaneSection>right</odr:lateralLaneSection>
							<odr:laneID>-1</odr:laneID>
							<odr:type>driving</odr:type>
							<odr:level>false</odr:level>
							<odr:roadMark>
								<odr:OpenDRIVELaneRoadMark gml:id="id-roadMark-1.2.4.2.3.1.3">
									<core:adeOfAbstractCityObject>
										<odr:LinearReferencing>
											<odr:positionExpression>
												<gmllr:PositionExpression gml:id="UUID_e702d7f6-25c2-11ec-bd7e-f875a4974e75">
													<gmllr:linearElement xlink:href="#UUID_aa091071-136a-47b3-b946-417836ae4703"/>
													<gmllr:lrm>
														<gmllr:LinearReferencingMethod>
															<gmllr:name> </gmllr:name>
															<gmllr:type>relative</gmllr:type>
															<gmllr:units>m</gmllr:units>
														</gmllr:LinearReferencingMethod>
													</gmllr:lrm>
													<gmllr:distanceExpression>
														<gmllr:DistanceExpression>
															<gmllr:distanceAlong>0.0000000000000000e+00</gmllr:distanceAlong>
															<gmllr:referent>
																<gmllr:AlongReferent>
																	<gmllr:fromReferent xlink:href="#UUID_e702d7ef-25c2-11ec-b220-f875a4974e75"/>
																</gmllr:AlongReferent>
															</gmllr:referent>
														</gmllr:DistanceExpression>
													</gmllr:distanceExpression>
												</gmllr:PositionExpression>
											</odr:positionExpression>
										</odr:LinearReferencing>
									</core:adeOfAbstractCityObject>
									<odr:type>broken</odr:type>
									<odr:weight>standard</odr:weight>
									<odr:color>standard</odr:color>
									<odr:width>1.2000000000000000e-01</odr:width>
									<odr:laneChange>both</odr:laneChange>
									<odr:thickness>1.9999999552965164e-02</odr:thickness>
									<odr:laneRoadMarkType>
										<odr:OpenDRIVELaneRoadMarkType gml:id="id-type-1.2.4.2.3.1.3.1">
											<odr:roadMarkTypeName>broken</odr:roadMarkTypeName>
											<odr:width>1.2000000000000000e-01</odr:width>
											<odr:line>
												<odr:OpenDRIVELaneRoadMarkLine gml:id="id-line-1.2.4.2.3.1.3.1.1">
													<core:adeOfAbstractCityObject>
														<odr:LinearReferencing>
															<odr:positionExpression>
																<gmllr:PositionExpression gml:id="UUID_e702d7f8-25c2-11ec-9d00-f875a4974e75">
																	<gmllr:linearElement xlink:href="#UUID_aa091071-136a-47b3-b946-417836ae4703"/>
																	<gmllr:lrm>
																		<gmllr:LinearReferencingMethod>
																			<gmllr:name> </gmllr:name>
																			<gmllr:type>relative</gmllr:type>
																			<gmllr:units>m</gmllr:units>
																		</gmllr:LinearReferencingMethod>
																	</gmllr:lrm>
																	<gmllr:distanceExpression>
																		<gmllro:LateralOffsetDistanceExpression>
																			<gmllr:distanceAlong>0.0000000000000000e+00</gmllr:distanceAlong>
																			<gmllr:referent>
																				<gmllr:AlongReferent>
																					<gmllr:fromReferent xlink:href="#UUID_e702d7f7-25c2-11ec-887a-f875a4974e75"/>
																				</gmllr:AlongReferent>
																			</gmllr:referent>
																			<gmllro:lateralOffsetExpression uom="m" lateralOffsetReferent="laneBorder" featureGeometry="#UUID_e5215d33-25c2-11ec-99b6-f875a4974e75">0.0000000000000000e+00</gmllro:lateralOffsetExpression>
																		</gmllro:LateralOffsetDistanceExpression>
																	</gmllr:distanceExpression>
																</gmllr:PositionExpression>
															</odr:positionExpression>
														</odr:LinearReferencing>
													</core:adeOfAbstractCityObject>
													<odr:length>4.0000000000000000e+00</odr:length>
													<odr:width>1.2000000000000000e-01</odr:width>
													<odr:space>8.0000000000000000e+00</odr:space>
													<odr:rule>caution</odr:rule>
												</odr:OpenDRIVELaneRoadMarkLine>
											</odr:line>
										</odr:OpenDRIVELaneRoadMarkType>
									</odr:laneRoadMarkType>
								</odr:OpenDRIVELaneRoadMark>
							</odr:roadMark>
							<odr:laneShape>
								<odr:OpenDRIVELaneShape gml:id="UUID_0934ada1-6488-4b3b-a2ff-cdcfd3dc856b">
									<odr:lateralLaneBoundary>
										<odr:OpenDRIVELateralLaneBoundary gml:id="UUID_e5215d33-25c2-11ec-99b6-f875a4974e75">
											<odr:laneBorder>
												<odr:OpenDRIVELaneBorder gml:id="UUID_d576d6e3-8a53-4242-9a2d-fbc9eaea8a54">
													<odr:border>
														<odr:OpenDRIVECurve gml:id="UUID_0ab58365-4e40-4b99-9922-8143bf8cad6c">
															<odr:segment>
																<odr:OpenDRIVECubicPolynomial srsName="OpenDRIVEReferenceLineSystem" gml:id="UUID_64e6600d-b231-4254-8169-cbb6c72c3d4f">
																	<odr:linearReferencing>
																		<odr:LinearReferencing>
																			<odr:positionExpression>
																				<gmllr:PositionExpression>
																					<gmllr:linearElement xlink:href="#UUID_aa091071-136a-47b3-b946-417836ae4703"/>
																					<gmllr:lrm>
																						<gmllr:LinearReferencingMethod>
																							<gmllr:name/>
																							<gmllr:type>relative</gmllr:type>
																							<gmllr:units>m</gmllr:units>
																						</gmllr:LinearReferencingMethod>
																					</gmllr:lrm>
																					<gmllr:distanceExpression>
																						<gmllr:DistanceExpression>
																							<gmllr:distanceAlong>0.0000000000000000e+00</gmllr:distanceAlong>
																							<gmllr:referent>
																								<gmllr:AlongReferent>
																									<gmllr:fromReferent xlink:href="#UUID_e702d7ef-25c2-11ec-b220-f875a4974e75"/>
																								</gmllr:AlongReferent>
																							</gmllr:referent>
																						</gmllr:DistanceExpression>
																					</gmllr:distanceExpression>
																				</gmllr:PositionExpression>
																			</odr:positionExpression>
																		</odr:LinearReferencing>
																	</odr:linearReferencing>
																	<odr:a>-3.5699999999999998e+00</odr:a>
																	<odr:b>-0.0000000000000000e+00</odr:b>
																	<odr:c>-0.0000000000000000e+00</odr:c>
																	<odr:d>-0.0000000000000000e+00</odr:d>
																</odr:OpenDRIVECubicPolynomial>
															</odr:segment>
														</odr:OpenDRIVECurve>
													</odr:border>
												</odr:OpenDRIVELaneBorder>
											</odr:laneBorder>
										</odr:OpenDRIVELateralLaneBoundary>
									</odr:lateralLaneBoundary>
								</odr:OpenDRIVELaneShape>
							</odr:laneShape>
						</odr:OpenDRIVETrafficLane>
					</odr:lane>
					<odr:lane>
						<odr:OpenDRIVETrafficLane gml:id="id-lane-1.2.4.2.3.2">
							<odr:lateralLaneSection>right</odr:lateralLaneSection>
							<odr:laneID>-2</odr:laneID>
							<odr:type>driving</odr:type>
							<odr:level>false</odr:level>
							<odr:roadMark>
								<odr:OpenDRIVELaneRoadMark gml:id="id-roadMark-1.2.4.2.3.2.4">
									<core:adeOfAbstractCityObject>
										<odr:LinearReferencing>
											<odr:positionExpression>
												<gmllr:PositionExpression gml:id="UUID_e702d7f9-25c2-11ec-ae30-f875a4974e75">
													<gmllr:linearElement xlink:href="#UUID_aa091071-136a-47b3-b946-417836ae4703"/>
													<gmllr:lrm>
														<gmllr:LinearReferencingMethod>
															<gmllr:name> </gmllr:name>
															<gmllr:type>relative</gmllr:type>
															<gmllr:units>m</gmllr:units>
														</gmllr:LinearReferencingMethod>
													</gmllr:lrm>
													<gmllr:distanceExpression>
														<gmllr:DistanceExpression>
															<gmllr:distanceAlong>0.0000000000000000e+00</gmllr:distanceAlong>
															<gmllr:referent>
																<gmllr:AlongReferent>
																	<gmllr:fromReferent xlink:href="#UUID_e702d7ef-25c2-11ec-b220-f875a4974e75"/>
																</gmllr:AlongReferent>
															</gmllr:referent>
														</gmllr:DistanceExpression>
													</gmllr:distanceExpression>
												</gmllr:PositionExpression>
											</odr:positionExpression>
										</odr:LinearReferencing>
									</core:adeOfAbstractCityObject>
									<odr:type>solid</odr:type>
									<odr:weight>standard</odr:weight>
									<odr:color>standard</odr:color>
									<odr:width>1.2000000000000000e-01</odr:width>
									<odr:laneChange>none</odr:laneChange>
									<odr:thickness>1.9999999552965164e-02</odr:thickness>
									<odr:laneRoadMarkType>
										<odr:OpenDRIVELaneRoadMarkType gml:id="id-type-1.2.4.2.3.2.4.1">
											<odr:roadMarkTypeName>solid</odr:roadMarkTypeName>
											<odr:width>1.2000000000000000e-01</odr:width>
											<odr:line>
												<odr:OpenDRIVELaneRoadMarkLine gml:id="id-line-1.2.4.2.3.2.4.1.1">
													<core:adeOfAbstractCityObject>
														<odr:LinearReferencing>
															<odr:positionExpression>
																<gmllr:PositionExpression gml:id="UUID_e702d7fb-25c2-11ec-a512-f875a4974e75">
																	<gmllr:linearElement xlink:href="#UUID_aa091071-136a-47b3-b946-417836ae4703"/>
																	<gmllr:lrm>
																		<gmllr:LinearReferencingMethod>
																			<gmllr:name> </gmllr:name>
																			<gmllr:type>relative</gmllr:type>
																			<gmllr:units>m</gmllr:units>
																		</gmllr:LinearReferencingMethod>
																	</gmllr:lrm>
																	<gmllr:distanceExpression>
																		<gmllro:LateralOffsetDistanceExpression>
																			<gmllr:distanceAlong>0.0000000000000000e+00</gmllr:distanceAlong>
																			<gmllr:referent>
																				<gmllr:AlongReferent>
																					<gmllr:fromReferent xlink:href="#UUID_e702d7fa-25c2-11ec-bf05-f875a4974e75"/>
																				</gmllr:AlongReferent>
																			</gmllr:referent>
																			<gmllro:lateralOffsetExpression uom="m" lateralOffsetReferent="laneBorder" featureGeometry="#UUID_e523bfe2-25c2-11ec-95c2-f875a4974e75">0.0000000000000000e+00</gmllro:lateralOffsetExpression>
																		</gmllro:LateralOffsetDistanceExpression>
																	</gmllr:distanceExpression>
																</gmllr:PositionExpression>
															</odr:positionExpression>
														</odr:LinearReferencing>
													</core:adeOfAbstractCityObject>
													<odr:length>0.0000000000000000e+00</odr:length>
													<odr:width>1.2000000000000000e-01</odr:width>
													<odr:space>0.0000000000000000e+00</odr:space>
													<odr:rule>no passing</odr:rule>
												</odr:OpenDRIVELaneRoadMarkLine>
											</odr:line>
										</odr:OpenDRIVELaneRoadMarkType>
									</odr:laneRoadMarkType>
								</odr:OpenDRIVELaneRoadMark>
							</odr:roadMark>
							<odr:laneShape>
								<odr:OpenDRIVELaneShape gml:id="UUID_e9d7c6ee-e7e9-41ea-b6ee-e881b0409a22">
									<odr:lateralLaneBoundary>
										<odr:OpenDRIVELateralLaneBoundary gml:id="UUID_e523bfe2-25c2-11ec-95c2-f875a4974e75">
											<odr:laneBorder>
												<odr:OpenDRIVELaneBorder gml:id="UUID_d63c66e5-55b4-4018-a525-fce394daa51e">
													<odr:border>
														<odr:OpenDRIVECurve gml:id="UUID_2b209b36-5d1f-4da8-9862-cb0d3d09560b">
															<odr:segment>
																<odr:OpenDRIVECubicPolynomial srsName="OpenDRIVEReferenceLineSystem" gml:id="UUID_acd638a0-37f3-4299-851f-eed144f3cfcd">
																	<odr:linearReferencing>
																		<odr:LinearReferencing>
																			<odr:positionExpression>
																				<gmllr:PositionExpression>
																					<gmllr:linearElement xlink:href="#UUID_aa091071-136a-47b3-b946-417836ae4703"/>
																					<gmllr:lrm>
																						<gmllr:LinearReferencingMethod>
																							<gmllr:name/>
																							<gmllr:type>relative</gmllr:type>
																							<gmllr:units>m</gmllr:units>
																						</gmllr:LinearReferencingMethod>
																					</gmllr:lrm>
																					<gmllr:distanceExpression>
																						<gmllr:DistanceExpression>
																							<gmllr:distanceAlong>0.0000000000000000e+00</gmllr:distanceAlong>
																							<gmllr:referent>
																								<gmllr:AlongReferent>
																									<gmllr:fromReferent xlink:href="#UUID_e702d7ef-25c2-11ec-b220-f875a4974e75"/>
																								</gmllr:AlongReferent>
																							</gmllr:referent>
																						</gmllr:DistanceExpression>
																					</gmllr:distanceExpression>
																				</gmllr:PositionExpression>
																			</odr:positionExpression>
																		</odr:LinearReferencing>
																	</odr:linearReferencing>
																	<odr:a>-3.5699999999999998e+00</odr:a>
																	<odr:b>-0.0000000000000000e+00</odr:b>
																	<odr:c>-2.6774999999999993e-02</odr:c>
																	<odr:d>8.9249999999999985e-04</odr:d>
																</odr:OpenDRIVECubicPolynomial>
															</odr:segment>
														</odr:OpenDRIVECurve>
													</odr:border>
												</odr:OpenDRIVELaneBorder>
											</odr:laneBorder>
											<odr:laneBorder>
												<odr:OpenDRIVELaneBorder gml:id="UUID_0fbfe055-9234-4dd0-9fdb-05351b6aa4dc">
													<odr:border>
														<odr:OpenDRIVECurve gml:id="UUID_6fff747c-9c30-42b2-8b94-ba6919ce3a5a">
															<odr:segment>
																<odr:OpenDRIVECubicPolynomial srsName="OpenDRIVEReferenceLineSystem" gml:id="UUID_b73a8019-d8e1-4548-ba09-beb633042e61">
																	<odr:linearReferencing>
																		<odr:LinearReferencing>
																			<odr:positionExpression>
																				<gmllr:PositionExpression>
																					<gmllr:linearElement xlink:href="#UUID_aa091071-136a-47b3-b946-417836ae4703"/>
																					<gmllr:lrm>
																						<gmllr:LinearReferencingMethod>
																							<gmllr:name/>
																							<gmllr:type>relative</gmllr:type>
																							<gmllr:units>m</gmllr:units>
																						</gmllr:LinearReferencingMethod>
																					</gmllr:lrm>
																					<gmllr:distanceExpression>
																						<gmllr:DistanceExpression>
																							<gmllr:distanceAlong>2.0000000000000000e+01</gmllr:distanceAlong>
																							<gmllr:referent>
																								<gmllr:AlongReferent>
																									<gmllr:fromReferent xlink:href="#UUID_e702d7ef-25c2-11ec-b220-f875a4974e75"/>
																								</gmllr:AlongReferent>
																							</gmllr:referent>
																						</gmllr:DistanceExpression>
																					</gmllr:distanceExpression>
																				</gmllr:PositionExpression>
																			</odr:positionExpression>
																		</odr:LinearReferencing>
																	</odr:linearReferencing>
																	<odr:a>-7.1399999999999997e+00</odr:a>
																	<odr:b>-0.0000000000000000e+00</odr:b>
																	<odr:c>-0.0000000000000000e+00</odr:c>
																	<odr:d>-0.0000000000000000e+00</odr:d>
																</odr:OpenDRIVECubicPolynomial>
															</odr:segment>
														</odr:OpenDRIVECurve>
													</odr:border>
												</odr:OpenDRIVELaneBorder>
											</odr:laneBorder>
										</odr:OpenDRIVELateralLaneBoundary>
									</odr:lateralLaneBoundary>
								</odr:OpenDRIVELaneShape>
							</odr:laneShape>
						</odr:OpenDRIVETrafficLane>
					</odr:lane>
				</odr:OpenDRIVELaneSection>
			</odr:laneSection>
			<odr:roadShape>
				<odr:OpenDRIVERoadShape gml:id="UUID_4023d0a2-bd16-4faa-ac37-242e69f737f5">
					<odr:referenceLine>
						<odr:OpenDRIVERoadReferenceLine gml:id="UUID_aa091071-136a-47b3-b946-417836ae4703">
							<odr:referent>
								<gmllr:Referent gml:id="UUID_e702d7e5-25c2-11ec-812b-f875a4974e75">
									<gmllr:location xlink:href="#UUID_bb024a1c-2741-446e-91b8-762fe7493243"/>
								</gmllr:Referent>
							</odr:referent>
							<odr:referent>
								<gmllr:Referent gml:id="UUID_e702d7e7-25c2-11ec-924f-f875a4974e75">
									<gmllr:location xlink:href="#UUID_e702d7e6-25c2-11ec-b8db-f875a4974e75"/>
								</gmllr:Referent>
							</odr:referent>
							<odr:referent>
								<gmllr:Referent gml:id="UUID_e702d7ea-25c2-11ec-b304-f875a4974e75">
									<gmllr:location xlink:href="#UUID_e702d7e9-25c2-11ec-b499-f875a4974e75"/>
								</gmllr:Referent>
							</odr:referent>
							<odr:referent>
								<gmllr:Referent gml:id="UUID_e702d7ed-25c2-11ec-ab6b-f875a4974e75">
									<gmllr:location xlink:href="#UUID_e702d7ec-25c2-11ec-9015-f875a4974e75"/>
								</gmllr:Referent>
							</odr:referent>
							<odr:referent>
								<gmllr:Referent gml:id="UUID_e702d7ef-25c2-11ec-b220-f875a4974e75">
									<gmllr:location xlink:href="#UUID_22b57253-b9e2-4405-bab4-a127435c4522"/>
								</gmllr:Referent>
							</odr:referent>
							<odr:referent>
								<gmllr:Referent gml:id="UUID_e702d7f1-25c2-11ec-9c9b-f875a4974e75">
									<gmllr:location xlink:href="#UUID_e702d7f0-25c2-11ec-bd30-f875a4974e75"/>
								</gmllr:Referent>
							</odr:referent>
							<odr:referent>
								<gmllr:Referent gml:id="UUID_e702d7f4-25c2-11ec-9bf6-f875a4974e75">
									<gmllr:location xlink:href="#UUID_e702d7f3-25c2-11ec-9b49-f875a4974e75"/>
								</gmllr:Referent>
							</odr:referent>
							<odr:referent>
								<gmllr:Referent gml:id="UUID_e702d7f7-25c2-11ec-887a-f875a4974e75">
									<gmllr:location xlink:href="#UUID_e702d7f6-25c2-11ec-bd7e-f875a4974e75"/>
								</gmllr:Referent>
							</odr:referent>
							<odr:referent>
								<gmllr:Referent gml:id="UUID_e702d7fa-25c2-11ec-bf05-f875a4974e75">
									<gmllr:location xlink:href="#UUID_e702d7f9-25c2-11ec-ae30-f875a4974e75"/>
								</gmllr:Referent>
							</odr:referent>
							<odr:planView>
								<odr:OpenDRIVECurve gml:id="UUID_2ad015b0-c72e-4a57-a57a-4ca17f2cfa8f">
									<odr:segment>
										<odr:OpenDRIVELine srsName="OpenDRIVELocalSystem" gml:id="UUID_6af6f0f7-f891-466f-871a-284a1977967d">
											<odr:linearReferencing>
												<odr:LinearReferencing>
													<odr:positionExpression>
														<gmllr:PositionExpression>
															<gmllr:linearElement xlink:href="#UUID_aa091071-136a-47b3-b946-417836ae4703"/>
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
											</odr:linearReferencing>
											<odr:heading uom="rad">0.0000000000000000e+00</odr:heading>
											<odr:length uom="m">1.0000000000000000e+02</odr:length>
											<odr:origin>
												<gml:Point gml:id="UUID_6af6f0f7-f891-466f-871a-284a1977967d-0" srsName="OpenDRIVEInertialSystem" srsDimension="2">
													<gml:pos>0 0</gml:pos>
												</gml:Point>
											</odr:origin>
										</odr:OpenDRIVELine>
									</odr:segment>
								</odr:OpenDRIVECurve>
							</odr:planView>
						</odr:OpenDRIVERoadReferenceLine>
					</odr:referenceLine>
				</odr:OpenDRIVERoadShape>
			</odr:roadShape>
		</odr:OpenDRIVEStandardRoad>
	</core:cityObjectMember>
	<core:adeOfCityModel>
		<odr:OpenDRIVEHeader>
			<odr:date>Mon Oct 28 14:02:13 2019</odr:date>
			<odr:east>0.0000000000000000e+00</odr:east>
			<odr:north>0.0000000000000000e+00</odr:north>
			<odr:revMajor>1</odr:revMajor>
			<odr:revMinor>6</odr:revMinor>
			<odr:south>0.0000000000000000e+00</odr:south>
			<odr:version>1.00</odr:version>
			<odr:west>0.0000000000000000e+00</odr:west>
		</odr:OpenDRIVEHeader>
	</core:adeOfCityModel>
</core:CityModel>