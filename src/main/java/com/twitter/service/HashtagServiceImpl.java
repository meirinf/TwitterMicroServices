package com.twitter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.twitter.entity.Hashtag;
import com.twitter.repository.HashtagRepository;

public class HashtagServiceImpl implements HashtagService {
	
	@Autowired
	HashtagRepository repository;

	@Override
	@Transactional(readOnly = true)
	public Iterable<Hashtag> findAll() {
		return repository.findAll();
	}

	//Consultar una clasificación de los N hashtags más usados (default 10).
	@Override
	@Transactional(readOnly = true)
	public Iterable<Hashtag> findTopTenHashtags() {
		return repository.findTopTenHashtags();
	}

}
