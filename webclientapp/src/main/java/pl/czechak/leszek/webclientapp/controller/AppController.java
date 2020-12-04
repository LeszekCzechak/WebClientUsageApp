package pl.czechak.leszek.webclientapp.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.czechak.leszek.webclientapp.models.UserResponse;
import pl.czechak.leszek.webclientapp.service.UserService;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/user")
public class AppController {

    private final UserService userService;

    public AppController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/{userId}")
    public ResponseEntity<Mono<UserResponse>> getUserByUserId(@PathVariable long userId){
       return ResponseEntity.ok(userService.getUserById(userId));

    }

}
