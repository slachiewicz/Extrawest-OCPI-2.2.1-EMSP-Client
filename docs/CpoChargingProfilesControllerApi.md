# CpoChargingProfilesControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteChargingProfile**](CpoChargingProfilesControllerApi.md#deleteChargingProfile) | **DELETE** /cpo/api/2.2.1/chargingProfiles/{session_id}/{response_url} | 
[**getChargingProfile**](CpoChargingProfilesControllerApi.md#getChargingProfile) | **GET** /cpo/api/2.2.1/chargingProfiles/{session_id}/{duration}/{response_url} | 
[**putChargingProfile1**](CpoChargingProfilesControllerApi.md#putChargingProfile1) | **PUT** /cpo/api/2.2.1/chargingProfiles/{session_id} | 

<a name="deleteChargingProfile"></a>
# **deleteChargingProfile**
> ChargingProfileResponseDTO deleteChargingProfile(sessionId, responseUrl)



### Example
```java
// Import classes:
//import com.extrawest.ocpi221emsp_client.client.invoker.ApiException;
//import com.extrawest.ocpi221emsp_client.client.api.CpoChargingProfilesControllerApi;


CpoChargingProfilesControllerApi apiInstance = new CpoChargingProfilesControllerApi();
String sessionId = "sessionId_example"; // String | 
String responseUrl = "responseUrl_example"; // String | 
try {
    ChargingProfileResponseDTO result = apiInstance.deleteChargingProfile(sessionId, responseUrl);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CpoChargingProfilesControllerApi#deleteChargingProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **String**|  |
 **responseUrl** | **String**|  |

### Return type

[**ChargingProfileResponseDTO**](ChargingProfileResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getChargingProfile"></a>
# **getChargingProfile**
> ChargingProfileResponseDTO getChargingProfile(sessionId, duration, responseUrl)



### Example
```java
// Import classes:
//import com.extrawest.ocpi221emsp_client.client.invoker.ApiException;
//import com.extrawest.ocpi221emsp_client.client.api.CpoChargingProfilesControllerApi;


CpoChargingProfilesControllerApi apiInstance = new CpoChargingProfilesControllerApi();
String sessionId = "sessionId_example"; // String | 
Integer duration = 56; // Integer | 
String responseUrl = "responseUrl_example"; // String | 
try {
    ChargingProfileResponseDTO result = apiInstance.getChargingProfile(sessionId, duration, responseUrl);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CpoChargingProfilesControllerApi#getChargingProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **String**|  |
 **duration** | **Integer**|  |
 **responseUrl** | **String**|  |

### Return type

[**ChargingProfileResponseDTO**](ChargingProfileResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="putChargingProfile1"></a>
# **putChargingProfile1**
> ChargingProfileResponseDTO putChargingProfile1(body, sessionId)



### Example
```java
// Import classes:
//import com.extrawest.ocpi221emsp_client.client.invoker.ApiException;
//import com.extrawest.ocpi221emsp_client.client.api.CpoChargingProfilesControllerApi;


CpoChargingProfilesControllerApi apiInstance = new CpoChargingProfilesControllerApi();
SetChargingProfileRequestDTO body = new SetChargingProfileRequestDTO(); // SetChargingProfileRequestDTO | 
String sessionId = "sessionId_example"; // String | 
try {
    ChargingProfileResponseDTO result = apiInstance.putChargingProfile1(body, sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CpoChargingProfilesControllerApi#putChargingProfile1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SetChargingProfileRequestDTO**](SetChargingProfileRequestDTO.md)|  |
 **sessionId** | **String**|  |

### Return type

[**ChargingProfileResponseDTO**](ChargingProfileResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

