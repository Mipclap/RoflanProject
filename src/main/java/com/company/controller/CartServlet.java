package com.company.controller;

import com.company.model.Product;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CartServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        Map<Integer, Integer> products = new HashMap<>();
        HttpSession session = req.getSession();

        int prodId = Integer.valueOf(req.getParameter("id"));


        req.getAttribute("quantity");



    }
}
