package com.sample.core.DAO;

import java.util.List;
import com.sample.core.domain.Rodado;
import com.sample.core.enums.CajaEnum;

public interface RodadoDao {

    public Rodado findById(int id) throws Exception;

    public List<Rodado> list() throws Exception;
    public List<Rodado> findAll();
    public void save(String patente, int motor_rodaje, String motor, String color, String baul,
                     CajaEnum caja, CajaEnum tipo, CajaEnum tipoconsumo,
                     CajaEnum puertas, CajaEnum tiporodado) throws Exception;

    public void delete(int id) throws Exception;
    public void insert(Rodado r);
    public void update(int id, String patente, int motor_rodaje, String motor, String color, String baul,
                       CajaEnum caja, CajaEnum tipo, CajaEnum tipoconsumo,
                       CajaEnum puertas, CajaEnum tiporodado) throws Exception;

	public void update(Rodado r);
}