package com.example.simpleconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityHasil extends AppCompatActivity {
    //Mendeklarasikan variabel dengan tipe data  TextView
    TextView txEmail, txPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        //Menghubungkan variabel txEmail dengan componen textview pada layout
        txEmail = findViewById(R.id.tvEmail);

        //Menghubungkan variabel txEmail dengan componen textview pada layout
        txPassword = findViewById(R.id.tvPassword);

        //Mendeklarasikan variabel bundle yang akan digunakan untuk mengambil
        // pesan yang dikirimkan melalui method intent
        Bundle bundle = getIntent().getExtras();

        //Membuat variabel string yang digunakan untuk menyimpan data yang
        // dikirimkan dari activity sebelumnya dengan kunci "a"
        String email = bundle.getString("a");

        //Membuat variabel string yang digunakan untuk menyimpan data yang
        // dikirimkan dari activity sebelumnya dengan kunci "b"
        String pass = bundle.getString("b");

        //Menampilkan value dari variabel email kedalam txEmail
        txEmail.setText(email);

        //Menampilkan value dari variabel email kedalam txPassword
        txPassword.setText(pass);
    }
}