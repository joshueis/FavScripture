package com.example.israelcarvajal.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class FavScripture extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_scripture);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hello_word, menu);
        return true;
    }
    //My attempt to create a new activity
    public void displayScripture (View V){
        Intent intent = new Intent(this, FinalActivity.class);
        EditText editText = (EditText) findViewById(R.id.sBook);
        EditText editText1 = (EditText) findViewById(R.id.sChap);
        EditText editText2 = (EditText) findViewById(R.id.sVerse);
        String message = editText.getText().toString() + " " + editText1.getText().toString() + ":" +  editText2.getText().toString();
        intent.putExtra("SCRIPTURE", message);
        startActivity(intent);
    }

   // public void onClick(View v) {
    //    TextView theTextView = (TextView)findViewById(R.id.textView);
     //   theTextView.setText("Hello World!!!!!");

//    }

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
}
