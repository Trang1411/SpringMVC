package springmvcdemo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import springmvcdemo.domain.ERole;
import springmvcdemo.domain.Role;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}
