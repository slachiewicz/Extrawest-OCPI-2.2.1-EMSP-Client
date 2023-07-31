# CpoCredentialsControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteCredentials1**](CpoCredentialsControllerApi.md#deleteCredentials1) | **DELETE** /cpo/api/2.2.1/credentials | 
[**getCredentials1**](CpoCredentialsControllerApi.md#getCredentials1) | **GET** /cpo/api/2.2.1/credentials | 
[**postCredentials1**](CpoCredentialsControllerApi.md#postCredentials1) | **POST** /cpo/api/2.2.1/credentials | 
[**putCredentials1**](CpoCredentialsControllerApi.md#putCredentials1) | **PUT** /cpo/api/2.2.1/credentials | 

<a name="deleteCredentials1"></a>
# **deleteCredentials1**
> deleteCredentials1(body)



### Example
```java
// Import classes:
//import com.extrawest.ocpi221emsp_client.client.invoker.ApiException;
//import com.extrawest.ocpi221emsp_client.client.api.CpoCredentialsControllerApi;


CpoCredentialsControllerApi apiInstance = new CpoCredentialsControllerApi();
CredentialsDTO body = new CredentialsDTO(); // CredentialsDTO | 
try {
    apiInstance.deleteCredentials1(body);
} catch (ApiException e) {
    System.err.println("Exception when calling CpoCredentialsControllerApi#deleteCredentials1");
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

<a name="getCredentials1"></a>
# **getCredentials1**
> CredentialsDTO getCredentials1()



### Example
```java
// Import classes:
//import com.extrawest.ocpi221emsp_client.client.invoker.ApiException;
//import com.extrawest.ocpi221emsp_client.client.api.CpoCredentialsControllerApi;


CpoCredentialsControllerApi apiInstance = new CpoCredentialsControllerApi();
try {
    CredentialsDTO result = apiInstance.getCredentials1();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CpoCredentialsControllerApi#getCredentials1");
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

<a name="postCredentials1"></a>
# **postCredentials1**
> postCredentials1(body)



### Example
```java
// Import classes:
//import com.extrawest.ocpi221emsp_client.client.invoker.ApiException;
//import com.extrawest.ocpi221emsp_client.client.api.CpoCredentialsControllerApi;


CpoCredentialsControllerApi apiInstance = new CpoCredentialsControllerApi();
CredentialsDTO body = new CredentialsDTO(); // CredentialsDTO | 
try {
    apiInstance.postCredentials1(body);
} catch (ApiException e) {
    System.err.println("Exception when calling CpoCredentialsControllerApi#postCredentials1");
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

<a name="putCredentials1"></a>
# **putCredentials1**
> putCredentials1(body)



### Example
```java
// Import classes:
//import com.extrawest.ocpi221emsp_client.client.invoker.ApiException;
//import com.extrawest.ocpi221emsp_client.client.api.CpoCredentialsControllerApi;


CpoCredentialsControllerApi apiInstance = new CpoCredentialsControllerApi();
CredentialsDTO body = new CredentialsDTO(); // CredentialsDTO | 
try {
    apiInstance.putCredentials1(body);
} catch (ApiException e) {
    System.err.println("Exception when calling CpoCredentialsControllerApi#putCredentials1");
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

