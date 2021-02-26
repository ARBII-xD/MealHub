package com.arbiiapplication.mealhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String MSG = "com.arbiiapplication.mealhub.ORDER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void orderNow(View view){
        Intent intent = new Intent(this, orderActivity.class);
        EditText editText1 = findViewById(R.id.editText1);
        EditText editText2 = findViewById(R.id.editText2);
        EditText editText3 = findViewById(R.id.editText3);
        EditText editText4 = findViewById(R.id.editText4);
        String message = "A person named "+ editText1.getText().toString() + " has sucessfully ordered " +
                editText2.getText().toString() + ", "+
                editText3.getText().toString() + " & "
                + editText4.getText().toString() +".";

        intent.putExtra(MSG , message);
        startActivity(intent);
    }
}