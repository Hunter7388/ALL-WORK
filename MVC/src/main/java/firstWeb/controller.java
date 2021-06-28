package firstWeb;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/controller")
public class controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String param=request.getParameter("page");
	    if(param.equals("login"))
	    {
	    	getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);
	    }
	    else if(param.equals("SignUP"))
	    {
	    	getServletContext().getRequestDispatcher("/SignUP.jsp").forward(request, response);
	    }
	    else if(param.equals("About"))
	    {
	    	getServletContext().getRequestDispatcher("/About.jsp").forward(request, response);
	    }  else 
	    {
	    	getServletContext().getRequestDispatcher("/NotFound.jsp").forward(request, response);
	    } 
	
	
	
	
	}



}
