/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion.Dao;

import Gestion.Bean.Sortie;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nafia
 */
@Repository
public interface SortieDao extends JpaRepository<Sortie, Long>{
    public List<Sortie> findAll();

    public List<Sortie> findByDepartement(String departement);
    
}
