package com.example.opet.atividade1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class EmailActivity extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
        firebaseAuth = FirebaseAuth.getInstance();
    }

    public void signUp(View view) {
        firebaseAuth.getCurrentUser().getEmail();

    }

    public void irParaFilme(View view) {
        Intent intent = new Intent(this, FilmeActivity.class);
        startActivity(intent);
    }
    }
}
