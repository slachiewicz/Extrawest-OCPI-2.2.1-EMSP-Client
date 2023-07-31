package com.extrawest.ocpi221emsp_client.client.api;

import com.extrawest.ocpi221emsp_client.client.invoker.ApiClient;

import com.extrawest.ocpi221emsp_client.client.model.CdrDTO;
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


@Component("com.extrawest.ocpi221emsp_client.client.api.CpoCdrControllerApi")
public class CpoCdrControllerApi {
    private ApiClient apiClient;

    public CpoCdrControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public CpoCdrControllerApi(ApiClient apiClient) {
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
     * @param dateTo  (required)
     * @param offset  (required)
     * @param limit  (required)
     * @return List&lt;CdrDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<CdrDTO> getCdr1(OffsetDateTime dateFrom, OffsetDateTime dateTo, Integer offset, Integer limit) throws RestClientException {
        return getCdr1WithHttpInfo(dateFrom, dateTo, offset, limit).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param dateFrom  (required)
     * @param dateTo  (required)
     * @param offset  (required)
     * @param limit  (required)
     * @return ResponseEntity&lt;List&lt;CdrDTO&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<CdrDTO>> getCdr1WithHttpInfo(OffsetDateTime dateFrom, OffsetDateTime dateTo, Integer offset, Integer limit) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'dateFrom' is set
        if (dateFrom == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dateFrom' when calling getCdr1");
        }
        // verify the required parameter 'dateTo' is set
        if (dateTo == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dateTo' when calling getCdr1");
        }
        // verify the required parameter 'offset' is set
        if (offset == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offset' when calling getCdr1");
        }
        // verify the required parameter 'limit' is set
        if (limit == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'limit' when calling getCdr1");
        }
        String path = UriComponentsBuilder.fromPath("/cpo/api/2.2.1/cdr").build().toUriString();
        
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

        ParameterizedTypeReference<List<CdrDTO>> returnType = new ParameterizedTypeReference<List<CdrDTO>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
