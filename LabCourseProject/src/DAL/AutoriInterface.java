/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Autori;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface AutoriInterface {
    public void create(Autori a) throws CrudFormException;
    public void edit(Autori a) throws CrudFormException;
    public void delete(Autori a) throws CrudFormException;
    List<Autori> findAll() throws CrudFormException;
    Autori findByID(Integer id) throws CrudFormException;
    Autori findByName(String name) throws CrudFormException;
    
}
