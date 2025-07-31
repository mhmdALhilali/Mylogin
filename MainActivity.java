package com.example.mylogin;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    EditText editTextEmail, editTextPassword;
    Button buttonLogin;
    TextView textViewForgot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // items  from the interface
       editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);
        textViewForgot = findViewById(R.id.textViewForgot);

        buttonLogin.setOnClickListener(v -> {
            String email = editTextEmail.getText().toString();
            String password = editTextPassword.getText().toString();

            if(email.isEmpty() || password.isEmpty()){
                Toast.makeText(MainActivity.this, " ادخل البريد وكلمة السر  ", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this, "welcom to october", Toast.LENGTH_SHORT).show();
            }        });
        textViewForgot.setOnClickListener(v -> Toast.makeText(MainActivity.this, "اصبر علينا شوي، استرجاع كلمة السر بعدين نفعله", Toast.LENGTH_SHORT).show());
    }}
