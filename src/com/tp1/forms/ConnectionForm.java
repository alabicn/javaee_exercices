package com.tp1.forms;

import javax.servlet.http.HttpServletRequest;

public class ConnectionForm {
	private String result;
	
	public void verificationConnection( HttpServletRequest request ) {
		String login = request.getParameter("username");
		String pass = request.getParameter("pass");
		
		if (pass.equals(login + "123"))			
			result = "You are connected !";
		else
			result = "Bad credentials !";
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
}
