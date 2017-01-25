package com.xandecompany.telecursoxandao;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by aacds on 24/01/2017.
 */

public class MovieViewHolder extends RecyclerView.ViewHolder {
    final TextView name;
    final TextView year;
    final TextView rating;

    public MovieViewHolder(View view){
        super(view);

        name = (TextView) view.findViewById(R.id.nameMovie);
        year = (TextView) view.findViewById(R.id.yearMovie);
        rating = (TextView) view.findViewById(R.id.ratingMovie);
    }
}
