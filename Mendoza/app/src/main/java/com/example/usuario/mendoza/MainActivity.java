    package com.example.usuario.mendoza;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

    public class MainActivity extends AppCompatActivity implements View.OnClickListener, FragmentoPrincipal.OnFragmentInteractionListener {

    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = (Button) findViewById(R.id.btnCalcuar);
        boton.setOnClickListener(this);
    }

        @Override
        public boolean onCreateOptionsMenu(Menu menu){
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.menu, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item){
            Intent intent;
            switch (item.getItemId()) {
                case R.id.btnCalcuar:
                    FragmentoPrincipal frgUno = new FragmentoPrincipal();
                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.txtRespuesta, frgUno);
                    transaction.commit();
                    break;
                case R.id.salario:
                    intent = new Intent(MainActivity.this, ActividadCalcular.class);
                    startActivity(intent);
                    break;
            }
            return true;
        }

        @Override
        public void onFragmentInteraction(Uri uri) {

        }

        @Override
        public void onClick(View v) {

        }
    }
