package co.edu.unbosque.securitytutorial.jpa.repositories;

import co.edu.unbosque.securitytutorial.jpa.entities.UserApp;

import java.util.Optional;

public interface UserAppRepository {

    Optional<UserApp> findByUsername(String username);

    Optional<UserApp> save(UserApp user);

}
