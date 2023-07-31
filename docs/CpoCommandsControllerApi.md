# CpoCommandsControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postCommand**](CpoCommandsControllerApi.md#postCommand) | **POST** /cpo/api/2.2.1/commands/{command} | 

<a name="postCommand"></a>
# **postCommand**
> CommandResponseDTO postCommand(body, command)



### Example
```java
// Import classes:
//import com.extrawest.ocpi221emsp_client.client.invoker.ApiException;
//import com.extrawest.ocpi221emsp_client.client.api.CpoCommandsControllerApi;


CpoCommandsControllerApi apiInstance = new CpoCommandsControllerApi();
AbstractCommand body = new AbstractCommand(); // AbstractCommand | 
String command = "command_example"; // String | 
try {
    CommandResponseDTO result = apiInstance.postCommand(body, command);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CpoCommandsControllerApi#postCommand");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AbstractCommand**](AbstractCommand.md)|  |
 **command** | **String**|  | [enum: CANCEL_RESERVATION, RESERVE_NOW, START_SESSION, STOP_SESSION, UNLOCK_CONNECTOR]

### Return type

[**CommandResponseDTO**](CommandResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

