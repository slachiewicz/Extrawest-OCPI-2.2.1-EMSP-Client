# EmspCdrControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCdr**](EmspCdrControllerApi.md#getCdr) | **GET** /emsp/api/2.2.1/cdr/{id} | 
[**postCdr**](EmspCdrControllerApi.md#postCdr) | **POST** /emsp/api/2.2.1/cdr | 

<a name="getCdr"></a>
# **getCdr**
> CdrDTO getCdr(id)



### Example
```java
// Import classes:
//import com.extrawest.ocpi221emsp_client.client.invoker.ApiException;
//import com.extrawest.ocpi221emsp_client.client.api.EmspCdrControllerApi;


EmspCdrControllerApi apiInstance = new EmspCdrControllerApi();
String id = "id_example"; // String | 
try {
    CdrDTO result = apiInstance.getCdr(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmspCdrControllerApi#getCdr");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**CdrDTO**](CdrDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="postCdr"></a>
# **postCdr**
> String postCdr(body)



### Example
```java
// Import classes:
//import com.extrawest.ocpi221emsp_client.client.invoker.ApiException;
//import com.extrawest.ocpi221emsp_client.client.api.EmspCdrControllerApi;


EmspCdrControllerApi apiInstance = new EmspCdrControllerApi();
CdrDTO body = new CdrDTO(); // CdrDTO | 
try {
    String result = apiInstance.postCdr(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmspCdrControllerApi#postCdr");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CdrDTO**](CdrDTO.md)|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

