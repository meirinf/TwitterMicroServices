package com.twitter.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="HASHTAGS")
public class Hashtag implements java.io.Serializable{
	
	@Id @GeneratedValue(strategy=IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private long idHashtag;
	
	@Column
	private String nom;
	
	@OneToMany
	List<Tweet>Tweets;

	public Hashtag(long idHashtag, String nom, List<Tweet> tweets) {
		super();
		this.idHashtag = idHashtag;
		this.nom = nom;
		Tweets = tweets;
	}

	public long getIdHashtag() {
		return idHashtag;
	}

	public void setIdHashtag(long idHashtag) {
		this.idHashtag = idHashtag;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Tweet> getTweets() {
		return Tweets;
	}

	public void setTweets(List<Tweet> tweets) {
		Tweets = tweets;
	}
	
	
	
}
