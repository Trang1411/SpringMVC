package springmvcdemo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import springmvcdemo.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findById(String userId);
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
    List<User> findByRole(String role);
}
