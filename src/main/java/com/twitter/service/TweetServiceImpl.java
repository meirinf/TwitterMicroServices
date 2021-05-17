package com.twitter.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.twitter.entity.Tweet;
import com.twitter.repository.TweetRepository;

public class TweetServiceImpl implements TweetService{

	@Autowired
	TweetRepository repository;

	@Override
	@Transactional(readOnly = true)
	public Iterable<Tweet> findAll() {
		return repository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Tweet> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	@Transactional
	public Tweet save(Tweet tweet) {
		return repository.save(tweet);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Tweet> findByValidatedTrue() {
		return repository.findByValidatedTrue();
	}
	
	@Transactional
	public Tweet updateValidated(Long id, boolean validated) {
		return repository.updateValidated(id, validated);
	}

}
