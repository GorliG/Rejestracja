package com.example.rejestracja;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import java.lang.String;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText email;
    private EditText haslo;
    private EditText powthaslo;
    private Button zatwierdz;
    private TextView komunikat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        email=findViewById(R.id.editTextEmailAddress);
        haslo= findViewById(R.id.editTextPassword);
        powthaslo=findViewById(R.id.editTextPassword2);
        zatwierdz=findViewById(R.id.button);
        komunikat=findViewById(R.id.textdokom);
        
        zatwierdz.setOnClickListener(view -> {
            String emailText = email.getText().toString().trim();
            String hasloText = haslo.getText().toString().trim();
            String powthasloText = powthaslo.getText().toString().trim();
            if(!emailText.contains("@")){
                komunikat.setText("Błędny adres e-mail");

            }else if(!hasloText.equals(powthasloText)){
                komunikat.setText("Hasła są różne");
            }else{
                komunikat.setText("Witaj,"+emailText);
            }
        });



    }
}
