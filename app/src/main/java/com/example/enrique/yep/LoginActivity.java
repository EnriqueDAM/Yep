package com.example.enrique.yep;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    public TextView titleText;
    public TextView subtitleText;
    public TextView signUpText;
    public EditText username;
    public EditText password;
    public Button btnLogIn;
    public int color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();

        titleText = (TextView) findViewById(R.id.title);
        subtitleText = (TextView) findViewById(R.id.subtitle);
        signUpText = (TextView) findViewById(R.id.SignUpText);

        Typeface myFont = Typeface.createFromAsset(getAssets(), "fonts/AmaticSC-Regular.ttf");
        titleText.setTypeface(myFont);
        subtitleText.setTypeface(myFont);
        signUpText.setTypeface(myFont);

        username = (EditText) findViewById(R.id.UserField);
        password = (EditText) findViewById(R.id.PasswordField);
        btnLogIn = (Button) findViewById(R.id.LoginButton);

        color = R.color.colorAccent;
        btnLogIn.setHighlightColor(getResources().getColor(color));

        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnLogIn.getHighlightColor();
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
