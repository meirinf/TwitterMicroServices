package com.twitter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.twitter.entity.TweetPlace;

@Repository
public interface PlaceRepository extends JpaRepository<TweetPlace, Long>{
}
