package com.extrawest.ocpi221emsp_client.client.api;

import com.extrawest.ocpi221emsp_client.client.invoker.ApiClient;

import org.threeten.bp.OffsetDateTime;
import com.extrawest.ocpi221emsp_client.client.model.TariffDTO;

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


@Component("com.extrawest.ocpi221emsp_client.client.api.CpoTariffControllerApi")
public class CpoTariffControllerApi {
    private ApiClient apiClient;

    public CpoTariffControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public CpoTariffControllerApi(ApiClient apiClient) {
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
     * @param dateFrom  (optional)
     * @param dateTo  (optional)
     * @param offset  (optional, default to 0)
     * @param limit  (optional)
     * @return List&lt;TariffDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TariffDTO> getTariffs(OffsetDateTime dateFrom, OffsetDateTime dateTo, Integer offset, Integer limit) throws RestClientException {
        return getTariffsWithHttpInfo(dateFrom, dateTo, offset, limit).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param dateFrom  (optional)
     * @param dateTo  (optional)
     * @param offset  (optional, default to 0)
     * @param limit  (optional)
     * @return ResponseEntity&lt;List&lt;TariffDTO&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<TariffDTO>> getTariffsWithHttpInfo(OffsetDateTime dateFrom, OffsetDateTime dateTo, Integer offset, Integer limit) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/cpo/api/2.2.1/tariffs").build().toUriString();
        
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

        ParameterizedTypeReference<List<TariffDTO>> returnType = new ParameterizedTypeReference<List<TariffDTO>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
