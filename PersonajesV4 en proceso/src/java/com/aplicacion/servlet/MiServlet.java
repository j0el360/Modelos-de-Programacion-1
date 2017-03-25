/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplicacion.servlet;

import Fabricas.ConstructorPersonaje;
import Fabricas.Elfo;
import Fabricas.Enano;
import Fabricas.FabricaAbstracta;
import Fabricas.FabricaElfos;
import Fabricas.FabricaEnanos;
import Fabricas.FabricaHechiceros;
import Fabricas.FabricaHumanos;
import Fabricas.Hechicero;
import Fabricas.Humano;
import Fabricas.Personaje;
import static com.sun.codemodel.JOp.eq;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import static javax.management.Query.eq;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Joel
 */
public class MiServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    FabricaAbstracta fabrica;
    Personaje personaje;
 
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        
        if(Integer.parseInt(request.getParameter("personaje"))==1){
            fabrica=new FabricaHechiceros();
            personaje=new Hechicero();
            out.println(fabrica.crearArmadura().ubicacion());
          }else
        if(Integer.parseInt(request.getParameter("personaje"))==2){
            fabrica=new FabricaHumanos();
            personaje=new Humano();
            out.println(fabrica.crearArma().ubicacion());
          }else
        if(Integer.parseInt(request.getParameter("personaje"))==3){
            fabrica=new FabricaEnanos();
            personaje=new Enano();
            out.println(fabrica.crearArmadura().ubicacion());
          }else
        if(Integer.parseInt(request.getParameter("personaje"))==4){
            fabrica=new FabricaElfos();
            personaje=new Elfo();
            out.println(fabrica.crearArma().ubicacion());
           
          }
        
            
                
            
        try  {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MiServlet</title>"); 
            out.println("<script>");
            out.println("function dibujar(){"
                    
                    + "var canvas = document.getElementById(\"micanvas\");"
                    + "var lapiz = canvas.getContext(\"2d\");"
                    
                    + "var img2 = new Image();"  
                    + "var img4 = new Image();"
                    + "img4.src = \""+personaje.ubicacion()+"\";"                   
                    + "lapiz.drawImage(img4,"+personaje.personajex()+","+personaje.personajey()+");"
                    + "img2.src = \""+fabrica.crearArmadura().ubicacion()+"\";"                   
                    + "lapiz.drawImage(img2,"+fabrica.crearArmadura().x()+","+fabrica.crearArmadura().y()+");"
                    + "var img3 = new Image();"
                    + "img3.src = \""+fabrica.crearEscudo().ubicacion()+"\";"                   
                    + "lapiz.drawImage(img3,"+fabrica.crearEscudo().x()+","+fabrica.crearEscudo().y()+");"
                    + "var img = new Image();"
                    + "img.src = \""+fabrica.crearArma().ubicacion()+"\";"                   
                    + "lapiz.drawImage(img,"+fabrica.crearArma().x()+","+fabrica.crearArma().y()+");"
                    
                    + "}");
            
            out.println("</script>");
            out.println("</head>");
            out.println("<body onload=\"dibujar();\">");
            
            
            
            out.println("<canvas height=\"800px\" width=\"400px\" id=\"micanvas\"></canvas>");
            out.println("</body>");
            out.println("</html>");
        }catch(Exception e){
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
