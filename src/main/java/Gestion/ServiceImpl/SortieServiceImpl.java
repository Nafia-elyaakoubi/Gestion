/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion.ServiceImpl;

import Gestion.Bean.Sortie;
import Gestion.Dao.SortieDao;
import Gestion.Service.SortieService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nafia
 */
@Service
public class SortieServiceImpl implements SortieService{
@Autowired
    private SortieDao sortieDao;
    @Override
    public void save(Sortie sortie) {
        sortieDao.save(sortie);
    }

    @Override
    public List<Sortie> findAll() {
        return sortieDao.findAll();
    }

    @Override
    public List<Sortie> findByDepartement(String departement) {
        return sortieDao.findByDepartement(departement);
    }
     
}
