package com.ultproject.cabmed.medecin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MedecinController {

    @Autowired
    private MedecinService mserv;

    @GetMapping("/{medecins}")
    public String listMedecins(Model model) {
        List<Medecin> medecins = mserv.getListMedecin();
        model.addAttribute("medecins", medecins);
        return "/medecins/index";
    }

    @GetMapping("/medecins/new")
    public String showFormMedecins(Model model) {
        Medecin medecin = new Medecin();
        model.addAttribute("medecin", medecin);
        return "/medecins/FormMedecin";
    }
    @PostMapping("/medecins/save")
    public String saveMedecin(Medecin medecin, BindingResult bindingResult, Model model) {
        mserv.saveMedecin(medecin);
        List<Medecin> medecins=mserv.getListMedecin();
        model.addAttribute("medecin",medecin);
        return "redirect:/medecins";
    }
    @GetMapping("/medecins/delete/{id}")
    public String deleteMedecin(@PathVariable("id") Integer id) {
        mserv.deleteMedecin(id);
        return "redirect:/medecins";
    }

    @GetMapping("/medecins/edit/{id}")
    public String editMedecin(@PathVariable("id") Integer id,Model model) {
        Medecin medecin = mserv.getMedecin(id);
        model.addAttribute("medecin", medecin);
        return "/medecins/FormMedecin";
    }
}
