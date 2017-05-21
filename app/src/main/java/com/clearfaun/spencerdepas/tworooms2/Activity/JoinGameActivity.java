package com.clearfaun.spencerdepas.tworooms2.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.clearfaun.spencerdepas.tworooms2.Model.Game;
import com.clearfaun.spencerdepas.tworooms2.Model.User;
import com.clearfaun.spencerdepas.tworooms2.Model.Users;
import com.clearfaun.spencerdepas.tworooms2.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class JoinGameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_game);

        EditText gameCodeTextView = (EditText) findViewById(R.id.enter_game_code);




        User user = new User();
        Users users = new Users();
        users.addUser(user);

        gameCodeTextView.setText(gameCodeTextView.getText().toString());

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("games");

        //myRef.child(game.getGameID()).setValue("users");

        //myRef.child(game.getGameID()).child("Users").child(user.getUID()).setValue(user);



    }
}
