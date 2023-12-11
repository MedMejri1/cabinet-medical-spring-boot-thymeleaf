package com.ultproject.cabmed.medicament;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
public class MedicamentController {
    @Autowired
    private MedicamentService mserv;




    @GetMapping("/medicaments")
    public String listMedicaments(Model model) {
        List<Medicament> medicaments = mserv.getListMedicaments();
        model.addAttribute("medicaments", medicaments);
        return "/medicaments/index";
    }

    @GetMapping("/medicaments/new")
    public String showFormMedicament(Model model) {
        Medicament medicament = new Medicament();
        model.addAttribute("medicament", medicament);
        return "/medicaments/FormMedicament";
    }
    @PostMapping("/medicaments/save")
    public String saveMedicament(Medicament medicament, BindingResult bindingResult, Model model) {
        mserv.saveMedicament(medicament);
        List<Medicament> medicaments=mserv.getListMedicaments();
        model.addAttribute("medicament",medicament);
        return "redirect:/medicaments";
    }
    @GetMapping("/medicaments/delete/{id}")
    public String deleteMedicament(@PathVariable("id") Integer id) {
        mserv.deleteMedicament(id);
        return "redirect:/medicaments";
    }

    @GetMapping("/medicaments/edit/{id}")
    public String editMedicament(@PathVariable("id") Integer id,Model model) {
        Medicament medicament = mserv.getMedicament(id);
        model.addAttribute("medicament", medicament);
        return "/medicaments/FormMedicament";
    }
}
