/**
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.4.0-SNAPSHOT).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.api;

import org.junit.jupiter.api.Test;
import org.apache.camel.test.spring.junit5.CamelSpringBootTest;
import org.springframework.boot.test.context.SpringBootTest;
import com.mashape.unirest.request.HttpRequest;
import com.mashape.unirest.request.HttpRequestWithBody;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.HttpResponse;
import java.io.InputStream;
import org.junit.jupiter.api.Assertions;

@CamelSpringBootTest
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class UserApiTest {
    private static final String API_URL = "http://127.0.0.1:8080/api/v1";

    @Test
    public void getUserByNameTestJson() throws Exception {
        String contentType = "application/json";
        String accept = "application/json";
        String url = API_URL + "/user/{username}";
        HttpRequest httpRequest = Unirest.get(url);
        httpRequest = httpRequest.header("Accept", accept);
        httpRequest = httpRequest.routeParam("username", "1");
        
        
        HttpResponse<JsonNode> httpResponse = httpRequest.asJson();
        Assertions.assertTrue(httpResponse.getStatus() < 400 || httpResponse.getStatus() == 415);
    }
    
    @Test
    public void getUserByNameTestXml() throws Exception {
        String contentType = "application/xml";
        String accept = "application/xml";
        String url = API_URL + "/user/{username}";
        HttpRequest httpRequest = Unirest.get(url);
        httpRequest = httpRequest.header("Accept", accept);
        httpRequest = httpRequest.routeParam("username", "1");
        
        
        HttpResponse<String> httpResponse = httpRequest.asString();
        Assertions.assertTrue(httpResponse.getStatus() < 400 || httpResponse.getStatus() == 415);
    }
}