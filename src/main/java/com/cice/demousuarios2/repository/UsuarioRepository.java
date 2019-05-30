package com.cice.demousuarios2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface UsuarioRepository extends JpaRepository {
    @Transactional
    @Query("INSERT INTO ")

}
