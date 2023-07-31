package com.extrawest.ocpi221emsp_client.client.api;

import com.extrawest.ocpi221emsp_client.client.invoker.ApiClient;

import com.extrawest.ocpi221emsp_client.client.model.TokenDTO;

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


@Component("com.extrawest.ocpi221emsp_client.client.api.CpoTokensControllerApi")
public class CpoTokensControllerApi {
    private ApiClient apiClient;

    public CpoTokensControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public CpoTokensControllerApi(ApiClient apiClient) {
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
     * @param tokenUid  (required)
     * @param type  (required)
     * @return TokenDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TokenDTO getToken1(String countryCode, String partyId, String tokenUid, String type) throws RestClientException {
        return getToken1WithHttpInfo(countryCode, partyId, tokenUid, type).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param countryCode  (required)
     * @param partyId  (required)
     * @param tokenUid  (required)
     * @param type  (required)
     * @return ResponseEntity&lt;TokenDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TokenDTO> getToken1WithHttpInfo(String countryCode, String partyId, String tokenUid, String type) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'countryCode' when calling getToken1");
        }
        // verify the required parameter 'partyId' is set
        if (partyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partyId' when calling getToken1");
        }
        // verify the required parameter 'tokenUid' is set
        if (tokenUid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tokenUid' when calling getToken1");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'type' when calling getToken1");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("country_code", countryCode);
        uriVariables.put("party_id", partyId);
        uriVariables.put("token_uid", tokenUid);
        uriVariables.put("type", type);
        String path = UriComponentsBuilder.fromPath("/cpo/api/2.2.1/tokens/{country_code}/{party_id}/{token_uid}/{type}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<TokenDTO> returnType = new ParameterizedTypeReference<TokenDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @param countryCode  (required)
     * @param partyId  (required)
     * @param tokenUid  (required)
     * @param type  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void patchToken(TokenDTO body, String countryCode, String partyId, String tokenUid, String type) throws RestClientException {
        patchTokenWithHttpInfo(body, countryCode, partyId, tokenUid, type);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @param countryCode  (required)
     * @param partyId  (required)
     * @param tokenUid  (required)
     * @param type  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> patchTokenWithHttpInfo(TokenDTO body, String countryCode, String partyId, String tokenUid, String type) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling patchToken");
        }
        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'countryCode' when calling patchToken");
        }
        // verify the required parameter 'partyId' is set
        if (partyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partyId' when calling patchToken");
        }
        // verify the required parameter 'tokenUid' is set
        if (tokenUid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tokenUid' when calling patchToken");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'type' when calling patchToken");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("country_code", countryCode);
        uriVariables.put("party_id", partyId);
        uriVariables.put("token_uid", tokenUid);
        uriVariables.put("type", type);
        String path = UriComponentsBuilder.fromPath("/cpo/api/2.2.1/tokens/{country_code}/{party_id}/{token_uid}/{type}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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
     * @param tokenUid  (required)
     * @param type  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void putToken(TokenDTO body, String countryCode, String partyId, String tokenUid, String type) throws RestClientException {
        putTokenWithHttpInfo(body, countryCode, partyId, tokenUid, type);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @param countryCode  (required)
     * @param partyId  (required)
     * @param tokenUid  (required)
     * @param type  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> putTokenWithHttpInfo(TokenDTO body, String countryCode, String partyId, String tokenUid, String type) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling putToken");
        }
        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'countryCode' when calling putToken");
        }
        // verify the required parameter 'partyId' is set
        if (partyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partyId' when calling putToken");
        }
        // verify the required parameter 'tokenUid' is set
        if (tokenUid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tokenUid' when calling putToken");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'type' when calling putToken");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("country_code", countryCode);
        uriVariables.put("party_id", partyId);
        uriVariables.put("token_uid", tokenUid);
        uriVariables.put("type", type);
        String path = UriComponentsBuilder.fromPath("/cpo/api/2.2.1/tokens/{country_code}/{party_id}/{token_uid}/{type}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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
