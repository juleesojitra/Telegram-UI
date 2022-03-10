package com.page.telegramui;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class recycleAdepter extends RecyclerView.Adapter<recycleAdepter.dataholder> {


    Activity activity;
    public static ArrayList<chatsModel> dataholder;


    public recycleAdepter(MainActivity activity, ArrayList<chatsModel> dataholder) {

        this.activity = activity;
        this.dataholder = dataholder;

    }

    @NonNull
    @Override
    public dataholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(activity).inflate(R.layout.user, parent, false);

        return new dataholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull dataholder holder, int position) {

        holder.profile.setImageResource(dataholder.get(position).getProfile());
        holder.name1.setText(dataholder.get(position).getName1());
        holder.chat.setText(dataholder.get(position).getChat());
        holder.time.setText(dataholder.get(position).getTime());
    }

    @Override
    public int getItemCount() {
        return dataholder.size();
    }

    class dataholder extends RecyclerView.ViewHolder {

        CircleImageView profile;
        TextView name1, chat, time;

        public dataholder(@NonNull View itemView) {
            super(itemView);
            profile = itemView.findViewById(R.id.profile);
            name1 = itemView.findViewById(R.id.name1);
            chat = itemView.findViewById(R.id.chat);
            time = itemView.findViewById(R.id.time);
        }

    }
}
