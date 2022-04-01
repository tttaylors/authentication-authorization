package br.com.application.authenticationauthorization.domain.repository;

import br.com.application.authenticationauthorization.domain.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}

