
package testeDeSoftware;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CommandInicial implements Comando {

    @Override
    public void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
        
        //List<Evento> evento = EventoDAO.getInstance().listUnicEvent(eventoCod);
        
        
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/inicial.jsp");
        despachante.forward (request, response);
        
        
        
    }
    
}
