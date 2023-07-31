# EmspTokenControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getToken**](EmspTokenControllerApi.md#getToken) | **GET** /emsp/api/2.2.1/tokens/{date_from}/{date_to}/{offset}/{limit} | 
[**postToken**](EmspTokenControllerApi.md#postToken) | **POST** /emsp/api/2.2.1/tokens/{token_uid}/{type} | 

<a name="getToken"></a>
# **getToken**
> List&lt;TokenDTO&gt; getToken(dateFrom, dateTo, offset, limit)



### Example
```java
// Import classes:
//import com.extrawest.ocpi221emsp_client.client.invoker.ApiException;
//import com.extrawest.ocpi221emsp_client.client.api.EmspTokenControllerApi;


EmspTokenControllerApi apiInstance = new EmspTokenControllerApi();
OffsetDateTime dateFrom = new OffsetDateTime(); // OffsetDateTime | 
OffsetDateTime dateTo = new OffsetDateTime(); // OffsetDateTime | 
Integer offset = 56; // Integer | 
Integer limit = 56; // Integer | 
try {
    List<TokenDTO> result = apiInstance.getToken(dateFrom, dateTo, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmspTokenControllerApi#getToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dateFrom** | **OffsetDateTime**|  |
 **dateTo** | **OffsetDateTime**|  |
 **offset** | **Integer**|  |
 **limit** | **Integer**|  |

### Return type

[**List&lt;TokenDTO&gt;**](TokenDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="postToken"></a>
# **postToken**
> AuthorizationInfoResponseDTO postToken(body, tokenUid, type)



### Example
```java
// Import classes:
//import com.extrawest.ocpi221emsp_client.client.invoker.ApiException;
//import com.extrawest.ocpi221emsp_client.client.api.EmspTokenControllerApi;


EmspTokenControllerApi apiInstance = new EmspTokenControllerApi();
LocationReferencesRequestDTO body = new LocationReferencesRequestDTO(); // LocationReferencesRequestDTO | 
String tokenUid = "tokenUid_example"; // String | 
String type = "type_example"; // String | 
try {
    AuthorizationInfoResponseDTO result = apiInstance.postToken(body, tokenUid, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmspTokenControllerApi#postToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LocationReferencesRequestDTO**](LocationReferencesRequestDTO.md)|  |
 **tokenUid** | **String**|  |
 **type** | **String**|  |

### Return type

[**AuthorizationInfoResponseDTO**](AuthorizationInfoResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

