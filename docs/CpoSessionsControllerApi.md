# CpoSessionsControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSessions**](CpoSessionsControllerApi.md#getSessions) | **GET** /cpo/api/2.2.1/sessions | 
[**putChargingPreferences**](CpoSessionsControllerApi.md#putChargingPreferences) | **PUT** /cpo/api/2.2.1/sessions | 

<a name="getSessions"></a>
# **getSessions**
> List&lt;SessionDTO&gt; getSessions(dateFrom, dateTo, offset, limit)



### Example
```java
// Import classes:
//import com.extrawest.ocpi221emsp_client.client.invoker.ApiException;
//import com.extrawest.ocpi221emsp_client.client.api.CpoSessionsControllerApi;


CpoSessionsControllerApi apiInstance = new CpoSessionsControllerApi();
OffsetDateTime dateFrom = new OffsetDateTime(); // OffsetDateTime | 
OffsetDateTime dateTo = new OffsetDateTime(); // OffsetDateTime | 
Integer offset = 0; // Integer | 
Integer limit = 56; // Integer | 
try {
    List<SessionDTO> result = apiInstance.getSessions(dateFrom, dateTo, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CpoSessionsControllerApi#getSessions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dateFrom** | **OffsetDateTime**|  |
 **dateTo** | **OffsetDateTime**|  | [optional]
 **offset** | **Integer**|  | [optional] [default to 0]
 **limit** | **Integer**|  | [optional]

### Return type

[**List&lt;SessionDTO&gt;**](SessionDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="putChargingPreferences"></a>
# **putChargingPreferences**
> ChargingPreferencesDTO putChargingPreferences(body, sessionId)



### Example
```java
// Import classes:
//import com.extrawest.ocpi221emsp_client.client.invoker.ApiException;
//import com.extrawest.ocpi221emsp_client.client.api.CpoSessionsControllerApi;


CpoSessionsControllerApi apiInstance = new CpoSessionsControllerApi();
ChargingPreferencesDTO body = new ChargingPreferencesDTO(); // ChargingPreferencesDTO | 
String sessionId = "sessionId_example"; // String | 
try {
    ChargingPreferencesDTO result = apiInstance.putChargingPreferences(body, sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CpoSessionsControllerApi#putChargingPreferences");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ChargingPreferencesDTO**](ChargingPreferencesDTO.md)|  |
 **sessionId** | **String**|  |

### Return type

[**ChargingPreferencesDTO**](ChargingPreferencesDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

