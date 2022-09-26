package be.digitalcity.projetspringrest.repositories;

import be.digitalcity.projetspringrest.models.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users,Long> {

//    TODO : Verif si existe par email (count>1)

    Optional<Users> findByEmail(String email);
}
