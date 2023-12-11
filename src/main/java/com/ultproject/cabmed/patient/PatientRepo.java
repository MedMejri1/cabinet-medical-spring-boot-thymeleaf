package com.ultproject.cabmed.patient;


import com.ultproject.cabmed.patient.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//Remove @RepositoryRestResource below to disable auto REST api:
@RepositoryRestResource
public interface PatientRepo extends CrudRepository<Patient, Integer>{

}