package com.xandecompany.telecursoxandao;

/**
 * Created by Alexandre on 10.01.2017.
 */
import android .app . Activity ;
import android .os. Bundle ;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android . widget . TextView ;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Movie 1",5,2016));
        movies.add(new Movie("Movie 2",8,2010));
        movies.add(new Movie("Movie 3",6,2008));
        movies.add(new Movie("Movie 4",9,2004));
        movies.add(new Movie("Movie 5",10,2001));
        movies.add(new Movie("Movie 6",3,2011));
        movies.add(new Movie("Movie 7",2,2009));
        movies.add(new Movie("Movie 8",9,2001));
        movies.add(new Movie("Movie 9",4,2003));
        movies.add(new Movie("Movie 10",8,2002));

        //MovieAdapter adapter = new MovieAdapter(this, R.layout.list_view_item_movie, movies);

        RecyclerView listView = (RecyclerView) findViewById(R.id.movies);

        Bundle extras = getIntent().getExtras();
        String user = extras.getString("user");
        String pass = extras.getString("pass");

        TextView userTextView = (TextView) findViewById(R.id.user);

        userTextView.setText(getString(R.string.user_name, user));
        listView.setAdapter(new MovieAdapter(movies,this));

        RecyclerView.LayoutManager layout = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        listView.setLayoutManager(layout);
    }
}
