package com.android.displaygithubusers.api;

import com.android.displaygithubusers.models.Users;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Api {

    @GET("users")
    Call<ArrayList<Users>>getusers();

    @GET("users/{username}")
    Call<Users> aUser(@Path("username") String username);

}
