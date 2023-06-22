package security.config;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class RequestFilter  implements javax.servlet.Filter {

	public static Logger logger = LoggerFactory.getLogger(RequestFilter.class);

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void destroy() {

	}
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		String url = ((HttpServletRequest) request).getRequestURL().toString();

		//logger.debug("Inside doFilter {}", url);

		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		
		
		logger.info("URL : "+url);
//		httpResponse.setHeader("Access-Control-Allow-Origin", "http://10.210.12.236:4200");
		httpResponse.setHeader("Access-Control-Allow-Methods", "GET, POST");
		String methodParam = httpRequest.getParameter("_method");
		//logger.info("methodParam  {}", methodParam);

		if (methodParam != null) {
			logger.error("\nAccess-Control-Allow-Methods except get and post. Bad actor is attempting to use HTTP Method Tunneling. \n");
			httpResponse.reset();
			httpResponse.setStatus(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
			return;
		}
		//logger.info("http Request header1 : {} ", httpRequest.getHeaderNames());
		Enumeration<String> headersList = httpRequest.getHeaderNames();
		while (headersList.hasMoreElements()) {
			logger.debug(headersList.nextElement());
		}

		//logger.info("http Request header : {} ", httpRequest.getHeaderNames().toString());

		String xhmHeader = httpRequest.getHeader("x-http-method");
		String xhmoHeader = httpRequest.getHeader("x-http-method-override");
		String xmoHeader = httpRequest.getHeader("x-method-override");

		if ((xhmHeader != null) || (xhmoHeader != null) || (xmoHeader != null)) {
			logger.error("\n Found someheaders like x-http-method,x-http-method-override,x-method-override.  Bad actor is attempting to use HTTP Method Tunneling. \n");
			httpResponse.reset();
			httpResponse.setStatus(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
			return;
		}
		chain.doFilter(request, new CustomHttpServletResponseWrapper(httpResponse, httpRequest));
	}
	

}
