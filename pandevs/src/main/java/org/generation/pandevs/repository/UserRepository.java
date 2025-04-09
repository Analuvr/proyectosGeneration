package org.generation.pandevs.repository;

// Métodos abstractos de JpaRepository

import org.generation.pandevs.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//<T (dato con el que interactúa), ID (tipo de clase que recibe la clave primaria)>
@Repository // Indicar que va a cumplir la función de Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // Métodos para manipular cierta información (JPQL)
    User findByEmail(String email);
}
