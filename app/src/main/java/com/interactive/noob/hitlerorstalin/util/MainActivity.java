package com.interactive.noob.hitlerorstalin.util;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import com.interactive.noob.hitlerorstalin.R;
import com.interactive.noob.hitlerorstalin.game.GamePlay;
import com.interactive.noob.hitlerorstalin.game.HitlerOrStalin;


public class MainActivity extends Activity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button playButton = (Button) findViewById(R.id.playButton);
        playButton.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.playButton :
                GamePlay c = new GamePlay();
                ((HitlerOrStalin)getApplication()).setCurrentGame(c);
                ((HitlerOrStalin)getApplication()).loadImage();
                //Start Game Now.. //
                i = new Intent(this, GameActivity.class);
                startActivityForResult(i, 1);
                break;
        }
    }


}

