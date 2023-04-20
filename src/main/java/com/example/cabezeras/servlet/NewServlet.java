package com.example.cabezeras.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "NewServlet", value = "/NewServlet")
public class NewServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        String metodoHttp = req.getMethod();
        //Este método lo que hace ee indicar que tipo de formulario envia la información en este caso es un metodo Get
        String requestUri = req.getRequestURI();
        //Este request lo que hace es obtener toda la información de la url incluyendo el nombre del servidor
        String requestUrl = req.getRequestURL().toString();
        //Este request lo que hace es obtener toda la información de la url incluyendo el nombre del servidor
        String contexPath = req.getContextPath();
        //
        String servletPath = req.getServletPath();
        //
        String ipCliente = req.getRemoteAddr();
        //
        String ip = req.getLocalAddr();
        //
        int port = req.getLocalPort();
        //
        String scheme = req.getScheme();
        //
        String host = req.getHeader("host");
        //
        String url = scheme + "://" + host + contexPath + servletPath;
        //
        String url2 = scheme + "://" + ip + ":" + port + contexPath + servletPath;
        //

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
