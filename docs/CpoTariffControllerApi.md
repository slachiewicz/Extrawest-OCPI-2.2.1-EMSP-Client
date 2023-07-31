# CpoTariffControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTariffs**](CpoTariffControllerApi.md#getTariffs) | **GET** /cpo/api/2.2.1/tariffs | 

<a name="getTariffs"></a>
# **getTariffs**
> List&lt;TariffDTO&gt; getTariffs(dateFrom, dateTo, offset, limit)



### Example
```java
// Import classes:
//import com.extrawest.ocpi221emsp_client.client.invoker.ApiException;
//import com.extrawest.ocpi221emsp_client.client.api.CpoTariffControllerApi;


CpoTariffControllerApi apiInstance = new CpoTariffControllerApi();
OffsetDateTime dateFrom = new OffsetDateTime(); // OffsetDateTime | 
OffsetDateTime dateTo = new OffsetDateTime(); // OffsetDateTime | 
Integer offset = 0; // Integer | 
Integer limit = 56; // Integer | 
try {
    List<TariffDTO> result = apiInstance.getTariffs(dateFrom, dateTo, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CpoTariffControllerApi#getTariffs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dateFrom** | **OffsetDateTime**|  | [optional]
 **dateTo** | **OffsetDateTime**|  | [optional]
 **offset** | **Integer**|  | [optional] [default to 0]
 **limit** | **Integer**|  | [optional]

### Return type

[**List&lt;TariffDTO&gt;**](TariffDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

