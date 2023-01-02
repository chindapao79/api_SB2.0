package com.api.demo.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.api.demo.model.res.CusmDTO;


public interface CusmSVC {
    public ResponseEntity<List<CusmDTO>> getAll();

    public ResponseEntity<CusmDTO> getById(int id);

    public ResponseEntity<CusmDTO> create(CusmDTO item);

    public ResponseEntity<CusmDTO> update(int id, CusmDTO item);

    public ResponseEntity<HttpStatus> delete(int id);

}
