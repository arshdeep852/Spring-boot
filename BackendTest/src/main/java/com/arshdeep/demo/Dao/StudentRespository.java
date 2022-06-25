package com.arshdeep.demo.Dao;

import com.arshdeep.demo.Models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

public interface StudentRespository extends JpaRepository<Person,Integer> {


}
