package com.example.models;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnSave;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.txtHello);
    }
    public MyModel GetAppFromModel(){
        return new MyModel("Master coding",1,2);
    }

    public void DisplayAppInText(View v){
        tv.setText(GetAppFromModel().getAppName()+"Downloads"
                +GetAppFromModel().getAppDownloads());
    }
}

// here MVC pattern
// Model= Model class usually db or network connections
// Controller is the main activity
