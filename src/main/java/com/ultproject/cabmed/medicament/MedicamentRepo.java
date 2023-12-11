package com.ultproject.cabmed.medicament;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//Remove @RepositoryRestResource below to disable auto REST api:
@RepositoryRestResource
public interface MedicamentRepo extends CrudRepository<Medicament, Integer>{

}