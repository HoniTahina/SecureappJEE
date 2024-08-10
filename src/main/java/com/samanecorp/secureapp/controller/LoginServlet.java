package com.samanecorp.secureapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.samanecorp.secureapp.dto.UserDto;
import com.samanecorp.secureapp.service.IUserService;
import com.samanecorp.secureapp.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet(name = "login", urlPatterns = { "/login" })
public class LoginServlet extends HttpServlet {

	private IUserService userService = new UserService();
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LoggerFactory.getLogger(LoginServlet.class);
	

	@Override
	public void init() throws ServletException {
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		logger.info("Loading login page");
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String email = req.getParameter("email");
		String pwd = req.getParameter("password");
		
		logger.info("L'email envoyé est {} ", email);
		try {
			Optional<UserDto> user = userService.login(email, pwd);
			if (user.isPresent()) {
				req.getSession().setAttribute("username", email);
				resp.sendRedirect("welcome");
			} else {
				resp.sendRedirect("login");
			}
		} catch (Exception e) {
			logger.error("Erreur", e);
			resp.sendRedirect("login");
		}
		
	}
}
