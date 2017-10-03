package com.example.sakshi.libraryapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int testMethodreturn4(){
        return 4;
    }

    String testMethodAlpha() {
        return "Alpha";
    }
}
