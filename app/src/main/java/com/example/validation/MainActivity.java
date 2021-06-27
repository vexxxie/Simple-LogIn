package com.example.validation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText Name;
    private EditText Password;
    private Button Login;

    boolean isValid = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText) findViewById(R.id.etUsername);
        Password = (EditText) findViewById(R.id.etPassword);
        Login = (Button) findViewById(R.id.btnLogin);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputName = Name.getText().toString();
                String inputPass = Password.getText().toString();

                if (inputName.isEmpty() || inputName.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Kindly put Credential", Toast.LENGTH_SHORT).show();
                } else {
                    isValid = validateV(inputName, inputPass);
                    isValid = validateO(inputName, inputPass);
                    isValid = validateW(inputName, inputPass);
                    isValid = validateN(inputName, inputPass);
                    isValid = validateE(inputName, inputPass);


                    if (inputName.equals("admin1") && inputPass.equals("yvonne")) {
                        Intent intent = new Intent(MainActivity.this, Dash1.class);
                        startActivity(intent);
                        finish();
                    } else if (inputName.equals("admin2") && inputPass.equals("erica")){
                        Intent intent = new Intent(MainActivity.this, Dash2.class);
                        startActivity(intent);
                        finish();
                    } else if (inputName.equals("admin3") && inputPass.equals("vonne")) {
                        Intent intent = new Intent(MainActivity.this, Dash3.class);
                        startActivity(intent);
                        finish();
                    }else if (inputName.equals("admin4") && inputPass.equals("fajardan")){
                        Intent intent = new Intent(MainActivity.this, Dash4.class);
                        startActivity(intent);
                        finish();
                    } else if (inputName.equals("admin5") && inputPass.equals("novio")){
                        Intent intent = new Intent(MainActivity.this, Dash5.class);
                        startActivity(intent);
                        finish();
                    } else if (!isValid) {
                        Toast.makeText(MainActivity.this, "Wrong Credential", Toast.LENGTH_SHORT).show();
                    }

                }
            }

        });
    }

    private boolean validateV (String name, String pass){
        if (name.equals("admin1") && pass.equals("yvonne")){
            return true;
        }
        return false;
    }
    private boolean validateO (String name, String pass){
        if (name.equals("admin2") && pass.equals("erica")){
            return true;
        }
        return false;
    }

    private boolean validateW (String name, String pass){
        if (name.equals("admin3") && pass.equals("vonne")){
            return true;
        }
        return false;
    }

    private boolean validateN (String name, String pass){
        if (name.equals("admin4") && pass.equals("fajardan")){
            return true;
        }
        return false;
    }
    private boolean validateE (String name, String pass){
        if (name.equals("admin5") && pass.equals("novio")){
            return true;
        }
        return false;
    }
}