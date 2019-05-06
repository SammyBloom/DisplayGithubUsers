package com.android.displaygithubusers.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.displaygithubusers.R;
import com.android.displaygithubusers.activities.UserInfo;
import com.android.displaygithubusers.models.Users;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    private Context mCtx;
    private ArrayList<Users> usersArrayList;

    public UserAdapter(ArrayList<Users> usersArrayList) {
        this.mCtx = mCtx;
        this.usersArrayList = usersArrayList;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());

        View view = layoutInflater.inflate(R.layout.users_model, viewGroup, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder userViewHolder, int i) {

        Users users = usersArrayList.get(i);

        userViewHolder.txtviewName.setText(users.getLogin());

        final String login = usersArrayList.get(i).getLogin();

        Picasso.get()
                .load(usersArrayList.get(i).getAvatar_url())
                .into(userViewHolder.circleImageView);

        userViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), UserInfo.class);
                intent.putExtra("login", login);
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return usersArrayList.size();
    }

    class UserViewHolder extends RecyclerView.ViewHolder{

        TextView txtviewName;
        CircleImageView circleImageView;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);

            txtviewName = itemView.findViewById(R.id.user_name);
            circleImageView = itemView.findViewById(R.id.user_image);
        }
    }
}
