package pl.czechak.leszek.webclienttappbackend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.czechak.leszek.webclienttappbackend.models.UserEntity;
import pl.czechak.leszek.webclienttappbackend.service.UserService;

@RestController
@RequestMapping("/db")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{userId}")
    public ResponseEntity<UserEntity> getUserEntityByUserId (@PathVariable Long userId){
        return ResponseEntity.ok(userService.getUserEntityByUserId(userId));
    }
}
