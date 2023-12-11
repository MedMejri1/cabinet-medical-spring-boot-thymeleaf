package com.ultproject.cabmed.medecin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedecinService {

    @Autowired
    private MedecinRepo repo;

    public List<Medecin> getListMedecin(){
        List<Medecin> medecins=(List<Medecin>) repo.findAll();
        return medecins;
    }

    public Medecin getMedecin(Integer id){
        Medecin m=repo.findById(id).get();
        return m;
    }

    public void saveMedecin(Medecin m) {repo.save(m);}

    public void deleteMedecin(Integer id) {repo.deleteById(id);}
}
