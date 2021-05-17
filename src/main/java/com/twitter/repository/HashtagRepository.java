package com.twitter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.twitter.entity.Hashtag;

public interface HashtagRepository extends JpaRepository<Hashtag, Long>{
	
	@Query(nativeQuery = true, value = "SELECT h.* FROM hashtags h JOIN "
			+ "(SELECT h.hashtags_id, count(*) FROM tweets_hashtags h "
			+ "GROUP BY hashtags_id "
			+ "ORDER BY count(*) DESC "
			+ "LIMIT 10 )as subQ "
			+ "ON (subQ.hashtags_id= h.id)")
	List<Hashtag> findTopTenHashtags();

}
