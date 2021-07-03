package ar.com.ada.api.questionados.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.ada.api.questionados.entities.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository <Categoria, Integer> {
    
}
