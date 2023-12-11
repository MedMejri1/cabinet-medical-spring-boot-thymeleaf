package com.ultproject.cabmed.patient;

import java.util.List;

import com.ultproject.cabmed.patient.Patient;
import com.ultproject.cabmed.patient.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    @Autowired
    private PatientRepo repo;

    public List<Patient> getListPatients() {
        List<Patient> patients = (List<Patient>) repo.findAll();
        return patients;
    }

    public Patient getPatient(Integer id) {
        Patient p = repo.findById(id).get();
        return p;
    }
    public void savePatient(Patient p) {
        repo.save(p);
    }

    public void deletePatient(Integer id) {
        repo.deleteById(id);
    }
}
