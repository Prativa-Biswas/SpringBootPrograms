package com.nit.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.Entity.Doctor;

public interface IDocRepository extends JpaRepository<Doctor, Integer> {

}
