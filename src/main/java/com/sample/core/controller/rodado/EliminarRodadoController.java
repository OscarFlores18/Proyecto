package com.sample.core.controller.rodado;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sample.core.DAO.RodadoDao;
import com.sample.core.DAO.RodadoDaoImp;

@WebServlet("/EliminarRodado")
public class EliminarRodadoController extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        RodadoDao dao = new RodadoDaoImp();
        try {
			dao.delete(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        response.getWriter().write("ok");
    }
}