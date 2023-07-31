package com.extrawest.ocpi221emsp_client.client.api;

import com.extrawest.ocpi221emsp_client.client.invoker.ApiClient;

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


@Component("com.extrawest.ocpi221emsp_client.client.api.EmspTariffControllerApi")
public class EmspTariffControllerApi {
    private ApiClient apiClient;

    public EmspTariffControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public EmspTariffControllerApi(ApiClient apiClient) {
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
     * @param tariffId  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteTariff(String countryCode, String partyId, String tariffId) throws RestClientException {
        deleteTariffWithHttpInfo(countryCode, partyId, tariffId);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param countryCode  (required)
     * @param partyId  (required)
     * @param tariffId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteTariffWithHttpInfo(String countryCode, String partyId, String tariffId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'countryCode' when calling deleteTariff");
        }
        // verify the required parameter 'partyId' is set
        if (partyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partyId' when calling deleteTariff");
        }
        // verify the required parameter 'tariffId' is set
        if (tariffId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tariffId' when calling deleteTariff");
        }
        String path = UriComponentsBuilder.fromPath("/emsp/api/2.2.1/tariffs").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "country_code", countryCode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "party_id", partyId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tariff_id", tariffId));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param countryCode  (required)
     * @param partyId  (required)
     * @param tariffId  (required)
     * @return TariffDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TariffDTO getTariff(String countryCode, String partyId, String tariffId) throws RestClientException {
        return getTariffWithHttpInfo(countryCode, partyId, tariffId).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param countryCode  (required)
     * @param partyId  (required)
     * @param tariffId  (required)
     * @return ResponseEntity&lt;TariffDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TariffDTO> getTariffWithHttpInfo(String countryCode, String partyId, String tariffId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'countryCode' when calling getTariff");
        }
        // verify the required parameter 'partyId' is set
        if (partyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partyId' when calling getTariff");
        }
        // verify the required parameter 'tariffId' is set
        if (tariffId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tariffId' when calling getTariff");
        }
        String path = UriComponentsBuilder.fromPath("/emsp/api/2.2.1/tariffs").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "country_code", countryCode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "party_id", partyId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tariff_id", tariffId));

        final String[] accepts = { 
            "*/*"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<TariffDTO> returnType = new ParameterizedTypeReference<TariffDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @param countryCode  (required)
     * @param partyId  (required)
     * @param tariffId  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void saveTariff(TariffDTO body, String countryCode, String partyId, String tariffId) throws RestClientException {
        saveTariffWithHttpInfo(body, countryCode, partyId, tariffId);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @param countryCode  (required)
     * @param partyId  (required)
     * @param tariffId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> saveTariffWithHttpInfo(TariffDTO body, String countryCode, String partyId, String tariffId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling saveTariff");
        }
        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'countryCode' when calling saveTariff");
        }
        // verify the required parameter 'partyId' is set
        if (partyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partyId' when calling saveTariff");
        }
        // verify the required parameter 'tariffId' is set
        if (tariffId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tariffId' when calling saveTariff");
        }
        String path = UriComponentsBuilder.fromPath("/emsp/api/2.2.1/tariffs").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "country_code", countryCode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "party_id", partyId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tariff_id", tariffId));

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
