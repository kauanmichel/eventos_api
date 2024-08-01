package com.hellow.eventos.classes.evento;

import com.hellow.eventos.classes.tipo.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<evento,Integer> {
}
