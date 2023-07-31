package com.extrawest.ocpi221emsp_client.client.api;

import com.extrawest.ocpi221emsp_client.client.invoker.ApiClient;

import com.extrawest.ocpi221emsp_client.client.model.AbstractDomainObject;
import com.extrawest.ocpi221emsp_client.client.model.LocationDTO;

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


@Component("com.extrawest.ocpi221emsp_client.client.api.EmspLocationControllerApi")
public class EmspLocationControllerApi {
    private ApiClient apiClient;

    public EmspLocationControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public EmspLocationControllerApi(ApiClient apiClient) {
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
     * @param locationId  (required)
     * @param evseUid  (optional)
     * @param connectorId  (optional)
     * @return AbstractDomainObject
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AbstractDomainObject getLocationEvseController(String countryCode, String partyId, String locationId, String evseUid, String connectorId) throws RestClientException {
        return getLocationEvseControllerWithHttpInfo(countryCode, partyId, locationId, evseUid, connectorId).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param countryCode  (required)
     * @param partyId  (required)
     * @param locationId  (required)
     * @param evseUid  (optional)
     * @param connectorId  (optional)
     * @return ResponseEntity&lt;AbstractDomainObject&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AbstractDomainObject> getLocationEvseControllerWithHttpInfo(String countryCode, String partyId, String locationId, String evseUid, String connectorId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'countryCode' when calling getLocationEvseController");
        }
        // verify the required parameter 'partyId' is set
        if (partyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partyId' when calling getLocationEvseController");
        }
        // verify the required parameter 'locationId' is set
        if (locationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'locationId' when calling getLocationEvseController");
        }
        String path = UriComponentsBuilder.fromPath("/emsp/api/2.2.1/locations").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "country_code", countryCode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "party_id", partyId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "location_id", locationId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "evse_uid", evseUid));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "connector_id", connectorId));

        final String[] accepts = { 
            "*/*"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<AbstractDomainObject> returnType = new ParameterizedTypeReference<AbstractDomainObject>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @param countryCode  (required)
     * @param partyId  (required)
     * @param locationId  (required)
     * @param evseUid  (optional)
     * @param connectorId  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void patchLocation(LocationDTO body, String countryCode, String partyId, String locationId, String evseUid, String connectorId) throws RestClientException {
        patchLocationWithHttpInfo(body, countryCode, partyId, locationId, evseUid, connectorId);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @param countryCode  (required)
     * @param partyId  (required)
     * @param locationId  (required)
     * @param evseUid  (optional)
     * @param connectorId  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> patchLocationWithHttpInfo(LocationDTO body, String countryCode, String partyId, String locationId, String evseUid, String connectorId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling patchLocation");
        }
        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'countryCode' when calling patchLocation");
        }
        // verify the required parameter 'partyId' is set
        if (partyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partyId' when calling patchLocation");
        }
        // verify the required parameter 'locationId' is set
        if (locationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'locationId' when calling patchLocation");
        }
        String path = UriComponentsBuilder.fromPath("/emsp/api/2.2.1/locations").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "country_code", countryCode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "party_id", partyId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "location_id", locationId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "evse_uid", evseUid));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "connector_id", connectorId));

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
     * @param locationId  (required)
     * @param evseUid  (optional)
     * @param connectorId  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void pushLocation(LocationDTO body, String countryCode, String partyId, String locationId, String evseUid, String connectorId) throws RestClientException {
        pushLocationWithHttpInfo(body, countryCode, partyId, locationId, evseUid, connectorId);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @param countryCode  (required)
     * @param partyId  (required)
     * @param locationId  (required)
     * @param evseUid  (optional)
     * @param connectorId  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> pushLocationWithHttpInfo(LocationDTO body, String countryCode, String partyId, String locationId, String evseUid, String connectorId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling pushLocation");
        }
        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'countryCode' when calling pushLocation");
        }
        // verify the required parameter 'partyId' is set
        if (partyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partyId' when calling pushLocation");
        }
        // verify the required parameter 'locationId' is set
        if (locationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'locationId' when calling pushLocation");
        }
        String path = UriComponentsBuilder.fromPath("/emsp/api/2.2.1/locations").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "country_code", countryCode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "party_id", partyId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "location_id", locationId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "evse_uid", evseUid));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "connector_id", connectorId));

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
