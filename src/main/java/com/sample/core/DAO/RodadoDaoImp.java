package com.sample.core.DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.sample.core.DAO.config.Conexion;
import com.sample.core.domain.Rodado;
import com.sample.core.enums.CajaEnum;

public class RodadoDaoImp implements RodadoDao {

    private Conexion conexion = Conexion.getInstance();

    private static final String queryFindById = "SELECT * FROM rodado WHERE id=?";
    private static final String queryList = "SELECT * FROM rodado";
    private static final String queryInsert = "INSERT INTO rodado (patente, motor_rodaje,color) VALUES (?,?,?)";
    private static final String queryDelete = "DELETE FROM rodado WHERE id=?";
    
    // ✅ UPDATE (lo vas a usar ahora)
    private static final String queryUpdate = 
        "UPDATE rodado SET patente=?, motor_rodaje=?, motor=?, color=?, baul=? WHERE id=?";

    @Override
    public Rodado findById(int id) throws Exception {
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conexion.dameConnection().prepareStatement(queryFindById);
            st.setInt(1, id);
            rs = st.executeQuery();

            if (rs.next()) {
                return new Rodado(
                );
            }

        } catch (Exception e) {
            throw new Exception("Error al buscar rodado", e);
        } finally {
            if (rs != null) rs.close();
            if (st != null) st.close();
        }

        return null;
    }

    @Override
    public List<Rodado> list() throws Exception {
        List<Rodado> lista = new ArrayList<>();
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conexion.dameConnection().prepareStatement(queryList);
            rs = st.executeQuery();

            while (rs.next()) {
                lista.add(new Rodado(
                ));
            }

        } catch (Exception e) {
            throw new Exception("Error al listar rodados", e);
        } finally {
            if (rs != null) rs.close();
            if (st != null) st.close();
        }

        return lista;
    }

    @Override
    public void save(String patente, int motor_rodaje, String motor, String color, String baul,
                     CajaEnum caja, CajaEnum tipo, CajaEnum tipoconsumo,
                     CajaEnum puertas, CajaEnum tiporodado) throws Exception {

        PreparedStatement st = null;

        try {
            st = conexion.dameConnection().prepareStatement(queryInsert);

            st.setString(1, patente);
            st.setInt(2, motor_rodaje);
            st.setString(3, motor);
            st.setString(4, color);
            st.setString(5, baul);
            st.setString(6, caja.name());
            st.setString(7, tipo.name());
            st.setString(8, tipoconsumo.name());
            st.setString(9, puertas.name());
            st.setString(10, tiporodado.name());

            st.executeUpdate();

        } catch (Exception e) {
            throw new Exception("Error al guardar rodado", e);
        } finally {
            if (st != null) st.close();
        }
    }

    @Override
    public void delete(int id) throws Exception {
        PreparedStatement st = null;

        try {
            st = conexion.dameConnection().prepareStatement(queryDelete);
            st.setInt(1, id);

            int filas = st.executeUpdate();

            if (filas == 0) {
                throw new Exception("No se encontró el rodado");
            }

        } catch (Exception e) {
            throw new Exception("Error al eliminar rodado", e);
        } finally {
            if (st != null) st.close();
        }
    }

    @Override
    public void update(int id, String patente, int motor_rodaje, String motor, String color, String baul,
                       CajaEnum caja, CajaEnum tipo, CajaEnum tipoconsumo,
                       CajaEnum puertas, CajaEnum tiporodado) throws Exception {

        PreparedStatement st = null;

        
        
        try {
            st = conexion.dameConnection().prepareStatement(queryUpdate);

            st.setString(1, patente);
            st.setInt(2, motor_rodaje);
            st.setString(3, motor);
            st.setString(4, color);
            st.setString(5, baul);
            st.setInt(6, id);

            int filas = st.executeUpdate();

            if (filas == 0) {
                throw new Exception("No se pudo modificar el rodado");
            }

        } catch (Exception e) {
            throw new Exception("Error al modificar rodado", e);
        } finally {
            if (st != null) st.close();
     
        }
        
    }

	@Override
	public void insert(Rodado r) {
		
	}
	@Override
	public List<Rodado> findAll() {
	    List<Rodado> lista = new ArrayList<>();

	    // conexión + query
	    // SELECT * FROM rodado

	    return lista;
	}

	@Override
	public void update(Rodado r) {
		// TODO Auto-generated method stub
		
	}
	
	
}