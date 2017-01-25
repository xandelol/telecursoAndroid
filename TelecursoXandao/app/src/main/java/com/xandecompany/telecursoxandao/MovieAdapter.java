package com.xandecompany.telecursoxandao;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Alexandre on 11/01/2017.
 */

public class MovieAdapter extends RecyclerView.Adapter {

    private List<Movie> movies;
    private Context context;

    public MovieAdapter(List<Movie> movies, Context context){
        this.movies = movies;
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(context).inflate(R.layout.main_activity,parent,false);
        MovieViewHolder holder = new MovieViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position){
        MovieViewHolder holder = (MovieViewHolder) viewHolder;

        Movie movie = movies.get(position);
        holder.name.setText(movie.getNome());
        holder.year.setText(movie.getYear());
        holder.rating.setText(movie.getRating());
    }

    @Override
    public int getItemCount(){
        return movies.size();
    }
}
