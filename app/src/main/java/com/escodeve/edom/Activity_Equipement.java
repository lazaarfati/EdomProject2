package com.escodeve.edom;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import com.escodeve.edom.modele.Equipement;


/**
 * Created by fati on 13/08/2016.
 */

public class Activity_Equipement extends AppCompatActivity {

	List<Equipement> myEquipements= new ArrayList<Equipement>();


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_equipement_formulaire);

		populateCarList();
		populateListView();
		Button btn2=(Button)findViewById(R.id.ajouter);
		btn2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				finish();


			}
		});
		/*Button terminer=(Button) findViewById(R.id.btn_terminer3);
		terminer.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});*/

	}
	private void populateCarList() {

		myEquipements.add(new Equipement("", R.drawable.device_state_dimmeronoff, "Prise"));
		myEquipements.add(new Equipement("", R.drawable.device_state_discretegatewithpedestrianposition_100, "Porte"));
		myEquipements.add(new Equipement("", R.drawable.device_state_evohomecontroller_auto, "Température"));
		myEquipements.add(new Equipement("", R.drawable.device_state_genericcamera, "camera"));
		myEquipements.add(new Equipement("", R.drawable.device_state_hitachiswimmingpool_on, "Piscine"));
		myEquipements.add(new Equipement("", R.drawable.device_state_pergolahorizontalawning_100, "Bache"));
		myEquipements.add(new Equipement("", R.drawable.device_state_positionableexteriorvenetianblindwithwp_75, "Fenetre"));
		myEquipements.add(new Equipement("", R.drawable.device_state_positionableslidinggaragedoor_75, "Garage"));

	}
	private void populateListView() {
		ArrayAdapter<Equipement> adapter = new MyListAdapter();
		ListView list = (ListView) findViewById(R.id.ListView);
		list.setAdapter(adapter);
	}



	private class MyListAdapter extends ArrayAdapter<Equipement> {
		public MyListAdapter() {
			super(Activity_Equipement.this, R.layout.type_equipement,myEquipements);
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// Make sure we have a view to work with (may have been given null)
			View itemView = convertView;
			if (itemView == null) {
				itemView = getLayoutInflater().inflate(R.layout.type_equipement, parent, false);
			}

			// Find the car to work with.
			Equipement currentequipement = myEquipements.get(position);


			ImageView imageView = (ImageView)itemView.findViewById(R.id.item_icon);
			imageView.setImageResource(currentequipement.getIconID());


			EditText Equipementname = (EditText) itemView.findViewById(R.id.EquipementName);
			Equipementname.setText(currentequipement.getname());


			TextView Equipementtype = (TextView) itemView.findViewById(R.id.EquipementType);
			Equipementtype.setText("" + currentequipement.gettype());

			return itemView;
		}
	}


}












