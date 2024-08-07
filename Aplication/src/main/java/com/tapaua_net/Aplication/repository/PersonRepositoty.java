package com.tapaua_net.Aplication.repository;

import com.tapaua_net.Aplication.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepositoty extends JpaRepository<Person, Long> {

}
