package pl.czechak.leszek.webclienttappbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.czechak.leszek.webclienttappbackend.models.UserEntity;

public interface UserRepository extends JpaRepository <UserEntity, Long> {
}
