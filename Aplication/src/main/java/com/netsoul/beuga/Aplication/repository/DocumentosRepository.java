package com.netsoul.beuga.Aplication.repository;

import com.netsoul.beuga.Aplication.entity.Documento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentosRepository extends JpaRepository<Documento, Long> {
}
