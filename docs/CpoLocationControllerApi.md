# CpoLocationControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLocationEvseController1**](CpoLocationControllerApi.md#getLocationEvseController1) | **GET** /cpo/api/2.2.1/locations | 
[**getLocations**](CpoLocationControllerApi.md#getLocations) | **GET** /cpo/api/2.2.1/locations/getLocations | 

<a name="getLocationEvseController1"></a>
# **getLocationEvseController1**
> AbstractDomainObject getLocationEvseController1(locationId, evseUid, connectorId)



### Example
```java
// Import classes:
//import com.extrawest.ocpi221emsp_client.client.invoker.ApiException;
//import com.extrawest.ocpi221emsp_client.client.api.CpoLocationControllerApi;


CpoLocationControllerApi apiInstance = new CpoLocationControllerApi();
String locationId = "locationId_example"; // String | 
String evseUid = "evseUid_example"; // String | 
String connectorId = "connectorId_example"; // String | 
try {
    AbstractDomainObject result = apiInstance.getLocationEvseController1(locationId, evseUid, connectorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CpoLocationControllerApi#getLocationEvseController1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

<a name="getLocations"></a>
# **getLocations**
> List&lt;LocationDTO&gt; getLocations(dateFrom, dateTo, offset, limit)



### Example
```java
// Import classes:
//import com.extrawest.ocpi221emsp_client.client.invoker.ApiException;
//import com.extrawest.ocpi221emsp_client.client.api.CpoLocationControllerApi;


CpoLocationControllerApi apiInstance = new CpoLocationControllerApi();
OffsetDateTime dateFrom = new OffsetDateTime(); // OffsetDateTime | 
OffsetDateTime dateTo = new OffsetDateTime(); // OffsetDateTime | 
Integer offset = 0; // Integer | 
Integer limit = 56; // Integer | 
try {
    List<LocationDTO> result = apiInstance.getLocations(dateFrom, dateTo, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CpoLocationControllerApi#getLocations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dateFrom** | **OffsetDateTime**|  | [optional]
 **dateTo** | **OffsetDateTime**|  | [optional]
 **offset** | **Integer**|  | [optional] [default to 0]
 **limit** | **Integer**|  | [optional]

### Return type

[**List&lt;LocationDTO&gt;**](LocationDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

