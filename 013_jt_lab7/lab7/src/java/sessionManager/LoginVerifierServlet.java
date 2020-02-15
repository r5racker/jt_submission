/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionManager;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author user1
 */
public class LoginVerifierServlet extends HttpServlet {

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
                if(request.getSession(false).getAttribute("jusername")!=null){
                    String username=(String)request.getSession().getAttribute("jusername");
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Servlet LoginVerifierServlet</title>");            
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<h1>Welcome"+username+"</h1>");
                    out.println("<a href=first.jsp>first</a><br>");
                    out.println("<a href=second.jsp>second</a><br>");

                    out.println("<a href='logout.jsp'>logout</a>");
                    out.println("</body>");
                    out.println("</html>");

                }
                else if((request.getParameter("username").compareTo("user1")==0)&&(request.getParameter("password").compareTo("user10702")==0)){
                        /* TODO output your page here. You may use following sample code. */
                        String username=request.getParameter("username");
                        HttpSession session=request.getSession();
                        session.setAttribute("jusername", username);
                        out.println("<!DOCTYPE html>");
                        out.println("<html>");
                        out.println("<head>");
                        out.println("<title>Servlet LoginVerifierServlet</title>");            
                        out.println("</head>");
                        out.println("<body>");
                        out.println("<h1>Welcome"+username+"</h1>");
                        out.println("<a href=first.jsp>first</a><br>");
                        out.println("<a href=second.jsp>second</a><br>");

                        out.println("<a href='logout.jsp'>logout</a>");
                        out.println("</body>");
                        out.println("</html>");

                }
            else{
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet LoginVerifierServlet</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Please retry</h1>");
                out.println("<a href='login.jsp'>login</a>");
                out.println("</body>");
                out.println("</html>");
                
            }
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
