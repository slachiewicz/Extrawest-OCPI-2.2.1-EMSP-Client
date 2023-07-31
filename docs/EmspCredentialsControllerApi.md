# EmspCredentialsControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteCredentials**](EmspCredentialsControllerApi.md#deleteCredentials) | **DELETE** /emsp/api/2.2.1/credentials | 
[**getCredentials**](EmspCredentialsControllerApi.md#getCredentials) | **GET** /emsp/api/2.2.1/credentials | 
[**postCredentials**](EmspCredentialsControllerApi.md#postCredentials) | **POST** /emsp/api/2.2.1/credentials | 
[**putCredentials**](EmspCredentialsControllerApi.md#putCredentials) | **PUT** /emsp/api/2.2.1/credentials | 

<a name="deleteCredentials"></a>
# **deleteCredentials**
> deleteCredentials(body)



### Example
```java
// Import classes:
//import com.extrawest.ocpi221emsp_client.client.invoker.ApiException;
//import com.extrawest.ocpi221emsp_client.client.api.EmspCredentialsControllerApi;


EmspCredentialsControllerApi apiInstance = new EmspCredentialsControllerApi();
CredentialsDTO body = new CredentialsDTO(); // CredentialsDTO | 
try {
    apiInstance.deleteCredentials(body);
} catch (ApiException e) {
    System.err.println("Exception when calling EmspCredentialsControllerApi#deleteCredentials");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CredentialsDTO**](CredentialsDTO.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="getCredentials"></a>
# **getCredentials**
> CredentialsDTO getCredentials()



### Example
```java
// Import classes:
//import com.extrawest.ocpi221emsp_client.client.invoker.ApiException;
//import com.extrawest.ocpi221emsp_client.client.api.EmspCredentialsControllerApi;


EmspCredentialsControllerApi apiInstance = new EmspCredentialsControllerApi();
try {
    CredentialsDTO result = apiInstance.getCredentials();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmspCredentialsControllerApi#getCredentials");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CredentialsDTO**](CredentialsDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="postCredentials"></a>
# **postCredentials**
> postCredentials(body)



### Example
```java
// Import classes:
//import com.extrawest.ocpi221emsp_client.client.invoker.ApiException;
//import com.extrawest.ocpi221emsp_client.client.api.EmspCredentialsControllerApi;


EmspCredentialsControllerApi apiInstance = new EmspCredentialsControllerApi();
CredentialsDTO body = new CredentialsDTO(); // CredentialsDTO | 
try {
    apiInstance.postCredentials(body);
} catch (ApiException e) {
    System.err.println("Exception when calling EmspCredentialsControllerApi#postCredentials");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CredentialsDTO**](CredentialsDTO.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="putCredentials"></a>
# **putCredentials**
> putCredentials(body)



### Example
```java
// Import classes:
//import com.extrawest.ocpi221emsp_client.client.invoker.ApiException;
//import com.extrawest.ocpi221emsp_client.client.api.EmspCredentialsControllerApi;


EmspCredentialsControllerApi apiInstance = new EmspCredentialsControllerApi();
CredentialsDTO body = new CredentialsDTO(); // CredentialsDTO | 
try {
    apiInstance.putCredentials(body);
} catch (ApiException e) {
    System.err.println("Exception when calling EmspCredentialsControllerApi#putCredentials");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CredentialsDTO**](CredentialsDTO.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

