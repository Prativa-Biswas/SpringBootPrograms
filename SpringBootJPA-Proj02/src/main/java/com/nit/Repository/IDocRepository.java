package com.nit.Repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.nit.entity.Doctor;

public interface IDocRepository extends PagingAndSortingRepository<Doctor, Integer> {

}
