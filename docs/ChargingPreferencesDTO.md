# ChargingPreferencesDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**profileType** | [**ProfileTypeEnum**](#ProfileTypeEnum) |  | 
**departureTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**energyNeed** | **Float** |  |  [optional]
**dischargeAllowed** | **Boolean** |  |  [optional]

<a name="ProfileTypeEnum"></a>
## Enum: ProfileTypeEnum
Name | Value
---- | -----
CHEAP | &quot;CHEAP&quot;
FAST | &quot;FAST&quot;
GREEN | &quot;GREEN&quot;
REGULAR | &quot;REGULAR&quot;
