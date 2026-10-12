package br.com.gerenciadorprodutos.service;

import br.com.gerenciadorprodutos.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service

public class UserService {

    private final UserRepository userRepository;

}
