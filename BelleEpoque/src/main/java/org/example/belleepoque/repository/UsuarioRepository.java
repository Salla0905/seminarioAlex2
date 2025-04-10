package org.example.belleepoque.repository;

import org.example.belleepoque.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Query("SELECT u FROM Usuario u WHERE u.email = :email AND u.senha = :senha")
    Usuario findByEmailAndSenha(@Param("email") String email, @Param("senha") String senha);

    boolean existsByEmail(String email);
}