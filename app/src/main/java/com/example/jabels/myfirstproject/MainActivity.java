package com.example.jabels.myfirstproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView textView;
    private Button helloButton;
    private Button goToAnotherActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        textView = (TextView) findViewById(R.id.textView);

        helloButton = (Button) findViewById(R.id.button2);

        //goToAnotherActivity = (Button) findViewById(R.id.intentToAnotherActivity);

        helloButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Zdarova!");
            }
        });

        /*goToAnotherActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToAnotherActivity(v);
            }
        });*/

    }

    public void sayHello(View view) {
        textView.setText("Hello!");
    }

    public void goToAnotherActivity(View v) {
        Intent intent = new Intent(this, AnotherActivity.class);
        startActivity(intent);
    }
}

