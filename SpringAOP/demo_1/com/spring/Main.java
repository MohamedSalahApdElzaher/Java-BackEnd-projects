package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.configuration.springContainer;
import com.spring.dao.post;
import com.spring.dao.postService;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext con = 
				new AnnotationConfigApplicationContext(springContainer.class);
		
		post p = con.getBean("postImpl", post.class);
		p.allposts();
		System.out.println(p.allComments());
		p.display();
		p.NOtSelected();
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		
		postService ps = con.getBean("postServiceImpl", postService.class);
		System.out.println(ps.allposts());
		System.out.println(ps.allComments(10));
		ps.get();

	}

}
