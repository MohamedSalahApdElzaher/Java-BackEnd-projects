package com.spring.dao;

import org.springframework.stereotype.Component;

@Component
public class postImpl implements post {

	@Override
	public void allposts() {
		System.out.println("My POsts.dao");
	}

	@Override
	public String allComments() {
		return "My POsts.dao.Comments";
	}

	@Override
	public void display() {
		System.out.println("DISPLAY");
	}

	@Override
	public void NOtSelected() {
		System.out.println("This method should not selected!!!!!!!!!!!!!!!");
	}

}
