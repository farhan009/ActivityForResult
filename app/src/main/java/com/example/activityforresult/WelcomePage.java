package com.example.activityforresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class WelcomePage extends AppCompatActivity implements View.OnClickListener {

    private EditText editText;
    private Button getDataButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);

        editText = findViewById(R.id.editText_id);
        getDataButton = findViewById(R.id.getData_Button_id);

        getDataButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String value = editText.getText().toString();

        Intent intent = new Intent(WelcomePage.this, MainActivity.class);
        intent.putExtra("key", value);
        setResult(1, intent);
        finish();
    }
}
