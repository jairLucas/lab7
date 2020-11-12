package com.jk.lab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    FragmentTransaction transaccion;
    Fragment FGrafico;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FGrafico = new fmt_grafico();
        getSupportFragmentManager().beginTransaction().add(R.id.contenedorFragments,FGrafico).commit();

    }
}