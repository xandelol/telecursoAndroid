package com.xandecompany.telecursoxandao;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Alexandre on 11/01/2017.
 */

public class MovieAdapter extends ArrayAdapter<Movie> {
    private int layout;

    public MovieAdapter(Context context, int layout, List<Movie> movies){
        super(context, layout, movies);
        this.layout = layout;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent){
        if (view == null){
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(this.layout, parent, false);
        }

        TextView name = (TextView) view.findViewById(R.id.nameMovie);
        TextView year = (TextView) view.findViewById(R.id.yearMovie);
        TextView rating = (TextView) view.findViewById(R.id.ratingMovie);

        Movie movie = getItem(position);

        name.setText(movie.getNome());
        year.setText("Year: " + movie.getYear());
        rating.setText(String.valueOf(movie.getRating()));

        return view;
    }
}
