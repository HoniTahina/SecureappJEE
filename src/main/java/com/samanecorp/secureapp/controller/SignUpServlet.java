package com.samanecorp.secureapp.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.samanecorp.secureapp.dto.UserDto;
import com.samanecorp.secureapp.service.IUserService;
import com.samanecorp.secureapp.service.UserService;

import java.io.IOException;

@WebServlet(name = "signup", urlPatterns = {"/signup"})
public class SignUpServlet extends HttpServlet {
	private IUserService userService = new UserService();
	private static final long serialVersionUID = 1L;

	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/jsp/signup.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String email = req.getParameter("email");
		String password = req.getParameter("password");
		Boolean state = false;
		UserDto userDto = new UserDto(email, password, state);
		
		userService.save(userDto);
		doGet(req, resp);
    }
}
