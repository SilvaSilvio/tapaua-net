package com.netsoul.beuga.Aplication.repository;

import com.netsoul.beuga.Aplication.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepositoty extends JpaRepository<Pessoa, Long> {

}
