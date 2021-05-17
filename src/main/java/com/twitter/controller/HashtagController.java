package com.twitter.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.twitter.entity.Hashtag;
import com.twitter.entity.Tweet;
import com.twitter.service.HashtagService;

public class HashtagController {
	
	
	@Autowired
	private HashtagService hashtagService;
	
	@GetMapping()
	public List<Hashtag> readAllTweets(){
		List <Hashtag> hashtag = StreamSupport.stream(hashtagService.findTopTenHashtags().spliterator(),false)
				.collect(Collectors.toList());
		return hashtag;
	}

}
