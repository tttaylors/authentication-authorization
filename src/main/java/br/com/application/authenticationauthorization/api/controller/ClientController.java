package br.com.application.authenticationauthorization.api.controller;

import br.com.application.authenticationauthorization.domain.repository.ClientRepository;
import br.com.application.authenticationauthorization.domain.model.Client;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import lombok.RequiredArgsConstructor;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/clients")
public class ClientController {

    private final ClientRepository clientRepository;

    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public List<Client> listAll() {
        return clientRepository.findAll();
    }
}
