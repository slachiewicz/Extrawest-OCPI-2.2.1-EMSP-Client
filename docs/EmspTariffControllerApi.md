# EmspTariffControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteTariff**](EmspTariffControllerApi.md#deleteTariff) | **DELETE** /emsp/api/2.2.1/tariffs | 
[**getTariff**](EmspTariffControllerApi.md#getTariff) | **GET** /emsp/api/2.2.1/tariffs | 
[**saveTariff**](EmspTariffControllerApi.md#saveTariff) | **PUT** /emsp/api/2.2.1/tariffs | 

<a name="deleteTariff"></a>
# **deleteTariff**
> deleteTariff(countryCode, partyId, tariffId)



### Example
```java
// Import classes:
//import com.extrawest.ocpi221emsp_client.client.invoker.ApiException;
//import com.extrawest.ocpi221emsp_client.client.api.EmspTariffControllerApi;


EmspTariffControllerApi apiInstance = new EmspTariffControllerApi();
String countryCode = "countryCode_example"; // String | 
String partyId = "partyId_example"; // String | 
String tariffId = "tariffId_example"; // String | 
try {
    apiInstance.deleteTariff(countryCode, partyId, tariffId);
} catch (ApiException e) {
    System.err.println("Exception when calling EmspTariffControllerApi#deleteTariff");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryCode** | **String**|  |
 **partyId** | **String**|  |
 **tariffId** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getTariff"></a>
# **getTariff**
> TariffDTO getTariff(countryCode, partyId, tariffId)



### Example
```java
// Import classes:
//import com.extrawest.ocpi221emsp_client.client.invoker.ApiException;
//import com.extrawest.ocpi221emsp_client.client.api.EmspTariffControllerApi;


EmspTariffControllerApi apiInstance = new EmspTariffControllerApi();
String countryCode = "countryCode_example"; // String | 
String partyId = "partyId_example"; // String | 
String tariffId = "tariffId_example"; // String | 
try {
    TariffDTO result = apiInstance.getTariff(countryCode, partyId, tariffId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmspTariffControllerApi#getTariff");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryCode** | **String**|  |
 **partyId** | **String**|  |
 **tariffId** | **String**|  |

### Return type

[**TariffDTO**](TariffDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="saveTariff"></a>
# **saveTariff**
> saveTariff(body, countryCode, partyId, tariffId)



### Example
```java
// Import classes:
//import com.extrawest.ocpi221emsp_client.client.invoker.ApiException;
//import com.extrawest.ocpi221emsp_client.client.api.EmspTariffControllerApi;


EmspTariffControllerApi apiInstance = new EmspTariffControllerApi();
TariffDTO body = new TariffDTO(); // TariffDTO | 
String countryCode = "countryCode_example"; // String | 
String partyId = "partyId_example"; // String | 
String tariffId = "tariffId_example"; // String | 
try {
    apiInstance.saveTariff(body, countryCode, partyId, tariffId);
} catch (ApiException e) {
    System.err.println("Exception when calling EmspTariffControllerApi#saveTariff");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TariffDTO**](TariffDTO.md)|  |
 **countryCode** | **String**|  |
 **partyId** | **String**|  |
 **tariffId** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

