package br.dev.biah.games_29.controller;

import br.dev.biah.games_29.domain.Imc;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/imc")
public class ImcServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet IMC GET...");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet IMC POST...");

        int peso = Integer.parseInt(req.getParameter("peso"));
        double altura = Double.parseDouble(req.getParameter("altura"));
        String nome = req.getParameter("nome");

        Imc imc = new Imc();
        imc.setNome(nome);
        imc.setPeso(peso);
        imc.setAltura(altura);

        req.setAttribute("imc", imc);

        req.getRequestDispatcher("resultado.jsp").forward(req, resp);

    }
}
