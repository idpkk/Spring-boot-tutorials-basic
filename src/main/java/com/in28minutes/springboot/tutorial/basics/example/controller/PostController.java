package com.in28minutes.springboot.tutorial.basics.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.springboot.tutorial.basics.example.aop.data.Comment;
import com.in28minutes.springboot.tutorial.basics.example.aop.data.Post;

@RestController
public class PostController {
	
	@GetMapping("/posts")
	public List<Post> getPosts(String postId) {
		return getListOfPosts(postId);
	}

	private List<Post> getListOfPosts(String postId) {
		Post p = new Post();
		Comment c = new Comment();
		c.setCommentTitle("1");
		c.setCommentTitle("LookingBeautiful");
		
		Comment c1 = new Comment();
		c1.setCommentTitle("1");
		c1.setCommentTitle("LookingBeautiful");
		
		Comment c2 = new Comment();
		c2.setCommentTitle("1");
		c2.setCommentTitle("LookingBeautiful");
		
		Comment c3 = new Comment();
		c3.setCommentTitle("1");
		c3.setCommentTitle("LookingBeautiful");
		
		List<Comment> comments = new ArrayList<>();
		comments.add(c);
		comments.add(c1);
		comments.add(c2);
		comments.add(c3);
		
		p.setPostId("1");
		p.setComments(comments);
		p.setLikes(4);
		p.setPostTitle("How am i looking");
		
		List<Post> posts = new ArrayList<>();
		posts.add(p);
		return posts;
	}
}
