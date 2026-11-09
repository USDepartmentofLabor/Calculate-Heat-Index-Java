>[!WARNING]
>This repository has been archived and is no longer maintained. The code is provided for historical reference and may contain unpatched or unknown vulnerabilities. It should ***not*** be used in production systems.

CalculateHeatIndex-Java
=======================

Java Class that will calculate the heat index.

This code was pulled from [the OSHA Heat Safety Android app](https://github.com/USDepartmentofLabor/OSHA-Heat-Safety-Android-En) to make it easy to reuse this functionality in your own app.

The method `heatIndexCal` takes two double values: temperature and relative humidity.

#### Example:

    calculatedHeatIndex = calIndex.heatIndexCal(temperature, relativeHumidity);
