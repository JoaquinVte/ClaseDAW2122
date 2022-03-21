package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonAceptar;
    private Button buttonCancelar;
    private Button buttonCentro;
    private TextView textViewLorem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

//        Usuario[] usuarios = {
//                new Usuario("Manolo", "Garcia"),
//                new Usuario("Carlos", "Lopez"),
//                new Usuario("Teresa", "Martinez"),
//                new Usuario("Luisa", "Mañez"),
//                new Usuario("Consuelo", "Muñoz"),
//                new Usuario("Tomas", "Gimenez"),
//                new Usuario("Pedro", "Sanz")
//        };
//        ArrayAdapter<Usuario> arrayAdapter = new ArrayAdapter<>(
//                this,
//                android.R.layout.simple_spinner_item,
//                usuarios);

        ArrayAdapter<CharSequence> arrayAdapter = ArrayAdapter.createFromResource(this,R.array.valores_array, android.R.layout.simple_spinner_item);
        Spinner spinner = findViewById(R.id.spinner);

        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
        TextView textView = findViewById(R.id.textViewUsuario);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //textView.setText(usuarios[i].toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

//
//        buttonAceptar = findViewById(R.id.buttonAceptar);
//        buttonCancelar = findViewById(R.id.buttonCancelar);
//        buttonCentro = findViewById(R.id.buttonCentro);
//
//        textViewLorem = findViewById(R.id.textViewLorem);
//
//        buttonAceptar.setOnClickListener(this);
//        buttonCancelar.setOnClickListener(this);
//        buttonCentro.setOnClickListener(this);
//        textViewLorem.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonAceptar:
                textViewLorem.setText("Aceptar");
                break;
            case R.id.buttonCancelar:
                textViewLorem.setText("Cancelar");
                break;
            case R.id.buttonCentro:
                textViewLorem.setText("Centro");
                break;
            default:
                textViewLorem.setText("No es un boton");
                break;
        }
    }

//    @Override
//    public void onClick(View view) {
//
//        if(view instanceof Button){
//            Button button = (Button) view;
//            if(button == buttonAceptar)
//                textViewLorem.setText("Aceptar");
//            else if(button == buttonCancelar)
//                textViewLorem.setText("Cancelar");
//            else if(button == buttonCentro)
//                textViewLorem.setText("Centro");
//        } else {
//            textViewLorem.setText("No es un boton");
//        }
//    }
}