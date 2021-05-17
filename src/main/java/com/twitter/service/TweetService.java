package com.twitter.service;

import java.util.Optional;

import com.twitter.entity.Tweet;

public interface TweetService{
	
	//Consultar los tweets
	public Iterable<Tweet> findAll();
	
	//Consultar tweet por id
	public Optional<Tweet>findById(Long id);
	
	//Guardar un tweet
	public Tweet save(Tweet tweet);
	
	//Marcar un tweet como validado
	public Tweet updateValidated(Long id, boolean Validated);
	
	//Consultar los tweets validados por usuario.
	public Iterable<Tweet> findByValidatedTrue();
}
