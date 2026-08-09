package com.ashokIT.service;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.stereotype.Service;

@Service
public class WebService {

	
	public String welcome() {
	    try {
	        String getServerIpAddress =
	                InetAddress.getLocalHost().getHostAddress();

	        return "<html>"
	                + "<head>"
	                + "<title>Spring Boot Application</title>"
	                + "</head>"
	                + "<body style='font-family: Arial; text-align: center; margin-top: 100px;'>"

	                + "<h1 style='color: #2196F3;'>"
	                + "Welcome to Spring Boot App"
	                + "</h1>"

	               

	                + "<hr style='width: 80%;'>"

	                + "<h3>Server Information</h3>"

	                + "<p style='font-size: 22px; color: blue;'>"
	                + "<b>Server IP Address:</b> "
	                + getServerIpAddress
	                + "</p>"

	                + "</body>"
	                + "</html>";

	    } catch (UnknownHostException e) {

	        return "<html>"
	                + "<body style='font-family: Arial; text-align: center; margin-top: 100px;'>"
	                + "<h1>Welcome to Spring Boot App</h1>"
	                + "<h2 style='color: red;'>"
	                + "Unable to determine server IP address"
	                + "</h2>"
	                + "</body>"
	                + "</html>";
	    }
	}
	


}
