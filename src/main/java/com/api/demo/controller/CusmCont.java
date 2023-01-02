package com.api.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.demo.model.res.CusmDTO;
import com.api.demo.service.impl.CusmSVCImpl;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping(value = "api/v2")
public class CusmCont {
    @Autowired
    private CusmSVCImpl service;

    @GetMapping(value = "cusm")
    public ResponseEntity<List<CusmDTO>> getAll() {
        return service.getAll();
    }

    @GetMapping(value = "cusm/{id}")
    public ResponseEntity<CusmDTO> getById(@PathVariable("id") int id) {
        return service.getById(id);
    }

    @PostMapping(value = "post")
    public ResponseEntity<CusmDTO> post(@RequestBody CusmDTO item) {
        return service.create(item);
    }

    @PutMapping("{id}")
    public ResponseEntity<CusmDTO> update(@PathVariable("id") int id, @RequestBody CusmDTO item) {
        return service.update(id, item);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable("id") int id) {
        return service.delete(id);
    }

}
