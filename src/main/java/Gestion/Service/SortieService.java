/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion.Service;

import Gestion.Bean.Sortie;
import java.util.List;

/**
 *
 * @author Nafia
 */
public interface SortieService {

    public void save(Sortie sortie);

    public List<Sortie> findAll();
    
    public List<Sortie> findByDepartement(String departement);
}
