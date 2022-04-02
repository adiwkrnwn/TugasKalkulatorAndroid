package com.example.kalkulatoruhuy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8,
            button9, buttonTambah, buttonKali, buttonBagi, buttonKurang, buttonHasil, buttonReset;
    EditText editTampil;

    int bilanganSatu, bilanganDua;

    boolean tambah, kali, bagi, kurang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonTambah = (Button) findViewById(R.id.buttonTambah);
        buttonKurang = (Button) findViewById(R.id.buttonKurang);
        buttonBagi = (Button) findViewById(R.id.buttonBagi);
        buttonKali = (Button) findViewById(R.id.buttonKali);
        buttonHasil = (Button) findViewById(R.id.buttonHasil);
        buttonReset = (Button) findViewById(R.id.buttonReset);
        editTampil = (EditText) findViewById(R.id.editTampil);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTampil.setText(editTampil.getText() + "0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTampil.setText(editTampil.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTampil.setText(editTampil.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTampil.setText(editTampil.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTampil.setText(editTampil.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTampil.setText(editTampil.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTampil.setText(editTampil.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTampil.setText(editTampil.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTampil.setText(editTampil.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTampil.setText(editTampil.getText() + "9");
            }
        });

        buttonTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editTampil == null) {
                    editTampil.setText("");
                } else {
                    bilanganSatu = Integer.parseInt(editTampil.getText() + "");
                    tambah = true;
                    editTampil.setText(null);
                }
            }
        });

        buttonKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editTampil == null) {
                    editTampil.setText("");
                }
                bilanganSatu = Integer.parseInt(editTampil.getText() + "");
                kurang = true;
                editTampil.setText(null);
            }
        });

        buttonKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editTampil == null) {
                    editTampil.setText("");
                }
                bilanganSatu = Integer.parseInt(editTampil.getText() + "");
                kali = true;
                editTampil.setText(null);
            }
        });

        buttonBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editTampil == null) {
                    editTampil.setText("");
                }
                bilanganSatu = Integer.parseInt(editTampil.getText() + "");
                bagi = true;
                editTampil.setText(null);
            }
        });

        buttonHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bilanganDua = Integer.parseInt(editTampil.getText() + "");

                if (tambah == true) {
                    editTampil.setText(bilanganSatu + bilanganDua + "");
                    tambah = false;
                }

                if (kurang == true) {
                    editTampil.setText(bilanganSatu - bilanganDua + "");
                    kurang = false;
                }

                if (kali == true) {
                    editTampil.setText(bilanganSatu * bilanganDua + "");
                    kali = false;
                }

                if (bagi == true) {
                    editTampil.setText(bilanganSatu / bilanganDua + "");
                    bagi = false;
                }
            }
        });

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTampil.setText("");
            }
        });

    }
}