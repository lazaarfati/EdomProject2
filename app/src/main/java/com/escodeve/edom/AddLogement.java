package com.escodeve.edom;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.*;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.escodeve.edom.modele.Logment;

import java.util.List;


public class AddLogement extends AppCompatActivity {

    private static Button btn,btn2;
    private static EditText editText;
    EditText editText1,editText2,editText3;
   // final String EXTRA_NOM1 = "logement_name";



    AutoCompleteTextView act;
    String[] villes={"Oujda","Fès","Meknes","Tanger","Ahfir","Berkan"};


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_logement);

        act=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        ArrayAdapter adapter= new ArrayAdapter(this,android.R.layout.select_dialog_item,villes);
        act.setThreshold(1);
        act.setAdapter(adapter);

        //verification des champs de texte

        editText = (EditText) findViewById(R.id.editText_nom);
        editText1=(EditText)findViewById(R.id.editText_typelog);
        editText2=(EditText)findViewById(R.id.editText_adr);
        editText3=(EditText)findViewById(R.id.editText_CP);

        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (editText2.getText().length()<10 && editText3.getText().length()<5 ){
                    editText2.setError("Adresse Non valide!!");
                    editText3.setError("Code postale non valide");
                }
            }
        });

        btn = (Button) findViewById(R.id.imageButton);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {


                if (editText.getText().toString().equals("") || editText1.getText().toString().equals("") || editText2.getText().toString().equals("") || editText3.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Veuillez remplir tous les champs du formulaire SVP! ", Toast.LENGTH_SHORT).show();
                } else {
                    OnClickSecond();
                    //Toast.makeText(AddLogement.this, "heehoo  ", Toast.LENGTH_SHORT).show();
                }

            }
        });
        btn2 = (Button) findViewById(R.id.cancel);
        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {


                editText.setText("");
                editText1.setText("");
                editText2 .setText("");
                editText3.setText("");


            }
        });

    }

    public void OnClickSecond(){
        btn=(Button)findViewById(R.id.imageButton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),icon_logement.class);
               // intent.putExtra(EXTRA_NOM1, editText.getText().toString());
                startActivity(intent);




            }
        });

    }
}
