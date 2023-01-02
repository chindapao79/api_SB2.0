package com.api.demo.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.api.demo.model.res.CusmDTO;
import com.api.demo.repository.CusmRepo;
import com.api.demo.service.CusmSVC;

@Service
public class CusmSVCImpl implements CusmSVC {
    @Autowired
    private CusmRepo repository;

    @Override
    public ResponseEntity<List<CusmDTO>> getAll() {
        try {
            List<CusmDTO> items = new ArrayList<CusmDTO>();

            repository.findAll().forEach(items::add);

            if (items.isEmpty())
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);

            return new ResponseEntity<>(items, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<CusmDTO> getById(int id) {
        // TODO Auto-generated method stub
        Optional<CusmDTO> existingItemOptional = repository.findById(id);

        if (existingItemOptional.isPresent()) {
            return new ResponseEntity<>(existingItemOptional.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<CusmDTO> create(CusmDTO item) {
        // TODO Auto-generated method stub
        try {
            CusmDTO savedItem = repository.save(item);
            return new ResponseEntity<>(savedItem, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

    @Override
    public ResponseEntity<CusmDTO> update(int id, CusmDTO item) {
        // TODO Auto-generated method stub
        Optional<CusmDTO> existingItemOptional = repository.findById(id);
        if (existingItemOptional.isPresent()) {
            CusmDTO existingItem = existingItemOptional.get();
            existingItem.setCustomername(item.getCustomername());
            existingItem.setContactname(item.getContactname());
            existingItem.setAddress(item.getAddress());
            existingItem.setCity(item.getCity());
            existingItem.setCountry(item.getCountry());
            existingItem.setPostalcode(item.getPostalcode());
            System.out
                    .println("TODO for developer - update logic is unique to entity and must be implemented manually.");
            // existingItem.setSomeField(item.getSomeField());
            return new ResponseEntity<>(repository.save(existingItem), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<HttpStatus> delete(int id) {
        // TODO Auto-generated method stub
        try {
            repository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
    }

}
