/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import beans.Producto;
import static controller.Servlet1.listaProductos;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author juan
 */
public class Buscar extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String codigo = request.getParameter("codigo");
        
        if(codigo==null || codigo.equals("")){
            
          request.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
            
        }else{
        
           // Producto producto1=new Producto();
            Producto producto1=null;
            for(int i=0;i<listaProductos.size();i++){
                if(listaProductos.get(i).getCodigo().equals(codigo)){
                   // producto1.setNombre(listaProductos.get(i).getNombre());
                    producto1=listaProductos.get(i);
                    break;
                }
  
                
            }
        
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Buscar</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Buscar at " + request.getContextPath() + "</h1>");
            if(producto1 !=null){
            out.println(producto1.toString());
            }else{
              out.println("Producto con codigo "+codigo+" no encontrado.<br/>");  
            }
            out.println("<a href='index.jsp'>Volver</a>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
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
