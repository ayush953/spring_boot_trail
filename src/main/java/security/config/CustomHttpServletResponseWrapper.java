package security.config;

import java.util.Arrays;
import java.util.List;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class CustomHttpServletResponseWrapper extends HttpServletResponseWrapper {
	
	private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory
			.getLogger(CustomHttpServletResponseWrapper.class);

	public CustomHttpServletResponseWrapper(HttpServletResponse response, HttpServletRequest request) {

		super(response);
		logger.debug("Inside CustomHttpServletResponseWrapper ");
		Cookie[] cookies = ((HttpServletRequest) request).getCookies();
		if (cookies != null && cookies.length > 0) {
			List<Cookie> cookieList = Arrays.asList(cookies);
			Cookie sessionCookie = cookieList.stream().filter(cookie -> "SessionId".equals(cookie.getName()))
					.findFirst().orElse(null);

			if (sessionCookie != null) {
				logger.debug("Session cookies is not null {} ", sessionCookie.getName());
				addCookie(sessionCookie);
			}

		}
		logger.debug("Outside CustomHttpServletResponseWrapper");

	}

	@Override
	public void addCookie(Cookie cookie) {

		if ("SessionId".equals(cookie.getName())) {
			logger.debug(" IdSession equals cookie get name  ");

			super.addHeader("Set-Cookie", getCookieValue(cookie));
		} else {
			super.addHeader("Set-Cookie", getCookieValue(cookie));
		}
	}

	private String getCookieValue(Cookie cookie) {
		logger.debug("Inside getCookieValue method");

		StringBuilder builder = new StringBuilder();
		builder.append(cookie.getName()).append('=').append(cookie.getValue());
		builder.append(";Path=").append("/nfhs");

		//builder.append(";SameSite=Strict");
		builder.append(";HttpOnly");
		builder.append(";Secure");
		return builder.toString();
	}

}
