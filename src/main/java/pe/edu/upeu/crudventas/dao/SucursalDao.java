/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.crudventas.dao;

import java.util.List;
import java.util.Map;
import pe.edu.upeu.crudventas.model.Sucursal;

/**
 *
 * @author benja
 */
public interface SucursalDao {

    int create(Sucursal s);

    int update(Sucursal s);

    int delete(int id);

    Sucursal read(int id);

    List<Sucursal> readAll();

    List<Map<String, Object>> readAll2();
}
