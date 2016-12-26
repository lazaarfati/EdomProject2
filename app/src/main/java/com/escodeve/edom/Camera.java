package com.escodeve.edom;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;


public class Camera extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.camera_activity);
        Button btnn = (Button) findViewById(R.id.button_ok);
        btnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();

            }


        });}

    public void onRadioButtonClicked(View v) {
        ImageView iv = (ImageView) findViewById(R.id.camera);
        //require to import the RadioButton class
        RadioButton rb1 = (RadioButton) findViewById(R.id.on);
        RadioButton rb2 = (RadioButton) findViewById(R.id.off);

        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.on:
                if (checked)
                    iv.setImageResource(R.drawable.camera_ouvert);
                break;

            case R.id.off:
                if (checked)
                    iv.setImageResource(R.drawable.camera);
                break;
        }

    }
}

