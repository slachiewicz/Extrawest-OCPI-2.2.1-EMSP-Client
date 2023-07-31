package com.extrawest.ocpi221emsp_client.client.api;

import com.extrawest.ocpi221emsp_client.client.invoker.ApiClient;

import com.extrawest.ocpi221emsp_client.client.model.SessionDTO;

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


@Component("com.extrawest.ocpi221emsp_client.client.api.EmspSessionsControllerApi")
public class EmspSessionsControllerApi {
    private ApiClient apiClient;

    public EmspSessionsControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public EmspSessionsControllerApi(ApiClient apiClient) {
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
     * @param countryCode  (required)
     * @param partyId  (required)
     * @param sessionId  (required)
     * @return SessionDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SessionDTO getSession(String countryCode, String partyId, String sessionId) throws RestClientException {
        return getSessionWithHttpInfo(countryCode, partyId, sessionId).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param countryCode  (required)
     * @param partyId  (required)
     * @param sessionId  (required)
     * @return ResponseEntity&lt;SessionDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SessionDTO> getSessionWithHttpInfo(String countryCode, String partyId, String sessionId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'countryCode' when calling getSession");
        }
        // verify the required parameter 'partyId' is set
        if (partyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partyId' when calling getSession");
        }
        // verify the required parameter 'sessionId' is set
        if (sessionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sessionId' when calling getSession");
        }
        String path = UriComponentsBuilder.fromPath("/emsp/api/2.2.1/sessions").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "country_code", countryCode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "party_id", partyId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "session_id", sessionId));

        final String[] accepts = { 
            "*/*"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<SessionDTO> returnType = new ParameterizedTypeReference<SessionDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @param countryCode  (required)
     * @param partyId  (required)
     * @param sessionId  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void patchSession(SessionDTO body, String countryCode, String partyId, String sessionId) throws RestClientException {
        patchSessionWithHttpInfo(body, countryCode, partyId, sessionId);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @param countryCode  (required)
     * @param partyId  (required)
     * @param sessionId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> patchSessionWithHttpInfo(SessionDTO body, String countryCode, String partyId, String sessionId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling patchSession");
        }
        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'countryCode' when calling patchSession");
        }
        // verify the required parameter 'partyId' is set
        if (partyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partyId' when calling patchSession");
        }
        // verify the required parameter 'sessionId' is set
        if (sessionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sessionId' when calling patchSession");
        }
        String path = UriComponentsBuilder.fromPath("/emsp/api/2.2.1/sessions").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "country_code", countryCode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "party_id", partyId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "session_id", sessionId));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @param countryCode  (required)
     * @param partyId  (required)
     * @param sessionId  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void putSession(SessionDTO body, String countryCode, String partyId, String sessionId) throws RestClientException {
        putSessionWithHttpInfo(body, countryCode, partyId, sessionId);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @param countryCode  (required)
     * @param partyId  (required)
     * @param sessionId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> putSessionWithHttpInfo(SessionDTO body, String countryCode, String partyId, String sessionId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling putSession");
        }
        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'countryCode' when calling putSession");
        }
        // verify the required parameter 'partyId' is set
        if (partyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partyId' when calling putSession");
        }
        // verify the required parameter 'sessionId' is set
        if (sessionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sessionId' when calling putSession");
        }
        String path = UriComponentsBuilder.fromPath("/emsp/api/2.2.1/sessions").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "country_code", countryCode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "party_id", partyId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "session_id", sessionId));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
