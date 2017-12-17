package com.example.marcador;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Context context = this;
    TextView ptsLocal, ptsVisit;
    Button restartBt,backBt, local3Bt,local2Bt,local1Bt,visit3Bt,visit2Bt,visit1Bt ;
    int local, visit, puntos, marcador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        restartBt= (Button) findViewById(R.id.restartBt);
        backBt= (Button) findViewById(R.id.backBt);
        backBt.setEnabled(false);
        local3Bt= (Button) findViewById(R.id.local3Bt);
        local2Bt= (Button) findViewById(R.id.local2Bt);
        local1Bt= (Button) findViewById(R.id.local1Bt);
        visit3Bt= (Button) findViewById(R.id.visit3Bt);
        visit2Bt= (Button) findViewById(R.id.visit2Bt);
        visit1Bt= (Button) findViewById(R.id.visit1Bt);

        ptsLocal= (TextView) findViewById(R.id.ptsLocal);
        ptsVisit= (TextView) findViewById(R.id.ptsVisit);

        restartBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(context)
                        .setTitle("¿Deseas reiniciar los marcadores?")
                        .setMessage("Los marcadores se reiniciaran a 0 y los puntos se perderan.")
                        .setNegativeButton("NO",null)
                        .setPositiveButton("SI", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                ptsLocal.setText("0");
                                ptsVisit.setText("0");
                                backBt.setEnabled(false);
                            }
                        }).create().show();


            }
        });

        backBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (marcador==0){
                    local = Integer.parseInt(ptsLocal.getText().toString())-puntos;
                    ptsLocal.setText(Integer.toString(local));
                    backBt.setEnabled(false);
                }else if (marcador==1){
                    visit = Integer.parseInt(ptsVisit.getText().toString())-puntos;
                    ptsVisit.setText(Integer.toString(visit));
                    backBt.setEnabled(false);
                }
            }
        });

        local3Bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                puntos =3;
                marcador=0;
                local = Integer.parseInt(ptsLocal.getText().toString())+puntos;
                ptsLocal.setText(Integer.toString(local));
                backBt.setEnabled(true);
            }
        });

        local2Bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                marcador=0;
                puntos=2;
                local = Integer.parseInt(ptsLocal.getText().toString())+puntos;
                ptsLocal.setText(Integer.toString(local));
                backBt.setEnabled(true);
            }
        });

        local1Bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                puntos =1;
                marcador=0;
                local = Integer.parseInt(ptsLocal.getText().toString())+puntos;
                ptsLocal.setText(Integer.toString(local));
                backBt.setEnabled(true);
            }
        });

        visit3Bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                puntos =3;
                marcador=1;
                visit = Integer.parseInt(ptsVisit.getText().toString())+puntos;
                ptsVisit.setText(Integer.toString(visit));
                backBt.setEnabled(true);
            }
        });

        visit2Bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                marcador=1;
                puntos =2;
                visit = Integer.parseInt(ptsVisit.getText().toString())+puntos;
                ptsVisit.setText(Integer.toString(visit));
                backBt.setEnabled(true);
            }
        });

        visit1Bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                puntos =1;
                marcador=1;
                visit = Integer.parseInt(ptsVisit.getText().toString())+puntos;
                ptsVisit.setText(Integer.toString(visit));
                backBt.setEnabled(true);
            }
        });
    }
}
