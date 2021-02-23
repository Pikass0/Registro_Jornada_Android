package com.c2b.fichaje;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.c2b.fichaje.modelo.Empleado;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnEntrar = findViewById(R.id.btn_entrar);
        EditText etDni = findViewById(R.id.et_dni);
        EditText etClave = findViewById(R.id.et_clave);



        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dni = etDni.getText().toString().trim();
                String clave = etClave.getText().toString();
                //todo ws para log aqui
                Empleado empleado = new Empleado("Tester", "Test",
                        "12345678A", "1234", "c2b@c2b.com", 40f);

                if (dni.equals(empleado.getDni()) && clave.equals(empleado.getPassword())){

                }

            }
        });

    }
}