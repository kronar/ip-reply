import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class Runner {
	
	public static void main(String[] args) throws Exception {
		Server server = new Server(9090);
		final ServletContextHandler servletContextHandler = new ServletContextHandler();
		servletContextHandler.addServlet(new ServletHolder(new IpDetectorServlet()), "/getIp");
		server.setHandler(servletContextHandler);
		server.start();
		server.join();
	}
}
