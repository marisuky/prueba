package com.example.prueba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Edit et_nombre=findViewById(R.id.eT_nombre);
        Button botton=findViewById(R.id.btn_enviar);
        Spinner spn=findViewById(R.id.spn_niveles);
        log id_elemento=spn.getSelectedItemId();
        log.d("mietiqueta", "Elemento selecccionado: "+id_elemento);
        boton.setOnClickListener(new View.OnClickListener(){

            @Override
          public void onItemSelected(AdapterView<?>)
        }
    }
}