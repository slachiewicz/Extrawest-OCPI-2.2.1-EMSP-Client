package com.extrawest.ocpi221emsp_client.client.api;

import com.extrawest.ocpi221emsp_client.client.invoker.ApiClient;

import com.extrawest.ocpi221emsp_client.client.model.AuthorizationInfoResponseDTO;
import com.extrawest.ocpi221emsp_client.client.model.LocationReferencesRequestDTO;
import org.threeten.bp.OffsetDateTime;
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


@Component("com.extrawest.ocpi221emsp_client.client.api.EmspTokenControllerApi")
public class EmspTokenControllerApi {
    private ApiClient apiClient;

    public EmspTokenControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public EmspTokenControllerApi(ApiClient apiClient) {
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
     * @return List&lt;TokenDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TokenDTO> getToken(OffsetDateTime dateFrom, OffsetDateTime dateTo, Integer offset, Integer limit) throws RestClientException {
        return getTokenWithHttpInfo(dateFrom, dateTo, offset, limit).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param dateFrom  (required)
     * @param dateTo  (required)
     * @param offset  (required)
     * @param limit  (required)
     * @return ResponseEntity&lt;List&lt;TokenDTO&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<TokenDTO>> getTokenWithHttpInfo(OffsetDateTime dateFrom, OffsetDateTime dateTo, Integer offset, Integer limit) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'dateFrom' is set
        if (dateFrom == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dateFrom' when calling getToken");
        }
        // verify the required parameter 'dateTo' is set
        if (dateTo == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dateTo' when calling getToken");
        }
        // verify the required parameter 'offset' is set
        if (offset == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offset' when calling getToken");
        }
        // verify the required parameter 'limit' is set
        if (limit == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'limit' when calling getToken");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("date_from", dateFrom);
        uriVariables.put("date_to", dateTo);
        uriVariables.put("offset", offset);
        uriVariables.put("limit", limit);
        String path = UriComponentsBuilder.fromPath("/emsp/api/2.2.1/tokens/{date_from}/{date_to}/{offset}/{limit}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<List<TokenDTO>> returnType = new ParameterizedTypeReference<List<TokenDTO>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @param tokenUid  (required)
     * @param type  (required)
     * @return AuthorizationInfoResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AuthorizationInfoResponseDTO postToken(LocationReferencesRequestDTO body, String tokenUid, String type) throws RestClientException {
        return postTokenWithHttpInfo(body, tokenUid, type).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @param tokenUid  (required)
     * @param type  (required)
     * @return ResponseEntity&lt;AuthorizationInfoResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AuthorizationInfoResponseDTO> postTokenWithHttpInfo(LocationReferencesRequestDTO body, String tokenUid, String type) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postToken");
        }
        // verify the required parameter 'tokenUid' is set
        if (tokenUid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tokenUid' when calling postToken");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'type' when calling postToken");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("token_uid", tokenUid);
        uriVariables.put("type", type);
        String path = UriComponentsBuilder.fromPath("/emsp/api/2.2.1/tokens/{token_uid}/{type}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<AuthorizationInfoResponseDTO> returnType = new ParameterizedTypeReference<AuthorizationInfoResponseDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
