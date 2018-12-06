package com.example.usuario.mendoza;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActividadCalcular extends AppCompatActivity {

    TextView resultado;
    Button boton, boton1;
    TextView horas;
    TextView precio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_calcular);

        boton = (Button) findViewById(R.id.btnResultado);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                horas = (TextView)findViewById(R.id.txtHoras);
                precio = (TextView)findViewById(R.id.txtPrecio);

                int h = Integer.parseInt(horas.getText().toString());
                int p = Integer.parseInt(precio.getText().toString());
                double valor=h*p;
                if(h>40){
                    int v1 = h-40;
                    valor = (h-v1)*p+v1*(p*1.5);
                }else if(h<40&&valor<=200){
                    valor = h * p;
                }
                if(valor>200){
                    valor = valor-((valor-200)*0.1);
                }

                Toast.makeText(ActividadCalcular.this, "total: "+valor, Toast.LENGTH_SHORT).show();
            }
        });


    }
}
