package com.twitter.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twitter.entity.Tweet;
import com.twitter.entity.TweetUser;
import com.twitter.service.TweetService;

@RestController
@RequestMapping("/api/tweets")
public class TweetsController {
	
	@Autowired
	private TweetService tweetService;
	
	//Create new tweet
	@PostMapping
	public ResponseEntity<?> createTweet(@RequestBody Tweet tweet){
		TweetUser user = tweet.getUser();
		if(user.getFollowers_count()==1500) {
			return ResponseEntity.status(HttpStatus.CREATED).body(tweetService.save(tweet));
		}
		return ResponseEntity.notFound().build();
	}
	
	@GetMapping()
	public List<Tweet> readAllTweets(){
		List <Tweet> tweet = StreamSupport.stream(tweetService.findAll().spliterator(),false)
				.collect(Collectors.toList());
		return tweet;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> readTweetbyId(@PathVariable(value = "id") Long id){
		Optional<Tweet> tweet = tweetService.findById(id);
		if(tweet.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(tweet);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<?> updateValidationTrue(@PathVariable(value = "id")Long id){
		return ResponseEntity.status(HttpStatus.CREATED).body(tweetService.updateValidated(id, true));
	}
	
	@GetMapping()
	public ResponseEntity<?> allValidated(){
		Iterable<Tweet> tweet = tweetService.findByValidatedTrue();
		if(tweet != null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(tweet);
	}
}
