package com.example.cabezeras.servlet;

import com.example.cabezeras.service.ProductoService;
import com.example.cabezeras.service.impl.ProductoServiceImpl;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ProductServlet", value = "/ProductServlet")
public class ProductServlet extends HttpServlet {

    ProductoService service = new ProductoServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long id = Long.valueOf(request.getParameter("id"));
        Boolean b = service.validateExistence(id);
        if (b) {
            System.out.printf("Si esta registrado");
        }else response.sendError(HttpServletResponse.SC_NOT_FOUND, "El recurso solicitado no se encuentra en el servidor.");
    }
}
