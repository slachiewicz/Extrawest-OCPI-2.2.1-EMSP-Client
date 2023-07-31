package com.extrawest.ocpi221emsp_client.client.api;

import com.extrawest.ocpi221emsp_client.client.invoker.ApiClient;

import com.extrawest.ocpi221emsp_client.client.model.AbstractDomainObject;
import com.extrawest.ocpi221emsp_client.client.model.LocationDTO;
import org.threeten.bp.OffsetDateTime;

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


@Component("com.extrawest.ocpi221emsp_client.client.api.CpoLocationControllerApi")
public class CpoLocationControllerApi {
    private ApiClient apiClient;

    public CpoLocationControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public CpoLocationControllerApi(ApiClient apiClient) {
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
     * @param locationId  (required)
     * @param evseUid  (optional)
     * @param connectorId  (optional)
     * @return AbstractDomainObject
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AbstractDomainObject getLocationEvseController1(String locationId, String evseUid, String connectorId) throws RestClientException {
        return getLocationEvseController1WithHttpInfo(locationId, evseUid, connectorId).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param locationId  (required)
     * @param evseUid  (optional)
     * @param connectorId  (optional)
     * @return ResponseEntity&lt;AbstractDomainObject&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AbstractDomainObject> getLocationEvseController1WithHttpInfo(String locationId, String evseUid, String connectorId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'locationId' is set
        if (locationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'locationId' when calling getLocationEvseController1");
        }
        String path = UriComponentsBuilder.fromPath("/cpo/api/2.2.1/locations").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
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
     * @param dateFrom  (optional)
     * @param dateTo  (optional)
     * @param offset  (optional, default to 0)
     * @param limit  (optional)
     * @return List&lt;LocationDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<LocationDTO> getLocations(OffsetDateTime dateFrom, OffsetDateTime dateTo, Integer offset, Integer limit) throws RestClientException {
        return getLocationsWithHttpInfo(dateFrom, dateTo, offset, limit).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param dateFrom  (optional)
     * @param dateTo  (optional)
     * @param offset  (optional, default to 0)
     * @param limit  (optional)
     * @return ResponseEntity&lt;List&lt;LocationDTO&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<LocationDTO>> getLocationsWithHttpInfo(OffsetDateTime dateFrom, OffsetDateTime dateTo, Integer offset, Integer limit) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/cpo/api/2.2.1/locations/getLocations").build().toUriString();
        
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

        ParameterizedTypeReference<List<LocationDTO>> returnType = new ParameterizedTypeReference<List<LocationDTO>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
