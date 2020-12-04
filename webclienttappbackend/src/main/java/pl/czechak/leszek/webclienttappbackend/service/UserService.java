package pl.czechak.leszek.webclienttappbackend.service;

import org.springframework.stereotype.Service;
import pl.czechak.leszek.webclienttappbackend.models.UserEntity;
import pl.czechak.leszek.webclienttappbackend.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserEntity getUserEntityByUserId(Long userId) {
        return userRepository.findById(userId).orElseThrow(()-> new RuntimeException(""));
    }
}
