# EmspChargingProfilesControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postChargingProfile**](EmspChargingProfilesControllerApi.md#postChargingProfile) | **POST** /emsp/api/2.2.1/chargingProfiles | 
[**putChargingProfile**](EmspChargingProfilesControllerApi.md#putChargingProfile) | **PUT** /emsp/api/2.2.1/chargingProfiles/{session_id} | 

<a name="postChargingProfile"></a>
# **postChargingProfile**
> ResponseFormat postChargingProfile(body)



### Example
```java
// Import classes:
//import com.extrawest.ocpi221emsp_client.client.invoker.ApiException;
//import com.extrawest.ocpi221emsp_client.client.api.EmspChargingProfilesControllerApi;


EmspChargingProfilesControllerApi apiInstance = new EmspChargingProfilesControllerApi();
AbstractProfileResult body = new AbstractProfileResult(); // AbstractProfileResult | 
try {
    ResponseFormat result = apiInstance.postChargingProfile(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmspChargingProfilesControllerApi#postChargingProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AbstractProfileResult**](AbstractProfileResult.md)|  |

### Return type

[**ResponseFormat**](ResponseFormat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="putChargingProfile"></a>
# **putChargingProfile**
> ResponseFormat putChargingProfile(body, sessionId)



### Example
```java
// Import classes:
//import com.extrawest.ocpi221emsp_client.client.invoker.ApiException;
//import com.extrawest.ocpi221emsp_client.client.api.EmspChargingProfilesControllerApi;


EmspChargingProfilesControllerApi apiInstance = new EmspChargingProfilesControllerApi();
ActiveChargingProfileRequestDTO body = new ActiveChargingProfileRequestDTO(); // ActiveChargingProfileRequestDTO | 
String sessionId = "sessionId_example"; // String | 
try {
    ResponseFormat result = apiInstance.putChargingProfile(body, sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmspChargingProfilesControllerApi#putChargingProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ActiveChargingProfileRequestDTO**](ActiveChargingProfileRequestDTO.md)|  |
 **sessionId** | **String**|  |

### Return type

[**ResponseFormat**](ResponseFormat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

