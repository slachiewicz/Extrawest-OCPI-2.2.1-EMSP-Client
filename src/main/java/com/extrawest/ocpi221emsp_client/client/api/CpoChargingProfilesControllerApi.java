package com.extrawest.ocpi221emsp_client.client.api;

import com.extrawest.ocpi221emsp_client.client.invoker.ApiClient;

import com.extrawest.ocpi221emsp_client.client.model.ChargingProfileResponseDTO;
import com.extrawest.ocpi221emsp_client.client.model.SetChargingProfileRequestDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;


@Component("com.extrawest.ocpi221emsp_client.client.api.CpoChargingProfilesControllerApi")
public class CpoChargingProfilesControllerApi {
    private ApiClient apiClient;

    public CpoChargingProfilesControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public CpoChargingProfilesControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param sessionId  (required)
     * @param responseUrl  (required)
     * @return ChargingProfileResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ChargingProfileResponseDTO deleteChargingProfile(String sessionId, String responseUrl) throws RestClientException {
        return deleteChargingProfileWithHttpInfo(sessionId, responseUrl).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param sessionId  (required)
     * @param responseUrl  (required)
     * @return ResponseEntity&lt;ChargingProfileResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ChargingProfileResponseDTO> deleteChargingProfileWithHttpInfo(String sessionId, String responseUrl) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'sessionId' is set
        if (sessionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sessionId' when calling deleteChargingProfile");
        }
        // verify the required parameter 'responseUrl' is set
        if (responseUrl == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'responseUrl' when calling deleteChargingProfile");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("session_id", sessionId);
        uriVariables.put("response_url", responseUrl);
        String path = UriComponentsBuilder.fromPath("/cpo/api/2.2.1/chargingProfiles/{session_id}/{response_url}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "*/*"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<ChargingProfileResponseDTO> returnType = new ParameterizedTypeReference<ChargingProfileResponseDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param sessionId  (required)
     * @param duration  (required)
     * @param responseUrl  (required)
     * @return ChargingProfileResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ChargingProfileResponseDTO getChargingProfile(String sessionId, Integer duration, String responseUrl) throws RestClientException {
        return getChargingProfileWithHttpInfo(sessionId, duration, responseUrl).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param sessionId  (required)
     * @param duration  (required)
     * @param responseUrl  (required)
     * @return ResponseEntity&lt;ChargingProfileResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ChargingProfileResponseDTO> getChargingProfileWithHttpInfo(String sessionId, Integer duration, String responseUrl) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'sessionId' is set
        if (sessionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sessionId' when calling getChargingProfile");
        }
        // verify the required parameter 'duration' is set
        if (duration == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'duration' when calling getChargingProfile");
        }
        // verify the required parameter 'responseUrl' is set
        if (responseUrl == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'responseUrl' when calling getChargingProfile");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("session_id", sessionId);
        uriVariables.put("duration", duration);
        uriVariables.put("response_url", responseUrl);
        String path = UriComponentsBuilder.fromPath("/cpo/api/2.2.1/chargingProfiles/{session_id}/{duration}/{response_url}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "*/*"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<ChargingProfileResponseDTO> returnType = new ParameterizedTypeReference<ChargingProfileResponseDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @param sessionId  (required)
     * @return ChargingProfileResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ChargingProfileResponseDTO putChargingProfile1(SetChargingProfileRequestDTO body, String sessionId) throws RestClientException {
        return putChargingProfile1WithHttpInfo(body, sessionId).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @param sessionId  (required)
     * @return ResponseEntity&lt;ChargingProfileResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ChargingProfileResponseDTO> putChargingProfile1WithHttpInfo(SetChargingProfileRequestDTO body, String sessionId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling putChargingProfile1");
        }
        // verify the required parameter 'sessionId' is set
        if (sessionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sessionId' when calling putChargingProfile1");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("session_id", sessionId);
        String path = UriComponentsBuilder.fromPath("/cpo/api/2.2.1/chargingProfiles/{session_id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "*/*"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<ChargingProfileResponseDTO> returnType = new ParameterizedTypeReference<ChargingProfileResponseDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
