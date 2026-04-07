package com.sample.core.controller.rodado;

import java.awt.List;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.sample.core.DAO.RodadoDao;
import com.sample.core.DAO.RodadoDaoImp;
import com.sample.core.domain.Rodado;

@WebServlet("/LeerRodados")
public class LeerRodadosController extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RodadoDao dao = new RodadoDaoImp();
        java.util.List<Rodado> lista = dao.findAll();

        Gson gson = new Gson();
        String json = gson.toJson(lista);

        response.setContentType("application/json");
        response.getWriter().write(json);
    }
}