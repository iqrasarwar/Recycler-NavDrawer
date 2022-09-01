package com.example.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class myRecyclerViewAdapter extends RecyclerView.Adapter<myRecyclerViewAdapter.myViewHolder> {
        List<Friend> friendsList;
        public myRecyclerViewAdapter(List<Friend> friendsList) {
            this.friendsList = friendsList;
        }

        @NonNull
        @Override
        public myRecyclerViewAdapter.myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.view_item, parent, false);
            return new myViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(@NonNull myRecyclerViewAdapter.myViewHolder holder, int position) {
            holder.data=friendsList.get(position);
            holder.textViewFriendName.setText(holder.data.getName());
            holder.textViewdateFriend.setText(String.valueOf(holder.data.getDob()));
            holder.imageViewFriend.setImageResource(holder.data.getImageID());
            holder.textViewCity.setText(holder.data.getCity());
        }

        @Override
        public int getItemCount() {
            return friendsList.size();
        }


        public class myViewHolder extends RecyclerView.ViewHolder {
            ImageView imageViewFriend;
            TextView textViewFriendName;
            TextView textViewdateFriend;
            TextView textViewCity;
            Friend data;
            public myViewHolder(@NonNull View itemView) {
                super(itemView);
                imageViewFriend = itemView.findViewById(R.id.imageViewFriendPicture);
                textViewFriendName = itemView.findViewById(R.id.textViewFriendName);
                textViewdateFriend = itemView.findViewById(R.id.textViewDate);
                textViewCity = itemView.findViewById(R.id.textViewCity);
            }
        }
    }