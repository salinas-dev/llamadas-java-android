package com.salinas.costollamada;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import android.os.Bundle;

import com.google.android.material.textfield.TextInputEditText;
import com.salinas.costollamada.model.CalculoCostoLlamadaModel;

public class MainActivity extends AppCompatActivity {

    //Paso 1. Declara los views a manipular del xml
    // se crean con la clase de la (vista) .xml

    private EditText txtNombreContacto;
    private TextInputEditText txtHorasLlamada;
    private TextInputEditText txtMinutosLlamada;
    private TextInputEditText txtCostoMinutoLlamada;
    private Button btnCalcular;
    private Button btnNuevo;
    private Button btnSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Paso 2. Referenciar los views con su ID
        txtNombreContacto=findViewById(R.id.txNombreContacto);
        txtHorasLlamada=findViewById(R.id.txHorasLlamada);
        //txtMinutosLlamada=findViewById(R.id.txMinutosLlamada);
        txtMinutosLlamada = findViewById(R.id.txCostoMinutoLlamada);

        btnCalcular=findViewById(R.id.buttonCalcular);
        btnNuevo=findViewById(R.id.buttonNuevo);
        btnSalir=findViewById(R.id.buttonSalir);


        //Paso 3.

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    int horas;
                    horas=Integer.parseInt(txtHorasLlamada.getText().toString());
                    int minutos;
                    minutos=Integer.parseInt(txtMinutosLlamada.getText().toString());


                    int costoMinuto;
                    costoMinuto=Integer.parseInt(txtMinutosLlamada.getText().toString());
                    String nombreContacto;

                    nombreContacto=txtNombreContacto.getText().toString();

                    CalculoCostoLlamadaModel costoLlamada = new CalculoCostoLlamadaModel();


                    costoLlamada.setNombreContacto(nombreContacto);
                    costoLlamada.setHoraLlamada(horas);
                    costoLlamada.setMinutosLlamada(minutos);
                    costoLlamada.setCostoMinutosLlamada(costoMinuto);

                    Toast.makeText(getApplicationContext(), costoLlamada.calcularCostoLlamada(), Toast.LENGTH_LONG).show();

                }catch(Exception e){
                    Toast.makeText(getApplicationContext(),e+"",Toast.LENGTH_LONG).show();
                }

            }
        });


    }
}