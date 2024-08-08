package com.hellow.eventos.controller;

import com.hellow.eventos.classes.evento.EventoRepository;
import com.hellow.eventos.classes.evento.evento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping(path="evento")

public class EventoController {

    @Autowired
    private EventoRepository eventoRepository;

    @GetMapping("todos")
    public List<evento> getAllEvento() {
        return this.eventoRepository.findAll();
    }

    @PostMapping("add")
    public evento addEvento(@RequestBody evento evento) {
        this.eventoRepository.save(evento);
        return evento;

    }
}
