/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RequestLogger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user1
 */
public class MyRequestLogger extends HttpServlet implements ServletRequestListener{

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MyRequestLogger</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet MyRequestLogger at " + request.getContextPath() + "</h1>");
            
            Calendar cal=Calendar.getInstance();
            
            String log="R."+cal.getTime()+":"+"Request init";
            
            System.out.println("\n"+log);
            out.println(log);
            out.println("</body>");
            out.println("</html>");
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

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        try{
            FileWriter fwr=new FileWriter(new File("/home/user1/Desktop/013_jt_lab6/lab6/RequestLogger.log"));
            Calendar cal=Calendar.getInstance();
            String log="\nR."+cal.getTime()+":"+"Request"+sre.toString()+" destroyed";
            fwr.write(log);
            System.out.println("\n"+log);
            fwr.close();
        }
        catch(IOException ioe){
            
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        try{
            FileWriter fwr=new FileWriter(new File("/home/user1/Desktop/013_jt_lab6/lab6/RequestLogger.log"));
            Calendar cal=Calendar.getInstance();
            String log="\nR."+cal.getTime()+":"+"Request Initialized";
            
            System.out.println(log);
            fwr.write(log);
            fwr.close();
        }
        catch(IOException ioe){
            System.out.println("\nERROR in MYFILE\n");
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
