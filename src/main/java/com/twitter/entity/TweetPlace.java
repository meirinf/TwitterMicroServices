package com.twitter.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "TWEET_PLACES")
public class TweetPlace implements java.io.Serializable  {

	private static final long serialVersionUID = -7727988798263449215L;
	
	@Id @GeneratedValue(strategy=IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;
	
	@Column(name="url")
	private String url;
	
	@Column(name="place_type")
	private String place_type;
	
	@Column(name="name")
	private String name;
	
	@Column(name="full_name")
	private String full_name;
	
	@Column(name="country_code")
	private String country_code;
	
	@Column(name="country")
	private String country;
	
	@OneToMany
	private List<Tweet> Tweet;
	
	public TweetPlace() {
	}

	public TweetPlace(Long id, String url, String place_type, String name, String full_name, String country_code,
			String country, List<com.twitter.entity.Tweet> tweet) {
		super();
		this.id = id;
		this.url = url;
		this.place_type = place_type;
		this.name = name;
		this.full_name = full_name;
		this.country_code = country_code;
		this.country = country;
		Tweet = tweet;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPlace_type() {
		return place_type;
	}

	public void setPlace_type(String place_type) {
		this.place_type = place_type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public String getCountry_code() {
		return country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public List<Tweet> getTweet() {
		return Tweet;
	}

	public void setTweet(List<Tweet> tweet) {
		Tweet = tweet;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}






