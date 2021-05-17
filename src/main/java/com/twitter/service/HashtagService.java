package com.twitter.service;

import com.twitter.entity.Hashtag;

public interface HashtagService {
	
	
	public Iterable<Hashtag> findAll();
	
	public Iterable<Hashtag> findTopTenHashtags();

}
