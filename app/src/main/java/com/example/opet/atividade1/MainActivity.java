package com.example.opet.atividade1;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class MainActivity extends AppCompatActivity {

    private EditText editLogin, editSenha;
    private FirebaseAuth firebaseAuth;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_email);
            editLogin = findViewById(R.id.editLogin);
            editSenha = findViewById(R.id.editSenha);

            firebaseAuth = FirebaseAuth.getInstance();
        }

        public void signUp(View view) {
            String login = editLogin.getText().toString();
            String senha = editSenha.getText().toString();
            firebaseAuth.getCurrentUser().getEmail();

        }

    public void irParaEmail(View view) {
        Intent intent = new Intent(this, EmailActivity.class);
        startActivity(intent);
    }

}
