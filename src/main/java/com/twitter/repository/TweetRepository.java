package com.twitter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.twitter.entity.Tweet;

@Repository
public interface TweetRepository extends JpaRepository<Tweet,Long>{
	
	Iterable<Tweet> findByValidatedTrue();
	
	@Query(" UPDATE TWEETDB.tweets c set c.validated = :validated WHERE c.id = :id")
    Tweet updateValidated (@Param("id") Long id, @Param("validated") boolean validated);
	
}
