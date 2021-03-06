package com.clearfaun.spencerdepas.tworooms2.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.clearfaun.spencerdepas.tworooms2.Model.Game;
import com.clearfaun.spencerdepas.tworooms2.Model.User;
import com.clearfaun.spencerdepas.tworooms2.Model.Users;
import com.clearfaun.spencerdepas.tworooms2.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class NewGameActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_lobby);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView gameCodeTextView = (TextView) findViewById(R.id.game_code);


        Game game = new Game();
        User user = new User();
        Users users = new Users();
        users.addUser(user);

        gameCodeTextView.setText(game.getGameID());

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("games");

        //myRef.child(game.getGameID()).setValue("users");

        myRef.child(game.getGameID()).child("Users").child(user.getUID()).setValue(user);


        //        myRef.setValue("game1", game.getGameID());
//        myRef.getDatabase();


//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

}
