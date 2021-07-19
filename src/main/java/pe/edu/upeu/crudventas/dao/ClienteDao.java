/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.crudventas.dao;

import java.util.List;
import java.util.Map;
import pe.edu.upeu.crudventas.model.Cliente;

/**
 *
 * @author benja
 */
public interface ClienteDao {

    int create(Cliente c);

    int update(Cliente c);

    int delete(int id);

    Cliente read(int id);

    List<Cliente> readAll();

    List<Map<String, Object>> readAll2();
}
