package rk.training.simple_rest_client.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

/**
 * @author: Rafał Kwiatkowski
 * @created: 05.08.2018 14:26
 */
@Configuration
public class RestConfig {

    @Bean
    public RestOperations createRestTemplate(final ClientHttpRequestFactory clientHttpRequestFactory) {
        return new RestTemplate(clientHttpRequestFactory);
    }

    @Bean
    public ClientHttpRequestFactory creteClientHttpRequestFactory(@Value("${connect.timeout}") final int connectTimeout, @Value("${read.timeout}") final int readTimeout) {
        HttpComponentsClientHttpRequestFactory httpComponentsClientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory();
        httpComponentsClientHttpRequestFactory.setReadTimeout(readTimeout);
        httpComponentsClientHttpRequestFactory.setConnectTimeout(connectTimeout);
        return httpComponentsClientHttpRequestFactory;
    }
}
