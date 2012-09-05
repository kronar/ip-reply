import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class IpDetectorServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5661514303101772232L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		final String remoteAddr = request.getRemoteAddr();
		response.setContentType("text/plain");
		response.setContentLength(remoteAddr.length());
		response.getWriter().write(remoteAddr);
	}
	

}
