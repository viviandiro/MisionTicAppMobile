package com.example.myappreto1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnProd, btnServi, btnSucur;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_store);

        setContentView(R.layout.activity_main);

        btnProd=(Button) findViewById(R.id.btnProd);
        btnServi=(Button) findViewById(R.id.btnServi);
        btnSucur=(Button) findViewById(R.id.btnSucur);

        btnProd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Toast.makeText(getApplicationContext(), "Producto su funcion se implementara en la siguiente version", Toast.LENGTH_SHORT).show();
            }
        });
        btnServi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           Toast.makeText(getApplicationContext(), "Servicio su funcion se implementara en la siguiente version", Toast.LENGTH_SHORT).show();
            }
        });
        btnSucur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Sucursal su funcion se implementara en la siguiente version", Toast.LENGTH_SHORT).show();
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu1,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.productos:
                Toast.makeText(getApplicationContext(), "Producto Seleccionado", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.servicios:
                Toast.makeText(getApplicationContext(), "Servicio Seleccionado", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.sucursales:
                Toast.makeText(getApplicationContext(), "Sucursal Seleccionada", Toast.LENGTH_SHORT).show();
                return true;
            default:
                 return super.onOptionsItemSelected(item);
        }
    }
}