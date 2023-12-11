package com.ultproject.cabmed.medecin;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MedecinRepo extends CrudRepository<Medecin,Integer> {
}
