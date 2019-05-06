package com.android.displaygithubusers.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.android.displaygithubusers.R;
import com.android.displaygithubusers.adapters.UserAdapter;
import com.android.displaygithubusers.api.RetrofitClient;
import com.android.displaygithubusers.models.Users;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private UserAdapter mAdapter;
    private ArrayList<Users> usersArrayList = new ArrayList<>();
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = new ProgressBar(this);
        progressBar.setVisibility(View.VISIBLE);

        recyclerView = findViewById(R.id.recycler_users);
        mAdapter = new UserAdapter(usersArrayList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(mAdapter);

        allUsers();
    }

    private void allUsers(){

        Call<ArrayList<Users>> api = RetrofitClient.getInstance().getApi().getusers();
        api.enqueue(new Callback<ArrayList<Users>>() {
            @Override
            public void onResponse(Call<ArrayList<Users>> call, Response<ArrayList<Users>> response) {
                Toast.makeText(MainActivity.this, "got here", Toast.LENGTH_LONG).show();

                generateUsers(response.body());
            }

            @Override
            public void onFailure(Call<ArrayList<Users>> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void generateUsers(ArrayList<Users> usersArrayList) {
        recyclerView = findViewById(R.id.recycler_users);
        mAdapter = new UserAdapter(usersArrayList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(mAdapter);
    }
}
