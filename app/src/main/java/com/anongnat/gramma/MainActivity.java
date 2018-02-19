package com.anongnat.gramma;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvHello;
    private ImageView ivLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.anongnat.gramma.R.layout.activity_main);

        tvHello = findViewById(com.anongnat.gramma.R.id.tvHello);
        ivLogo = findViewById(com.anongnat.gramma.R.id.ivLogo);
        ivLogo.setVisibility( View.INVISIBLE );

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Love me love my dog", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                tvHello.setText("Anongnat Faikhao\nNickname is Gam. I'm 20 years old\nHobbies : read manga, read novel, and listen to music");

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(com.anongnat.gramma.R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == com.anongnat.gramma.R.id.action_settings) {
            ivLogo.setVisibility( View.VISIBLE );
            System.out.println( ivLogo.isEnabled() );
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
