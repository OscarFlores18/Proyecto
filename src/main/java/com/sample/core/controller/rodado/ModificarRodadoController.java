package com.sample.core.controller.rodado;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sample.core.DAO.RodadoDao;
import com.sample.core.DAO.RodadoDaoImp;
import com.sample.core.domain.Rodado;

@WebServlet("/ModificarRodado")
public class ModificarRodadoController extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        String patente = request.getParameter("patente");
        String motor = request.getParameter("motor_rodaje");
        String color = request.getParameter("color");

        Rodado r = new Rodado();
        r.setId(id);
        r.setPatente(patente);
        r.setMotor_rodaje(motor);
        r.setColor(color);

        RodadoDao dao = new RodadoDaoImp();
        dao.update(r);

        response.getWriter().write("ok");
    }
}