# ClientInfoControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getHubClientInfo**](ClientInfoControllerApi.md#getHubClientInfo) | **GET** /api/2.2.1/hubClientInfo/{country_code}/{party_id} | 
[**putHubClientInfo**](ClientInfoControllerApi.md#putHubClientInfo) | **PUT** /api/2.2.1/hubClientInfo/{country_code}/{party_id} | 

<a name="getHubClientInfo"></a>
# **getHubClientInfo**
> ClientInfoDTO getHubClientInfo(countryCode, partyId)



### Example
```java
// Import classes:
//import com.extrawest.ocpi221emsp_client.client.invoker.ApiException;
//import com.extrawest.ocpi221emsp_client.client.api.ClientInfoControllerApi;


ClientInfoControllerApi apiInstance = new ClientInfoControllerApi();
String countryCode = "countryCode_example"; // String | 
String partyId = "partyId_example"; // String | 
try {
    ClientInfoDTO result = apiInstance.getHubClientInfo(countryCode, partyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientInfoControllerApi#getHubClientInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryCode** | **String**|  |
 **partyId** | **String**|  |

### Return type

[**ClientInfoDTO**](ClientInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="putHubClientInfo"></a>
# **putHubClientInfo**
> putHubClientInfo(countryCode, partyId)



### Example
```java
// Import classes:
//import com.extrawest.ocpi221emsp_client.client.invoker.ApiException;
//import com.extrawest.ocpi221emsp_client.client.api.ClientInfoControllerApi;


ClientInfoControllerApi apiInstance = new ClientInfoControllerApi();
String countryCode = "countryCode_example"; // String | 
String partyId = "partyId_example"; // String | 
try {
    apiInstance.putHubClientInfo(countryCode, partyId);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientInfoControllerApi#putHubClientInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryCode** | **String**|  |
 **partyId** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

