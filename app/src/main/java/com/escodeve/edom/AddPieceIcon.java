package com.escodeve.edom;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.escodeve.edom.modele.Logement;

import java.util.ArrayList;
import java.util.List;


public class AddPieceIcon extends Activity {
    List<Logement> myEquipements= new ArrayList<Logement>();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_piece_icon);
        populateCarList();
        populateListView();

      Button btn2=(Button)findViewById(R.id.terminer2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();


            }
        });

    }
    private void populateCarList() {
        myEquipements.add(new Logement("Bibliothéque", R.drawable.icon_1a, ""));
        myEquipements.add(new Logement("Salle", R.drawable.icon_4a, ""));
        myEquipements.add(new Logement("S-jeux", R.drawable.icon_8a, ""));
        myEquipements.add(new Logement("Escalier", R.drawable.icon_9a, ""));
        myEquipements.add(new Logement("Cuisine", R.drawable.icon_11a, ""));
        myEquipements.add(new Logement("Toillet", R.drawable.icon_17a, ""));
        myEquipements.add(new Logement("Douche", R.drawable.icon_18a, ""));
        myEquipements.add(new Logement("CH-parents", R.drawable.icon_18a, ""));
        myEquipements.add(new Logement("CH-enfants", R.drawable.icon_20a, ""));
        myEquipements.add(new Logement("CH-bebe", R.drawable.icon_21a, " "));
        myEquipements.add(new Logement("S-vêtements", R.drawable.icon_23a, ""));
        myEquipements.add(new Logement("Garage", R.drawable.icon_25a, ""));
        myEquipements.add(new Logement("Jardin", R.drawable.icon_29a, ""));
        myEquipements.add(new Logement("Bureau", R.drawable.icon_2a, ""));
    }
    private void populateListView() {
        ArrayAdapter<Logement> adapter = new MyListAdapter();
        ListView list = (ListView) findViewById(R.id.ListViewPiece);
        list.setAdapter(adapter);
    }



    private class MyListAdapter extends ArrayAdapter<Logement> {
        public MyListAdapter() {
            super(AddPieceIcon.this,R.layout.icon_equipement,myEquipements);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // Make sure we have a view to work with (may have been given null)
            View itemView = convertView;
            if (itemView == null) {
                itemView = getLayoutInflater().inflate(R.layout.icon_equipement, parent, false);
            }

            // Find the logment to work with.
            Logement currentequipement = myEquipements.get(position);


            ImageView imageView = (ImageView)itemView.findViewById(R.id.item_icon2);
            imageView.setImageResource(currentequipement.getIconID());


            TextView Equipementname = (TextView) itemView.findViewById(R.id.EquipementName2);
            Equipementname.setText(currentequipement.getname());

            return itemView;
        }
    }


}
