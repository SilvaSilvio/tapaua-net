package com.tapaua_net.Aplication.repository;

import com.tapaua_net.Aplication.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepositoty extends JpaRepository<Pessoa, Long> {

}
