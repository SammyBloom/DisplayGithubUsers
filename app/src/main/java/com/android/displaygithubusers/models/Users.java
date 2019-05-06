package com.android.displaygithubusers.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Users {

   @SerializedName("login")
    private String login;

   @SerializedName("id")
    private float id;
    private String node_id;

    @SerializedName("avatar_url")
    private String avatar_url;

    private ArrayList<Users> usersArrayList;

    @SerializedName("gravatar_id")
    private String gravatar_id;

   @SerializedName("url")
    private String url;

   @SerializedName("html_url")
    private String html_url;

   @SerializedName("followers_url")
    private String followers_url;

   @SerializedName("following_url")
    private String following_url;

   @SerializedName("gists_url")
    private String gists_url;

   @SerializedName("starred_url")
    private String starred_url;

   @SerializedName("subscriptions_url")
    private String subscriptions_url;

   @SerializedName("organizations_url")
    private String organizations_url;

   @SerializedName("repos_url")
    private String repos_url;

   @SerializedName("events_url")
    private String events_url;

   @SerializedName("received_events_url")
    private String received_events_url;

    @SerializedName("type")
    private String type;

    @SerializedName("site_admin")
    private boolean site_admin;

    @SerializedName("name")
    private String name;

    @SerializedName("company")
    private String company;

    @SerializedName("blog")
    private String blog;

    @SerializedName("location")
    private String location;

    @SerializedName("email")
    private String email;

    @SerializedName("hireable")
    private boolean hireable;

    @SerializedName("bio")
    private String bio;

    @SerializedName("public_repos")
    private float public_repos;

    @SerializedName("public_gists")
    private float public_gists;

    @SerializedName("followers")
    private float followers;

    @SerializedName("following")
    private float following;

    @SerializedName("created_at")
    private String created_at;

    @SerializedName("updated_at")
    private String updated_at;


    // Getter Methods

    public String getLogin() {
        return login;
    }

    public float getId() {
        return id;
    }

    public String getNode_id() {
        return node_id;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public ArrayList<Users> getUsersArrayList() {
        return usersArrayList;
    }
    public String getGravatar_id() {
        return gravatar_id;
    }

    public String getUrl() {
        return url;
    }

    public String getHtml_url() {
        return html_url;
    }

    public String getFollowers_url() {
        return followers_url;
    }

    public String getFollowing_url() {
        return following_url;
    }

    public String getGists_url() {
        return gists_url;
    }

    public String getStarred_url() {
        return starred_url;
    }

    public String getSubscriptions_url() {
        return subscriptions_url;
    }

    public String getOrganizations_url() {
        return organizations_url;
    }

    public String getRepos_url() {
        return repos_url;
    }

    public String getEvents_url() {
        return events_url;
    }

    public String getReceived_events_url() {
        return received_events_url;
    }

    public String getType() {
        return type;
    }

    public boolean getSite_admin() {
        return site_admin;
    }

    // Setter Methods

    public void setLogin(String login) {
        this.login = login;
    }

    public void setId(float id) {
        this.id = id;
    }

    public void setNode_id(String node_id) {
        this.node_id = node_id;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public void setGravatar_id(String gravatar_id) {
        this.gravatar_id = gravatar_id;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    public void setFollowers_url(String followers_url) {
        this.followers_url = followers_url;
    }

    public void setFollowing_url(String following_url) {
        this.following_url = following_url;
    }

    public void setGists_url(String gists_url) {
        this.gists_url = gists_url;
    }

    public void setStarred_url(String starred_url) {
        this.starred_url = starred_url;
    }

    public void setSubscriptions_url(String subscriptions_url) {
        this.subscriptions_url = subscriptions_url;
    }

    public void setOrganizations_url(String organizations_url) {
        this.organizations_url = organizations_url;
    }

    public void setRepos_url(String repos_url) {
        this.repos_url = repos_url;
    }

    public void setEvents_url(String events_url) {
        this.events_url = events_url;
    }

    public void setReceived_events_url(String received_events_url) {
        this.received_events_url = received_events_url;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSite_admin(boolean site_admin) {
        this.site_admin = site_admin;
    }

    public void setUsersArrayList(ArrayList<Users> usersArrayList) {
        this.usersArrayList = usersArrayList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isHireable() {
        return hireable;
    }

    public void setHireable(boolean hireable) {
        this.hireable = hireable;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public float getPublic_repos() {
        return public_repos;
    }

    public void setPublic_repos(float public_repos) {
        this.public_repos = public_repos;
    }

    public float getPublic_gists() {
        return public_gists;
    }

    public void setPublic_gists(float public_gists) {
        this.public_gists = public_gists;
    }

    public float getFollowers() {
        return followers;
    }

    public void setFollowers(float followers) {
        this.followers = followers;
    }

    public float getFollowing() {
        return following;
    }

    public void setFollowing(float following) {
        this.following = following;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
}
