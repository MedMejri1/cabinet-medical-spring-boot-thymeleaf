package com.ultproject.cabmed.rdv;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
public class RdvController {
    @Autowired
    private RdvService pserv;




    @GetMapping("/rdv")
    public String listPatients(Model model) {
        List<Rdv> rdv = pserv.getListRdv();
        model.addAttribute("rdv", rdv);
        return "/rdv/index";
    }

    @GetMapping("/rdv/new")
    public String showFormRdv(Model model) {
        Rdv rdv = new Rdv();
        model.addAttribute("rdv", rdv);
        return "/rdv/FormRdv";
    }
    @PostMapping("/rdv/save")
    public String saveRdv(Rdv rdv, BindingResult bindingResult, Model model) {
        pserv.saveRdv(rdv);
        List<Rdv> patients=pserv.getListRdv();
        model.addAttribute("rdv",rdv);
        return "redirect:/rdv";
    }
    @GetMapping("/rdv/delete/{id}")
    public String deleteRdv(@PathVariable("id") Integer id) {
        pserv.deleteRdv(id);
        return "redirect:/rdv";
    }

    @GetMapping("/rdv/edit/{id}")
    public String editRdv(@PathVariable("id") Integer id,Model model) {
        Rdv rdv = pserv.getRdv(id);
        model.addAttribute("rdv", rdv);
        return "/rdv/Formrdv";
    }
}
