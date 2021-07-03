package ar.com.ada.api.questionados.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.ada.api.questionados.entities.Pregunta;

@Repository
public interface PreguntaRepository extends JpaRepository<Pregunta, Integer>{
    
}
