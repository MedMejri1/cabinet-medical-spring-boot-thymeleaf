package com.ultproject.cabmed.patient;


import com.ultproject.cabmed.patient.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
public class PatientController {
    @Autowired
    private PatientService pserv;




    @GetMapping("/patients")
    public String listPatients(Model model) {
        List<Patient> patients = pserv.getListPatients();
        model.addAttribute("patients", patients);
        return "/patients/index";
    }

    @GetMapping("/patients/new")
    public String showFormPatient(Model model) {
        Patient patient = new Patient();
        model.addAttribute("patient", patient);
        return "/patients/FormPatient";
    }
    @PostMapping("/patients/save")
    public String savePatient(Patient patient, BindingResult bindingResult, Model model) {
        pserv.savePatient(patient);
        List<Patient> patients=pserv.getListPatients();
        model.addAttribute("patient",patient);
        return "redirect:/patients";
    }
    @GetMapping("/patients/delete/{id}")
    public String deletePatient(@PathVariable("id") Integer id) {
        pserv.deletePatient(id);
        return "redirect:/patients";
    }

    @GetMapping("/patients/edit/{id}")
    public String editPatient(@PathVariable("id") Integer id,Model model) {
        Patient patient = pserv.getPatient(id);
        model.addAttribute("patient", patient);
        return "/patients/FormPatient";
    }
}
