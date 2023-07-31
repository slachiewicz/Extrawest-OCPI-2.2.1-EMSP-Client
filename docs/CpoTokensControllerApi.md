# CpoTokensControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getToken1**](CpoTokensControllerApi.md#getToken1) | **GET** /cpo/api/2.2.1/tokens/{country_code}/{party_id}/{token_uid}/{type} | 
[**patchToken**](CpoTokensControllerApi.md#patchToken) | **PATCH** /cpo/api/2.2.1/tokens/{country_code}/{party_id}/{token_uid}/{type} | 
[**putToken**](CpoTokensControllerApi.md#putToken) | **PUT** /cpo/api/2.2.1/tokens/{country_code}/{party_id}/{token_uid}/{type} | 

<a name="getToken1"></a>
# **getToken1**
> TokenDTO getToken1(countryCode, partyId, tokenUid, type)



### Example
```java
// Import classes:
//import com.extrawest.ocpi221emsp_client.client.invoker.ApiException;
//import com.extrawest.ocpi221emsp_client.client.api.CpoTokensControllerApi;


CpoTokensControllerApi apiInstance = new CpoTokensControllerApi();
String countryCode = "countryCode_example"; // String | 
String partyId = "partyId_example"; // String | 
String tokenUid = "tokenUid_example"; // String | 
String type = "type_example"; // String | 
try {
    TokenDTO result = apiInstance.getToken1(countryCode, partyId, tokenUid, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CpoTokensControllerApi#getToken1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryCode** | **String**|  |
 **partyId** | **String**|  |
 **tokenUid** | **String**|  |
 **type** | **String**|  | [enum: AD_HOC_USER, APP_USER, OTHER, RFID]

### Return type

[**TokenDTO**](TokenDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="patchToken"></a>
# **patchToken**
> patchToken(body, countryCode, partyId, tokenUid, type)



### Example
```java
// Import classes:
//import com.extrawest.ocpi221emsp_client.client.invoker.ApiException;
//import com.extrawest.ocpi221emsp_client.client.api.CpoTokensControllerApi;


CpoTokensControllerApi apiInstance = new CpoTokensControllerApi();
TokenDTO body = new TokenDTO(); // TokenDTO | 
String countryCode = "countryCode_example"; // String | 
String partyId = "partyId_example"; // String | 
String tokenUid = "tokenUid_example"; // String | 
String type = "type_example"; // String | 
try {
    apiInstance.patchToken(body, countryCode, partyId, tokenUid, type);
} catch (ApiException e) {
    System.err.println("Exception when calling CpoTokensControllerApi#patchToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TokenDTO**](TokenDTO.md)|  |
 **countryCode** | **String**|  |
 **partyId** | **String**|  |
 **tokenUid** | **String**|  |
 **type** | **String**|  | [enum: AD_HOC_USER, APP_USER, OTHER, RFID]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="putToken"></a>
# **putToken**
> putToken(body, countryCode, partyId, tokenUid, type)



### Example
```java
// Import classes:
//import com.extrawest.ocpi221emsp_client.client.invoker.ApiException;
//import com.extrawest.ocpi221emsp_client.client.api.CpoTokensControllerApi;


CpoTokensControllerApi apiInstance = new CpoTokensControllerApi();
TokenDTO body = new TokenDTO(); // TokenDTO | 
String countryCode = "countryCode_example"; // String | 
String partyId = "partyId_example"; // String | 
String tokenUid = "tokenUid_example"; // String | 
String type = "type_example"; // String | 
try {
    apiInstance.putToken(body, countryCode, partyId, tokenUid, type);
} catch (ApiException e) {
    System.err.println("Exception when calling CpoTokensControllerApi#putToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TokenDTO**](TokenDTO.md)|  |
 **countryCode** | **String**|  |
 **partyId** | **String**|  |
 **tokenUid** | **String**|  |
 **type** | **String**|  | [enum: AD_HOC_USER, APP_USER, OTHER, RFID]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

