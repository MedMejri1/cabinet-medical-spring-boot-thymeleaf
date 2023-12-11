package com.ultproject.cabmed.medicament;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicamentService {
    @Autowired
    private MedicamentRepo repo;

    public List<Medicament> getListMedicaments() {
        List<Medicament> medicaments = (List<Medicament>) repo.findAll();
        return medicaments;
    }

    public Medicament getMedicament(Integer id) {
        Medicament m = repo.findById(id).get();
        return m;
    }
    public void saveMedicament(Medicament m) {
        repo.save(m);
    }

    public void deleteMedicament(Integer id) {
        repo.deleteById(id);
    }
}
