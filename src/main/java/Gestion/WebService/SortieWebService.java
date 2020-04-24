/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion.WebService;

import Gestion.Bean.Sortie;
import Gestion.Service.SortieService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Nafia
 */
@RestController
@RequestMapping("/Gestion/Sortie")
public class SortieWebService implements SortieService {

    @Autowired
    private SortieService sortieService;

    @PostMapping("/")
    public void save(@RequestBody Sortie sortie) {
        sortieService.save(sortie);
    }

    @GetMapping("/")
    public List<Sortie> findAll() {
        return sortieService.findAll();
    }

    @GetMapping("/Departement/{departement}")
    public List<Sortie> findByDepartement(@PathVariable String departement) {
        return sortieService.findByDepartement(departement);
    }
}
