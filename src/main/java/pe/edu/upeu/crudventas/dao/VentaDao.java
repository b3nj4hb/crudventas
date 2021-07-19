/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.crudventas.dao;

import java.util.List;
import java.util.Map;
import pe.edu.upeu.crudventas.model.Venta;

/**
 *
 * @author benja
 */
public interface VentaDao {

    int create(Venta s);

    int update(Venta s);

    int delete(int id);

    Venta read(int id);

    List<Venta> readAll();

    List<Map<String, Object>> readAll2();
}
