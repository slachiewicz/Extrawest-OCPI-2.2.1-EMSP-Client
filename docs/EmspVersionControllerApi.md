# EmspVersionControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getVersionDetails**](EmspVersionControllerApi.md#getVersionDetails) | **GET** /emsp/api/2.2.1/versions/details/{version} | 

<a name="getVersionDetails"></a>
# **getVersionDetails**
> VersionDetailsResponseDTO getVersionDetails(version)



### Example
```java
// Import classes:
//import com.extrawest.ocpi221emsp_client.client.invoker.ApiException;
//import com.extrawest.ocpi221emsp_client.client.api.EmspVersionControllerApi;


EmspVersionControllerApi apiInstance = new EmspVersionControllerApi();
String version = "version_example"; // String | 
try {
    VersionDetailsResponseDTO result = apiInstance.getVersionDetails(version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmspVersionControllerApi#getVersionDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **String**|  | [enum: 2.0, 2.1, 2.1.1, 2.2, 2.2.1]

### Return type

[**VersionDetailsResponseDTO**](VersionDetailsResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

