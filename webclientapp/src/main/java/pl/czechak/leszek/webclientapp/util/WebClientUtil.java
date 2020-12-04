package pl.czechak.leszek.webclientapp.util;

import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

public class WebClientUtil {

    @Bean
    public WebClient.Builder getWebClient() {
        return WebClient.builder();
    }


}
