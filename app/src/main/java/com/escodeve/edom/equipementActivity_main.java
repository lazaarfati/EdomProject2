package com.escodeve.edom;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import com.escodeve.edom.com.escodeve.edom.adapter.CustomGridViewAdapter;

import java.util.ArrayList;

/**
 * toutes les parties en commentaire en une relation avec le serveur , j'ai laisser toutes en statique pour que vous puissiez tester l'application

 */


public class equipementActivity_main extends AppCompatActivity {
    private CustomGridViewAdapter mAdapter;
    private ArrayList<String> listtype;
    private ArrayList<Integer> listFlag;
    private ArrayList<String> typeEquipement;
    private GridView gridView;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipement);
      //  new HttpRequestTask().execute();
        prepareList();


        // prepared arraylist and passed it to the Adapter class
       mAdapter = new CustomGridViewAdapter(equipementActivity_main.this, listtype, listFlag);

        // laisser la création du gridview
        gridView = (GridView) findViewById(R.id.gridView2);

        gridView.setAdapter(mAdapter);

        // Implement On Item click listener
    gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position,
                                    long arg3) {
                Toast.makeText(equipementActivity_main.this, mAdapter.getItem(position), Toast.LENGTH_SHORT).show();

                if(mAdapter.getItem(position)=="porte"){

                    Intent intent = new Intent(equipementActivity_main.this, Porte.class);
                    startActivity(intent);
                }
                if(mAdapter.getItem(position)=="camera"){

                    Intent intent = new Intent(equipementActivity_main.this, Camera.class);
                    startActivity(intent);
                }
                if(mAdapter.getItem(position)=="window"){

                    Intent intent = new Intent(equipementActivity_main.this, Window.class);
                    startActivity(intent);
                }
                if(mAdapter.getItem(position)=="garage"){

                    Intent intent = new Intent(equipementActivity_main.this, Garage.class);
                    startActivity(intent);
                }

            }
        });
        Button plus_btn = (Button) findViewById(R.id.btn_ajouter2);
        plus_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(equipementActivity_main.this, Activity_Equipement.class);
                startActivity(intent);
            }
        });


    }

    public void prepareList() {
listtype=new ArrayList<String>();


        listtype.add("porte");
        listtype.add("camera");
        listtype.add("garage");
        listtype.add("window");

        listFlag = new ArrayList<Integer>();

     //   listFlag.add(R.drawable.device_state_discretegatewithpedestrianposition_100);
        listFlag.add(R.drawable.porte);
        listFlag.add(R.drawable.camera);
        //  listFlag.add(R.drawable.device_state_genericcamera);
        listFlag.add(R.drawable.garage);
        listFlag.add(R.drawable.window);




    }
  /*  private class HttpRequestTask extends AsyncTask<Void, Void,ArrayList<Equipment>>
    {
        @Override
        protected ArrayList<Equipment>doInBackground(Void... params) {
            RestTemplate restTemplate = new RestTemplate();
            try {
                ResponseEntity<ArrayList<Equipment>> rateResponse =
                        restTemplate.exchange("http://172.16.0.68:8080/EdomRestAPIV2/equipment/list",
                                HttpMethod.GET, null, new ParameterizedTypeReference<ArrayList<Equipment>>() {
                                });
                ArrayList<Equipment> rates = rateResponse.getBody();

                return rates;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            return null;
        }

        @Override
        protected void onPostExecute(ArrayList<Equipment> result) {
            super.onPostExecute(result);
            //dialog.dismiss();
            prepareList();
            if(result != null) {
                Toast.makeText(getApplicationContext(), "good ", Toast.LENGTH_SHORT).show();
                typeEquipement=new ArrayList<>();
                for(int i=0;i<result.size();i++) {

                    typeEquipement.add(result.get(i).getTypeEquipmentInstance().getDesignation());
                }
                mAdapter = new CustomGridViewAdapter(equipementActivity_main.this,typeEquipement, listFlag);

                // LogmentAdapter adapter = new LogmentAdapter(getActivity().getApplicationContext(), R.layout.list_logement_fragment_list, result);
                gridView.setAdapter(mAdapter);
                gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        Intent intent = new Intent(equipementActivity_main.this, AskAddPiece.class);
                        startActivity(intent);

                    }
                });
            }
            if(result==null){

                Toast.makeText(getApplicationContext(),"null", Toast.LENGTH_SHORT).show();

            }
        }
    }*/


}

