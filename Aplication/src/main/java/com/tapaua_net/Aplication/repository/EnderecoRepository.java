package com.tapaua_net.Aplication.repository;


import com.tapaua_net.Aplication.entity.Adress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Adress, Long> {
}
