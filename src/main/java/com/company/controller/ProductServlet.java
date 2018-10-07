package com.company.controller;

import com.company.model.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class ProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
try {

    String sql = "select pervie 5 gavna s db";
    Connection conn = null;
    Statement statement = conn.createStatement();
    ResultSet rs = statement.executeQuery(sql);

    Product prod = new Product();
    prod.setId(rs.getInt("id"));
    prod.setName(rs.getString("name"));
    prod.setPrice(rs.getInt("price"));

    req.setAttribute("prodName", prod.getName());
    req.setAttribute("prodPrice", prod.getPrice());

    int i = 0;
    for (Product prod1 : productList){
        req.setAttribute("prodName" + String.valueOf(i), prod.getName());
        req.setAttribute("prodPrice" + String.valueOf(i), prod.getPrice());
        i++;
    }



    req.getRequestDispatcher("/").forward(req, resp);
} catch (Exception e){
    System.err.println(e);
}
    }
}
