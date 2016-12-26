package com.escodeve.edom;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.escodeve.edom.R;


public class Activity extends AppCompatActivity {
    public Button buttonnext;
    public void init(){
        buttonnext=(Button)findViewById(R.id.button_ajouter1);
        buttonnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);
        init();
    }
}




