package Servlets;

import Logica.Controladora;
import Logica.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SvUsuario", urlPatterns =
{
    "/SvUsuario"
})
public class SvUsuario extends HttpServlet
{
    Controladora  controladora = new  Controladora();
    

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
         List<Usuario> listaUsuarios = new  ArrayList<>();
         
         listaUsuarios = controladora.GetUsuarios();
         
         
      
         
         //sessiones
         HttpSession  MiHttpSession =  request.getSession();
         MiHttpSession.setAttribute("listaUsuarios", listaUsuarios);       
         
         
            for (Usuario listaUsuario : listaUsuarios)
        {
            System.out.println(listaUsuario.getNombreUsuario());
        }
                 
         response.sendRedirect("verUsuario.jsp");
         
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {

        String nombreUsuario = request.getParameter("txtNombreUsuario");
        String contrasenia = request.getParameter("txtContrasenia");
        String rol = request.getParameter("txtRol");

       
        System.out.println(nombreUsuario);
        System.out.println(contrasenia);
        System.out.println( rol);
        
        controladora.CrearUsuario( nombreUsuario, contrasenia, rol);
        
         response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo()
    {
        return "Short description";
    }// </editor-fold>

}
