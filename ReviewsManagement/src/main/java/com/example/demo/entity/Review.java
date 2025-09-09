package com.example.demo.entity;

import java.time.DateTimeException;
import java.time.LocalDateTime;

public class Review {
	
	private Integer id;
	private String firstName;
	private String lastName;
	private String email;
	private String review;
	private int rating;
	private LocalDateTime createdAt;
	private boolean hasReply;
	
}
