package com.android.displaygithubusers.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.android.displaygithubusers.R;
import com.android.displaygithubusers.api.RetrofitClient;
import com.android.displaygithubusers.models.Users;
import com.squareup.picasso.Picasso;

import java.util.Objects;

import de.hdodenhof.circleimageview.CircleImageView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserInfo extends AppCompatActivity {

    TextView name, updatedAt, createdAt, location, email,
            followers, following, company, hireable, bio;
    CircleImageView circleImageView;
    ProgressBar progressBar;
    String login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);

        progressBar = new ProgressBar(this);
        progressBar.setVisibility(View.VISIBLE);

        login = getIntent().getStringExtra("login");

        name = findViewById(R.id.profile_name);
        email = findViewById(R.id.profile_email);
        company = findViewById(R.id.profile_company);
        location = findViewById(R.id.profile_location);
        followers = findViewById(R.id.profile_followers);
        following = findViewById(R.id.profile_following);
        circleImageView = findViewById(R.id.profile_image);

        Call<Users> call = RetrofitClient.getInstance().getApi().aUser(login);
        call.enqueue(new Callback<Users>() {
            @Override
            public void onResponse(Call<Users> call, Response<Users> response) {

                name.setText(Objects.requireNonNull(response.body()).getName());
                email.setText(response.body().getEmail());
                company.setText(response.body().getCompany());
                location.setText(response.body().getLocation());
                followers.setText(String.valueOf(response.body().getFollowers()));
                following.setText(String.valueOf(response.body().getFollowing()));
                Picasso.get()
                        .load(response.body().getAvatar_url())
                        .into(circleImageView);

                progressBar.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onFailure(Call<Users> call, Throwable t) {
                Toast.makeText(UserInfo.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
