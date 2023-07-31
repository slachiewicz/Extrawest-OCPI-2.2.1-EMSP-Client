# EmspSessionsControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSession**](EmspSessionsControllerApi.md#getSession) | **GET** /emsp/api/2.2.1/sessions | 
[**patchSession**](EmspSessionsControllerApi.md#patchSession) | **PATCH** /emsp/api/2.2.1/sessions | 
[**putSession**](EmspSessionsControllerApi.md#putSession) | **PUT** /emsp/api/2.2.1/sessions | 

<a name="getSession"></a>
# **getSession**
> SessionDTO getSession(countryCode, partyId, sessionId)



### Example
```java
// Import classes:
//import com.extrawest.ocpi221emsp_client.client.invoker.ApiException;
//import com.extrawest.ocpi221emsp_client.client.api.EmspSessionsControllerApi;


EmspSessionsControllerApi apiInstance = new EmspSessionsControllerApi();
String countryCode = "countryCode_example"; // String | 
String partyId = "partyId_example"; // String | 
String sessionId = "sessionId_example"; // String | 
try {
    SessionDTO result = apiInstance.getSession(countryCode, partyId, sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmspSessionsControllerApi#getSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryCode** | **String**|  |
 **partyId** | **String**|  |
 **sessionId** | **String**|  |

### Return type

[**SessionDTO**](SessionDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="patchSession"></a>
# **patchSession**
> patchSession(body, countryCode, partyId, sessionId)



### Example
```java
// Import classes:
//import com.extrawest.ocpi221emsp_client.client.invoker.ApiException;
//import com.extrawest.ocpi221emsp_client.client.api.EmspSessionsControllerApi;


EmspSessionsControllerApi apiInstance = new EmspSessionsControllerApi();
SessionDTO body = new SessionDTO(); // SessionDTO | 
String countryCode = "countryCode_example"; // String | 
String partyId = "partyId_example"; // String | 
String sessionId = "sessionId_example"; // String | 
try {
    apiInstance.patchSession(body, countryCode, partyId, sessionId);
} catch (ApiException e) {
    System.err.println("Exception when calling EmspSessionsControllerApi#patchSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SessionDTO**](SessionDTO.md)|  |
 **countryCode** | **String**|  |
 **partyId** | **String**|  |
 **sessionId** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="putSession"></a>
# **putSession**
> putSession(body, countryCode, partyId, sessionId)



### Example
```java
// Import classes:
//import com.extrawest.ocpi221emsp_client.client.invoker.ApiException;
//import com.extrawest.ocpi221emsp_client.client.api.EmspSessionsControllerApi;


EmspSessionsControllerApi apiInstance = new EmspSessionsControllerApi();
SessionDTO body = new SessionDTO(); // SessionDTO | 
String countryCode = "countryCode_example"; // String | 
String partyId = "partyId_example"; // String | 
String sessionId = "sessionId_example"; // String | 
try {
    apiInstance.putSession(body, countryCode, partyId, sessionId);
} catch (ApiException e) {
    System.err.println("Exception when calling EmspSessionsControllerApi#putSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SessionDTO**](SessionDTO.md)|  |
 **countryCode** | **String**|  |
 **partyId** | **String**|  |
 **sessionId** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

