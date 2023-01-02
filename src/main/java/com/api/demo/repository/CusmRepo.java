package com.api.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.demo.model.req.CusmDAO;
import com.api.demo.model.res.CusmDTO;

@Repository
public interface CusmRepo extends JpaRepository<CusmDTO, Integer> {

    CusmDTO save(CusmDAO item);

}
