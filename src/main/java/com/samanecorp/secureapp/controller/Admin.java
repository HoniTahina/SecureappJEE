package com.samanecorp.secureapp.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.samanecorp.secureapp.dto.UserDto;
import com.samanecorp.secureapp.service.IUserService;
import com.samanecorp.secureapp.service.UserService;

@WebServlet(name = "admin", urlPatterns = { "/admin" })
public class Admin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private IUserService userService = new UserService();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Admin() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<UserDto> users = new ArrayList<UserDto>();
		
		req.setAttribute("users", userService.getAll()); 
		req.getRequestDispatcher("WEB-INF/jsp/user.jsp").forward(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*
		 * String email = req.getParameter("email"); String password =
		 * req.getParameter("password"); Boolean state = false; UserDto userDto = new
		 * UserDto(email, password, state);
		 * 
		 * userService.save(userDto);
		 * 
		 * doGet(req, resp);
		 */
	}

}
