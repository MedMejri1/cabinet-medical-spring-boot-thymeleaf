package com.ultproject.cabmed.rdv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RdvService {
    @Autowired
    private RdvRepo repo;

    public List<Rdv> getListRdv() {
        List<Rdv> patients = (List<Rdv>) repo.findAll();
        return patients;
    }

    public Rdv getRdv(Integer id) {
        Rdv p = repo.findById(id).get();
        return p;
    }
    public void saveRdv(Rdv p) {
        repo.save(p);
    }

    public void deleteRdv(Integer id) {
        repo.deleteById(id);
    }
}
