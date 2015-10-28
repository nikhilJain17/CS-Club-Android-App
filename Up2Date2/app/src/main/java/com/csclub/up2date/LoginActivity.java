package com.csclub.up2date;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    // 1. get username, store it in string
    // 2. get password, store it in string
    // 3. send to server
    // 4. add button listeners
    // 5.

    String username;
    String password;


    EditText usernameET;
    EditText passwordET;

    Button guestLogin, accountLogin, signup, forgotPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameET = (EditText) findViewById(R.id.usernameET);
        passwordET = (EditText) findViewById(R.id.passwordET);

        accountLogin = (Button) findViewById(R.id.loginButton);
        signup = (Button) findViewById(R.id.signupButton);

    }

    // Signup Button Listener
    public void onSignupButtonClicked(View v) {

        // Take us to another activity
        Intent myIntent = new Intent(getApplicationContext(), SignupActivity.class);
        startActivity(myIntent);

    }


    // Button Listener for account button
    public void onAccountButtonClicked(View v) {

        // get text from the edittext
        // store it in a string
        username = usernameET.getText().toString();
        password = passwordET.getText().toString();

        Toast.makeText(getApplicationContext(), "Welcome " + username, Toast.LENGTH_SHORT).show();

    }



}
