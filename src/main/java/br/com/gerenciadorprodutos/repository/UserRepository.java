package br.com.gerenciadorprodutos.repository;

import br.com.gerenciadorprodutos.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
