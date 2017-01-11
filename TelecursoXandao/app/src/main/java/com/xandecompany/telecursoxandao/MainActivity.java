package com.xandecompany.telecursoxandao;

/**
 * Created by Alexandre on 10.01.2017.
 */
import android .app . Activity ;
import android .os. Bundle ;
import android . widget . TextView ;

public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        Bundle extras = getIntent().getExtras();
        String user = extras.getString("user");
        String pass = extras.getString("pass");

        TextView userTextView = (TextView) findViewById(R.id.user);
        TextView passTextView = (TextView) findViewById(R.id.pass);

        userTextView.setText(getString(R.string.user_name, user));
        passTextView.setText(getString(R.string.pass_word, pass));
    }
}
