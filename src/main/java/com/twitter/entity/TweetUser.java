package com.twitter.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;

import java.util.List;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name= "TWEET_USERS")
public class TweetUser implements java.io.Serializable {
	
	private static final long serialVersionUID = 6008041525078071162L;
	
	@Id @GeneratedValue(strategy=IDENTITY)
	@Column(name="Id", unique=true, nullable=false)
	private Long id;
	
	@Column(name="id_str", nullable=false, length=15)
	private String id_str;
	
	@Column(name="name", length=100)
	private String name;
	
	@Column(name="screen_name", length=100)
	private String screen_name;
	
	@Column(name="location", length=100)
	private String location; 
	
	@Column(name="url", length=100)
	private String url;
	
	@Column(name="description", length=100)
	private String description;
	
	@Column(name="verified")
	private boolean verified;
	
	@Column(name="followers_count")
	private int followers_count;
	
	@Column(name="friends_count")
	private int friends_count;
	
	@Column(name="listed_count")
	private int listed_count;
	
	@Column(name="favourites_count")
	private int favourites_count;
	
	@Column(name="statuses_count")
	private int statuses_count;
	
	@Column(name="created_at")
	private String created_at;
	
	@Column(name="utc_offset")
	private String utc_offset;
	
	@Column(name="time_zone")
	private String time_zone;
	
	@Column(name="geo_enabled")
	private boolean geo_enabled;
	
	@Column(name="lang")
	private String lang;
	
	@Column(name="contributors_enabled")
	private boolean contributors_enabled;
	
	@Column(name="is_translator")
	private boolean is_translator;
	
	@Column(name="profile_background_color")
	private String profile_background_color;
	
	@Column(name="profile_background_image_url")
	private String profile_background_image_url;
	
	@Column(name="profile_background_image_url_https")
	private String profile_background_image_url_https;
	
	@Column(name="profile_background_tile")
	private String profile_background_tile;
	
	@Column(name="profile_link_color")
	private String profile_link_color;
	
	@Column(name="profile_sidebar_border_color")
	private String profile_sidebar_border_color;
	
	@Column(name="profile_sidebar_fill_color")
	private String profile_sidebar_fill_color;
	
	@Column(name="profile_text_color")
	private String profile_text_color;
	
	@Column(name="profile_use_background_image")
	private String profile_use_background_image;
	
	@Column(name="profile_image_url")
	private String profile_image_url;
	
	@Column(name="profile_image_url_https")
	private String profile_image_url_https;
	
	@Column(name="profile_banner_url")
	private String profile_banner_url;
	
	@Column(name="default_profile")
	private boolean default_profile;
	
	@Column(name="default_profile_image")
	private boolean default_profile_image;
	
	@Column(name="following")
	private String following;
	
	@Column(name="follow_request_sent")
	private String follow_request_sent;
	
	@Column(name="notifications")
	private String notifications;
	
	@OneToMany
	List<Tweet> tweets;
	
	public TweetUser() {
	}
	
