package com.twitter.entity;
import static javax.persistence.GenerationType.IDENTITY;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "TWEETS")
public class Tweet implements java.io.Serializable {
	
	private static final long serialVersionUID = -7458709159187812224L;
	
	@Id @GeneratedValue(strategy=IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;
	
	@Column(name="id_str", nullable=false,length=15)
	private String id_str;
	
	@Column
	private String text;
	
	@Column(name="created_at")
	private String created_at;
	
	@Column(name="validated")
	private boolean validated;
	
	@ManyToOne
	private TweetUser user;
	
	@OneToOne
	private TweetPlace place;
	
	@ManyToMany
	private List<Hashtag> hashtags;
	
	public Tweet() {
	}

	public Tweet(Long id, String id_str, String text, String created_at, boolean validated, TweetUser user,
			TweetPlace place, List<Hashtag> hashtags) {
		super();
		this.id = id;
		this.id_str = id_str;
		this.text = text;
		this.created_at = created_at;
		this.validated = validated;
		this.user = user;
		this.place = place;
		this.hashtags = hashtags;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getId_str() {
		return id_str;
	}

	public void setId_str(String id_str) {
		this.id_str = id_str;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public boolean isValidated() {
		return validated;
	}

	public void setValidated(boolean validated) {
		this.validated = validated;
	}

	public TweetUser getUser() {
		return user;
	}

	public void setUser(TweetUser user) {
		this.user = user;
	}

	public TweetPlace getPlace() {
		return place;
	}

	public void setPlace(TweetPlace place) {
		this.place = place;
	}

	public List<Hashtag> getHashtags() {
		return hashtags;
	}

	public void setHashtags(List<Hashtag> hashtags) {
		this.hashtags = hashtags;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	

	
}









