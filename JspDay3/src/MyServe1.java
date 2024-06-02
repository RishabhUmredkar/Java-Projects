import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.ServerApplicationConfig;
import javax.xml.ws.Response;

import com.sun.xml.internal.ws.api.policy.PolicyResolver.ServerContext;

public class MyServe1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		ServletConfig config = getServletConfig();
		String name = config.getInitParameter("hr_name");

		out.print("<br>name"+name);
		out.print("<br>name"+name);
		out.print("<br>name"+name);
		out.print("<br>name"+name);
		out.print("<br>name"+name);
		out.print("<br>name"+name);
		out.print("<br>name"+name);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

	
	
	
}
