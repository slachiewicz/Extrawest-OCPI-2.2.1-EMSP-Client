package com.extrawest.ocpi221emsp_client.client.api;

import com.extrawest.ocpi221emsp_client.client.invoker.ApiClient;

import com.extrawest.ocpi221emsp_client.client.model.ChargingPreferencesDTO;
import org.threeten.bp.OffsetDateTime;
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


@Component("com.extrawest.ocpi221emsp_client.client.api.CpoSessionsControllerApi")
public class CpoSessionsControllerApi {
    private ApiClient apiClient;

    public CpoSessionsControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public CpoSessionsControllerApi(ApiClient apiClient) {
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
     * @param dateFrom  (required)
     * @param dateTo  (optional)
     * @param offset  (optional, default to 0)
     * @param limit  (optional)
     * @return List&lt;SessionDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<SessionDTO> getSessions(OffsetDateTime dateFrom, OffsetDateTime dateTo, Integer offset, Integer limit) throws RestClientException {
        return getSessionsWithHttpInfo(dateFrom, dateTo, offset, limit).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param dateFrom  (required)
     * @param dateTo  (optional)
     * @param offset  (optional, default to 0)
     * @param limit  (optional)
     * @return ResponseEntity&lt;List&lt;SessionDTO&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<SessionDTO>> getSessionsWithHttpInfo(OffsetDateTime dateFrom, OffsetDateTime dateTo, Integer offset, Integer limit) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'dateFrom' is set
        if (dateFrom == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dateFrom' when calling getSessions");
        }
        String path = UriComponentsBuilder.fromPath("/cpo/api/2.2.1/sessions").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date_from", dateFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date_to", dateTo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));

        final String[] accepts = { 
            "*/*"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<SessionDTO>> returnType = new ParameterizedTypeReference<List<SessionDTO>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @param sessionId  (required)
     * @return ChargingPreferencesDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ChargingPreferencesDTO putChargingPreferences(ChargingPreferencesDTO body, String sessionId) throws RestClientException {
        return putChargingPreferencesWithHttpInfo(body, sessionId).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @param sessionId  (required)
     * @return ResponseEntity&lt;ChargingPreferencesDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ChargingPreferencesDTO> putChargingPreferencesWithHttpInfo(ChargingPreferencesDTO body, String sessionId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling putChargingPreferences");
        }
        // verify the required parameter 'sessionId' is set
        if (sessionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sessionId' when calling putChargingPreferences");
        }
        String path = UriComponentsBuilder.fromPath("/cpo/api/2.2.1/sessions").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "session_id", sessionId));

        final String[] accepts = { 
            "*/*"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<ChargingPreferencesDTO> returnType = new ParameterizedTypeReference<ChargingPreferencesDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
