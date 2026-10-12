package br.com.gerenciadorprodutos.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "usuarios")
@Setter
@Getter
@NoArgsConstructor

public class User implements Serializable {




    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nome",nullable = false, length = 50)
    private String name;
    @Column(name = "email",nullable = false, length =100)
    private String email;
    @Column(name = "senha",nullable = false, length = 255)
    private String password;
    @Enumerated(EnumType.STRING)
    @Column(name = "role",nullable = false, length = 25)
    private Role role = Role.USER_STANDARD;

    //recuso para adiutoria no spring security

    @Column(name = "data_criacao",nullable = true, length = 20)
    private LocalDateTime dataCriacao;
    @Column(name = "data_modificacao",nullable = true, length = 20)
    private LocalDateTime dataModificacao;
    @Column(name = "nome_criador",nullable = true, length = 20)
    private String criadoPor;
    @Column(name = "nome_modificador",nullable = true, length = 20)
    private String modificadoPor;


    public enum Role{
        USER_ADMIN,USER_STANDARD
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                '}';
    }
}

