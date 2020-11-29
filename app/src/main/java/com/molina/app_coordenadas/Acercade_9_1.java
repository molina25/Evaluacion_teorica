package com.molina.app_coordenadas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Acercade_9_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acercade_9_1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id==R.id.Inicio){
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
            return true;
        }else if (id==R.id.acercade) {
            Intent intent = new Intent(this, Acercade_9_1.class);
            startActivity(intent);
            return true;

        }

        return super.onOptionsItemSelected(item);
    }
}