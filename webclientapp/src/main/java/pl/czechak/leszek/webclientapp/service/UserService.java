package pl.czechak.leszek.webclientapp.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import pl.czechak.leszek.webclientapp.models.UserEntity;
import pl.czechak.leszek.webclientapp.models.UserResponse;
import reactor.core.publisher.Mono;

@Service
public class UserService {

    private final WebClient.Builder webClient;

    public UserService(WebClient.Builder webClient) {
        this.webClient = webClient;
    }

    public Mono<UserResponse> getUserById(long userId) {

        Mono<UserResponse> responseMono = webClient.build()
                .get()
                .uri("http://localhost:8082/db/" + userId)
                .retrieve()
                .bodyToMono(UserEntity.class)
                .map(x -> {
                    UserResponse response = new UserResponse();
                    response.setUsername(x.getUsername());
                    response.setAge(x.getAge());
                    return response;
                });

        return responseMono;


    }
}
