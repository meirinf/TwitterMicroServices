package com.twitter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.twitter.entity.TweetUser;

@Repository
public interface UserRepository extends JpaRepository<TweetUser, Long>{
}