	public TweetUser(Long id, String id_str, String name, String screen_name, String location, String url,
			String description, boolean verified, int followers_count, int friends_count, int listed_count,
			int favourites_count, int statuses_count, String created_at, String utc_offset, String time_zone,
			boolean geo_enabled, String lang, boolean contributors_enabled, boolean is_translator,
			String profile_background_color, String profile_background_image_url,
			String profile_background_image_url_https, String profile_background_tile, String profile_link_color,
			String profile_sidebar_border_color, String profile_sidebar_fill_color, String profile_text_color,
			String profile_use_background_image, String profile_image_url, String profile_image_url_https,
			String profile_banner_url, boolean default_profile, boolean default_profile_image, String following,
			String follow_request_sent, String notifications) {
		super();
		this.id = id;
		this.id_str = id_str;
		this.name = name;
		this.screen_name = screen_name;
		this.location = location;
		this.url = url;
		this.description = description;
		this.verified = verified;
		this.followers_count = followers_count;
		this.friends_count = friends_count;
		this.listed_count = listed_count;
		this.favourites_count = favourites_count;
		this.statuses_count = statuses_count;
		this.created_at = created_at;
		this.utc_offset = utc_offset;
		this.time_zone = time_zone;
		this.geo_enabled = geo_enabled;
		this.lang = lang;
		this.contributors_enabled = contributors_enabled;
		this.is_translator = is_translator;
		this.profile_background_color = profile_background_color;
		this.profile_background_image_url = profile_background_image_url;
		this.profile_background_image_url_https = profile_background_image_url_https;
		this.profile_background_tile = profile_background_tile;
		this.profile_link_color = profile_link_color;
		this.profile_sidebar_border_color = profile_sidebar_border_color;
		this.profile_sidebar_fill_color = profile_sidebar_fill_color;
		this.profile_text_color = profile_text_color;
		this.profile_use_background_image = profile_use_background_image;
		this.profile_image_url = profile_image_url;
		this.profile_image_url_https = profile_image_url_https;
		this.profile_banner_url = profile_banner_url;
		this.default_profile = default_profile;
		this.default_profile_image = default_profile_image;
		this.following = following;
		this.follow_request_sent = follow_request_sent;
		this.notifications = notifications;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getScreen_name() {
		return screen_name;
	}

	public void setScreen_name(String screen_name) {
		this.screen_name = screen_name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isVerified() {
		return verified;
	}

	public void setVerified(boolean verified) {
		this.verified = verified;
	}

	public int getFollowers_count() {
		return followers_count;
	}

	public void setFollowers_count(int followers_count) {
		this.followers_count = followers_count;
	}

	public int getFriends_count() {
		return friends_count;
	}

	public void setFriends_count(int friends_count) {
		this.friends_count = friends_count;
	}

	public int getListed_count() {
		return listed_count;
	}

	public void setListed_count(int listed_count) {
		this.listed_count = listed_count;
	}

	public int getFavourites_count() {
		return favourites_count;
	}

	public void setFavourites_count(int favourites_count) {
		this.favourites_count = favourites_count;
	}

	public int getStatuses_count() {
		return statuses_count;
	}

	public void setStatuses_count(int statuses_count) {
		this.statuses_count = statuses_count;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getUtc_offset() {
		return utc_offset;
	}

	public void setUtc_offset(String utc_offset) {
		this.utc_offset = utc_offset;
	}

	public String getTime_zone() {
		return time_zone;
	}

	public void setTime_zone(String time_zone) {
		this.time_zone = time_zone;
	}

	public boolean isGeo_enabled() {
		return geo_enabled;
	}

	public void setGeo_enabled(boolean geo_enabled) {
		this.geo_enabled = geo_enabled;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public boolean isContributors_enabled() {
		return contributors_enabled;
	}

	public void setContributors_enabled(boolean contributors_enabled) {
		this.contributors_enabled = contributors_enabled;
	}

	public boolean isIs_translator() {
		return is_translator;
	}

	public void setIs_translator(boolean is_translator) {
		this.is_translator = is_translator;
	}

	public String getProfile_background_color() {
		return profile_background_color;
	}

	public void setProfile_background_color(String profile_background_color) {
		this.profile_background_color = profile_background_color;
	}

	public String getProfile_background_image_url() {
		return profile_background_image_url;
	}

	public void setProfile_background_image_url(String profile_background_image_url) {
		this.profile_background_image_url = profile_background_image_url;
	}

	public String getProfile_background_image_url_https() {
		return profile_background_image_url_https;
	}

	public void setProfile_background_image_url_https(String profile_background_image_url_https) {
		this.profile_background_image_url_https = profile_background_image_url_https;
	}

	public String getProfile_background_tile() {
		return profile_background_tile;
	}

	public void setProfile_background_tile(String profile_background_tile) {
		this.profile_background_tile = profile_background_tile;
	}

	public String getProfile_link_color() {
		return profile_link_color;
	}

	public void setProfile_link_color(String profile_link_color) {
		this.profile_link_color = profile_link_color;
	}

	public String getProfile_sidebar_border_color() {
		return profile_sidebar_border_color;
	}

	public void setProfile_sidebar_border_color(String profile_sidebar_border_color) {
		this.profile_sidebar_border_color = profile_sidebar_border_color;
	}

	public String getProfile_sidebar_fill_color() {
		return profile_sidebar_fill_color;
	}

	public void setProfile_sidebar_fill_color(String profile_sidebar_fill_color) {
		this.profile_sidebar_fill_color = profile_sidebar_fill_color;
	}

	public String getProfile_text_color() {
		return profile_text_color;
	}

	public void setProfile_text_color(String profile_text_color) {
		this.profile_text_color = profile_text_color;
	}

	public String getProfile_use_background_image() {
		return profile_use_background_image;
	}

	public void setProfile_use_background_image(String profile_use_background_image) {
		this.profile_use_background_image = profile_use_background_image;
	}

	public String getProfile_image_url() {
		return profile_image_url;
	}

	public void setProfile_image_url(String profile_image_url) {
		this.profile_image_url = profile_image_url;
	}

	public String getProfile_image_url_https() {
		return profile_image_url_https;
	}

	public void setProfile_image_url_https(String profile_image_url_https) {
		this.profile_image_url_https = profile_image_url_https;
	}

	public String getProfile_banner_url() {
		return profile_banner_url;
	}

	public void setProfile_banner_url(String profile_banner_url) {
		this.profile_banner_url = profile_banner_url;
	}

	public boolean isDefault_profile() {
		return default_profile;
	}

	public void setDefault_profile(boolean default_profile) {
		this.default_profile = default_profile;
	}

	public boolean isDefault_profile_image() {
		return default_profile_image;
	}

	public void setDefault_profile_image(boolean default_profile_image) {
		this.default_profile_image = default_profile_image;
	}

	public String getFollowing() {
		return following;
	}

	public void setFollowing(String following) {
		this.following = following;
	}

	public String getFollow_request_sent() {
		return follow_request_sent;
	}

	public void setFollow_request_sent(String follow_request_sent) {
		this.follow_request_sent = follow_request_sent;
	}

	public String getNotifications() {
		return notifications;
	}

	public void setNotifications(String notifications) {
		this.notifications = notifications;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
