package Servlets;

import Logica.Controladora;
import Logica.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SvEditarUsuario", urlPatterns =
{
    "/SvEditarUsuario"
})
public class SvEditarUsuario extends HttpServlet
{

    Controladora controladora = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        int idUsuario = Integer.parseInt(request.getParameter("id"));

        System.out.println("ID: " + idUsuario);

        Usuario editarUsuario = controladora.TraerUsuarioPorId(idUsuario);

        HttpSession httpSession = request.getSession();
        httpSession.setAttribute("editarUsuario", editarUsuario);

        System.out.println("El Usuario es: " + editarUsuario.getNombreUsuario());

        response.sendRedirect("editarUsuarios.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        String nombreUsaurio = request.getParameter("txtNombreUsuario");
        String contrasenia = request.getParameter("txtContrasenia");
        String rol = request.getParameter("txtRol");
        
        Usuario usuario = (Usuario) request.getSession().getAttribute("editarUsuario");
        
        usuario.setNombreUsuario(nombreUsaurio);
        usuario.setContrasenia(contrasenia);
        usuario.setRol(rol);
        
        controladora.EditarUsuario(usuario);
        
        response.sendRedirect("SvUsuario");
    }

    @Override
    public String getServletInfo()
    {
        return "Short description";
    }// </editor-fold>

}
