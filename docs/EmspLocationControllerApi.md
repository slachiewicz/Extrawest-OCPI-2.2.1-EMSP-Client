# EmspLocationControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLocationEvseController**](EmspLocationControllerApi.md#getLocationEvseController) | **GET** /emsp/api/2.2.1/locations | 
[**patchLocation**](EmspLocationControllerApi.md#patchLocation) | **PATCH** /emsp/api/2.2.1/locations | 
[**pushLocation**](EmspLocationControllerApi.md#pushLocation) | **PUT** /emsp/api/2.2.1/locations | 

<a name="getLocationEvseController"></a>
# **getLocationEvseController**
> AbstractDomainObject getLocationEvseController(countryCode, partyId, locationId, evseUid, connectorId)



### Example
```java
// Import classes:
//import com.extrawest.ocpi221emsp_client.client.invoker.ApiException;
//import com.extrawest.ocpi221emsp_client.client.api.EmspLocationControllerApi;


EmspLocationControllerApi apiInstance = new EmspLocationControllerApi();
String countryCode = "countryCode_example"; // String | 
String partyId = "partyId_example"; // String | 
String locationId = "locationId_example"; // String | 
String evseUid = "evseUid_example"; // String | 
String connectorId = "connectorId_example"; // String | 
try {
    AbstractDomainObject result = apiInstance.getLocationEvseController(countryCode, partyId, locationId, evseUid, connectorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmspLocationControllerApi#getLocationEvseController");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryCode** | **String**|  |
 **partyId** | **String**|  |
 **locationId** | **String**|  |
 **evseUid** | **String**|  | [optional]
 **connectorId** | **String**|  | [optional]

### Return type

[**AbstractDomainObject**](AbstractDomainObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="patchLocation"></a>
# **patchLocation**
> patchLocation(body, countryCode, partyId, locationId, evseUid, connectorId)



### Example
```java
// Import classes:
//import com.extrawest.ocpi221emsp_client.client.invoker.ApiException;
//import com.extrawest.ocpi221emsp_client.client.api.EmspLocationControllerApi;


EmspLocationControllerApi apiInstance = new EmspLocationControllerApi();
LocationDTO body = new LocationDTO(); // LocationDTO | 
String countryCode = "countryCode_example"; // String | 
String partyId = "partyId_example"; // String | 
String locationId = "locationId_example"; // String | 
String evseUid = "evseUid_example"; // String | 
String connectorId = "connectorId_example"; // String | 
try {
    apiInstance.patchLocation(body, countryCode, partyId, locationId, evseUid, connectorId);
} catch (ApiException e) {
    System.err.println("Exception when calling EmspLocationControllerApi#patchLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LocationDTO**](LocationDTO.md)|  |
 **countryCode** | **String**|  |
 **partyId** | **String**|  |
 **locationId** | **String**|  |
 **evseUid** | **String**|  | [optional]
 **connectorId** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="pushLocation"></a>
# **pushLocation**
> pushLocation(body, countryCode, partyId, locationId, evseUid, connectorId)



### Example
```java
// Import classes:
//import com.extrawest.ocpi221emsp_client.client.invoker.ApiException;
//import com.extrawest.ocpi221emsp_client.client.api.EmspLocationControllerApi;


EmspLocationControllerApi apiInstance = new EmspLocationControllerApi();
LocationDTO body = new LocationDTO(); // LocationDTO | 
String countryCode = "countryCode_example"; // String | 
String partyId = "partyId_example"; // String | 
String locationId = "locationId_example"; // String | 
String evseUid = "evseUid_example"; // String | 
String connectorId = "connectorId_example"; // String | 
try {
    apiInstance.pushLocation(body, countryCode, partyId, locationId, evseUid, connectorId);
} catch (ApiException e) {
    System.err.println("Exception when calling EmspLocationControllerApi#pushLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LocationDTO**](LocationDTO.md)|  |
 **countryCode** | **String**|  |
 **partyId** | **String**|  |
 **locationId** | **String**|  |
 **evseUid** | **String**|  | [optional]
 **connectorId** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

