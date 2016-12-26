package com.escodeve.edom;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import com.escodeve.edom.modele.Logement;


public class icon_logement extends AppCompatActivity {
    List<Logement> myEquipements = new ArrayList<Logement>();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.icon_logement_list);
        populateCarList();
        populateListView();
        Button btn2=(Button)findViewById(R.id.terminer1);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();


            }
        });
    }
    private void populateCarList() {
        myEquipements.add(new Logement("maison", R.drawable.maison, ""));
        myEquipements.add(new Logement("hotel", R.drawable.hotel, ""));
        myEquipements.add(new Logement("magasin", R.drawable.magazin, ""));
        myEquipements.add(new Logement("villa", R.drawable.villa, ""));

    }
    private void populateListView() {
        ArrayAdapter<Logement> adapter = new MyListAdapter();
        ListView list = (ListView) findViewById(R.id.ListViewlogement);
        list.setAdapter(adapter);
    }

    private class MyListAdapter extends ArrayAdapter<Logement> {
        public MyListAdapter() {
            super(icon_logement.this, R.layout.icon_logement, myEquipements);
        }

       @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // Make sure we have a view to work with (may have been given null)
            View itemView = convertView;
            if (itemView == null) {
                itemView = getLayoutInflater().inflate(R.layout.icon_logement, parent, false);
            }

            // Find the logemeny to work with.
            Logement currentequipement = myEquipements.get(position);


            ImageView imageView = (ImageView) itemView.findViewById(R.id.item_icon1);
            imageView.setImageResource(currentequipement.getIconID());


            TextView Equipementname = (TextView) itemView.findViewById(R.id.EquipementName1);
            Equipementname.setText(currentequipement.getname());


            return itemView;
        }
    }


}
