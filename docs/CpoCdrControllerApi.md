# CpoCdrControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCdr1**](CpoCdrControllerApi.md#getCdr1) | **GET** /cpo/api/2.2.1/cdr | 

<a name="getCdr1"></a>
# **getCdr1**
> List&lt;CdrDTO&gt; getCdr1(dateFrom, dateTo, offset, limit)



### Example
```java
// Import classes:
//import com.extrawest.ocpi221emsp_client.client.invoker.ApiException;
//import com.extrawest.ocpi221emsp_client.client.api.CpoCdrControllerApi;


CpoCdrControllerApi apiInstance = new CpoCdrControllerApi();
OffsetDateTime dateFrom = new OffsetDateTime(); // OffsetDateTime | 
OffsetDateTime dateTo = new OffsetDateTime(); // OffsetDateTime | 
Integer offset = 56; // Integer | 
Integer limit = 56; // Integer | 
try {
    List<CdrDTO> result = apiInstance.getCdr1(dateFrom, dateTo, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CpoCdrControllerApi#getCdr1");
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

[**List&lt;CdrDTO&gt;**](CdrDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

