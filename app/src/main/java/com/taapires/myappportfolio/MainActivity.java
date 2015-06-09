package com.taapires.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSpotifyStreamer = (Button) findViewById(R.id.btn_spotify_streamer);
        Button btnSuperDuo1 = (Button) findViewById(R.id.btn_super_duo1);
        Button btnSuperDuo2 = (Button) findViewById(R.id.btn_super_duo2);
        Button btnBuildItBigger = (Button) findViewById(R.id.btn_build_it_bigger);
        Button btnXyzReader = (Button) findViewById(R.id.btn_xyz_reader);
        Button btnCapstone = (Button) findViewById(R.id.btn_capstone);

        btnSpotifyStreamer.setOnClickListener(this);
        btnSuperDuo1.setOnClickListener(this);
        btnSuperDuo2.setOnClickListener(this);
        btnBuildItBigger.setOnClickListener(this);
        btnXyzReader.setOnClickListener(this);
        btnCapstone.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_spotify_streamer:
                Toast.makeText(getApplicationContext(), "This button will launch my Streamer app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_super_duo1:
                Toast.makeText(getApplicationContext(), "This button will launch my Scores app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_super_duo2:
                Toast.makeText(getApplicationContext(), "This button will launch my Library app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_build_it_bigger:
                Toast.makeText(getApplicationContext(), "This button will launch my Built It Bigger app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_xyz_reader:
                Toast.makeText(getApplicationContext(), "This button will launch my XYZ Reader app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_capstone:
                Toast.makeText(getApplicationContext(), "This button will launch my Capstone app", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}
