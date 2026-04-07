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

@WebServlet("/CrearRodado")
public class CrearRodadoController extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String patente = request.getParameter("patente");
        String motorRodaje = request.getParameter("motor_rodaje");
        String color = request.getParameter("color");
        System.out.println("ENTRÓ AL SERVLET");
        Rodado r = new Rodado();
        r.setPatente(patente);
        r.setMotor_rodaje(motorRodaje);
        r.setColor(color);

        RodadoDao dao = new RodadoDaoImp();
        dao.insert(r);

        response.setContentType("application/json");
        response.getWriter().write("{\"status\":\"ok\"}");
    }
}