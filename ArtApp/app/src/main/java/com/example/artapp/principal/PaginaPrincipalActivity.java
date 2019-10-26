package com.example.artapp.principal;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.artapp.R;
import com.example.artapp.entidades.Publicacion;

import java.util.ArrayList;
import java.util.List;

public class PaginaPrincipalActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
//    private PaginaPrincipalAdapter adapter;
    private List<Publicacion> listaPublicaciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_principal);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_pagina_principal);

        listaPublicaciones = new ArrayList<>();
//        adapter = new PaginaPrincipalAdapter(this, listaPublicaciones);
    }
}
