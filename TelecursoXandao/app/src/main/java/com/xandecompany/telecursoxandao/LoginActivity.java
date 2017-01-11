package com.xandecompany.telecursoxandao;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText userEditText = (EditText) findViewById(R.id.editUser);
        final EditText passEditText = (EditText) findViewById(R.id.editPass);
        Button button = (Button) findViewById(R.id.button1);


        button.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                    String user = userEditText.getEditableText().toString();
                    String pass = passEditText.getEditableText().toString();

                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    intent.putExtra("user",user);
                    intent.putExtra("pass",pass);
                    startActivity(intent);
            }
        });
    }
}
