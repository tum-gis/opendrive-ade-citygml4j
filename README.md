# opendrive-ade-citygml4j

<a href="https://github.com/tum-gis/opendrive-ade-citygml4j/actions/workflows/build.yml" title="Build Status"><img src="https://img.shields.io/github/workflow/status/tum-gis/opendrive-ade-citygml4j/Build"></a>
<a href="https://jitpack.io/#tum-gis/opendrive-ade-citygml4j" title="JitPack"><img src="https://jitpack.io/v/tum-gis/opendrive-ade-citygml4j.svg?style=for-the-badge"></a>

> **_⚠:_** This is work-in-progress for a proof of concept.

## Overview
*opendrive-ade-citygml4j* is a Java module implementing the conceptual CityGML Application Domain Extension (ADE) model of the [ASAM OpenDRIVE 1.6](https://www.asam.net/standards/detail/opendrive/) standard. It is built upon Claus Nagel's development branch of [Open Source Java API for CityGML3.0](https://github.com/citygml4j/citygml4j/tree/citygml3-devel).

The project serves as a proof of concept as part of an iterative process of bridging the semantic and conceptual differences between the [CityGML3.0](https://docs.ogc.org/is/20-010/20-010.html) standard and the [ASAM OpenDRIVE 1.6](https://www.asam.net/standards/detail/opendrive/) standard.

## Module structure
*opendrive-ade-citygml4j* follows the package structure of the conceptual OpenDRIVE ADE model. Additionally, *opendrive-ade-citygml4j* includes as submodule an implementation of the [GML3.3](https://portal.ogc.org/files/?artifact_id=46568) XML schema of the Linear Referencing model, which is defined in the ISO19148 standard.

## Module dependencies
The *opendrive-ade-citygml4* main module depends on [Open Source Java API for CityGML3.0](https://github.com/citygml4j/citygml4j/tree/citygml3-devel).
The submodule *gml-linear-referencing* directly depends on Claus Nagel's [gml-objects](https://github.com/xmlobjects/gml-objects) GML implementation and extends it with GML3.3 Linear Referencing.
<p align="center">
  <img src="./docs/modules.svg" width="50%">
</p>

## Current state of the work
Currently, *opendrive-ade-citygml4j* is only partly implementing the conceptual OpenDRIVE ADE model and focusses on the most relevant objects, which are required to map the most simple OpenDRIVE datasets to a respective CityGML OpenDRIVE ADE representation. 

Following concepts are currently implemented:
* Roads/road geometry
* Lanes/lane geometry
* Linear referencing
