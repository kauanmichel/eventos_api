package com.hellow.eventos.controller;

import com.hellow.eventos.classes.ingresso.Ingresso;
import com.hellow.eventos.classes.ingresso.IngressoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class IngressoController {




    @Autowired
    private IngressoRepository ingressoRepository;

    @GetMapping("/todos")
    public List<Ingresso> getAllIngresso(){
        return this.ingressoRepository.findAll();
    }

    @PostMapping("/add")
    public Ingresso addIngresso(@RequestBody Ingresso ingresso) {
        this.ingressoRepository.save(ingresso);
        return ingresso;
    }


}
