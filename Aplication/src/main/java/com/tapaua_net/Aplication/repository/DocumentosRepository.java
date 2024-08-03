package com.tapaua_net.Aplication.repository;

import com.tapaua_net.Aplication.entity.Documento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentosRepository extends JpaRepository<Documento, Long> {
}
