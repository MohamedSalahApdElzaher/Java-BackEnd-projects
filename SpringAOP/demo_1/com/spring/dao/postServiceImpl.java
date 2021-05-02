package com.spring.dao;

import org.springframework.stereotype.Component;

@Component
public class postServiceImpl implements postService {

	@Override
	public int allposts() {
		return 5;
	}

	@Override
	public String allComments(int x) {
		return "My POsts.Service.Comments  " + x;

	}

	@Override
	public void get() {
		System.out.println("GET");
	}

}
