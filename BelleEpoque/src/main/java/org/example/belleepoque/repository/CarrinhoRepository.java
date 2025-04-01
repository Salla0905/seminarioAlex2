package org.example.belleepoque.repository;


import org.example.belleepoque.model.Carrinho;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CarrinhoRepository extends JpaRepository<Carrinho, Long> {

}
