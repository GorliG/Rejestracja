package com.example.rejestracja;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText email;
    private EditText haslo;
    private EditText powhaslo;
    private TextView komunikat;
    private Button wyslij;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.poleedycyjneemail);
        haslo = findViewById(R.id.poleedycyjnehaslo);
        powhaslo = findViewById(R.id.poleedycyjnepowhaslo);
        wyslij = findViewById(R.id.zatwierdz);
        komunikat = findViewById(R.id.komunikaty);

        wyslij.setOnClickListener(v -> {
            String emailText = email.getText().toString().trim();
            String hasloText = haslo.getText().toString().trim();
            String powhasloText = powhaslo.getText().toString().trim();

            if (!emailText.contains("@")) {
                komunikat.setText("Błędny adres email!");
            } else if (!hasloText.equals(powhasloText)) {
                komunikat.setText("Hasła są różne!");
            } else {
                komunikat.setText("Witaj, " + emailText);
            }
        });
    }
}