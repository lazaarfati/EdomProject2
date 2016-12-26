package com.escodeve.edom;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
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


public class AskAddPiece extends AppCompatActivity {

    private FloatingActionButton btnn;
    private CustomGridViewAdapter mAdapter;
    private ArrayList<Integer> listFlag;
    private GridView gridView;
    private ArrayList<String> typePiece;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ask_add_piece);
      //  new HttpRequestTask().execute();
      prepareList();
// Set custom adapter to gridview
        gridView = (GridView) findViewById(R.id.gridview);
        // prepared arraylist and passed it to the Adapter class
       mAdapter = new CustomGridViewAdapter(AskAddPiece.this,typePiece, listFlag);


        gridView.setAdapter(mAdapter);

        // Implement On Item click listener
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position,
                                    long arg3) {
                Toast.makeText(AskAddPiece.this, mAdapter.getItem(position), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(AskAddPiece.this, equipementActivity_main.class);
                startActivity(intent);
            }
        });

        Button plus_btn=(Button) findViewById(R.id.btn_ajouter1);
        plus_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AskAddPiece.this, AddPiece.class);
                startActivity(intent);
            }
        });

     /*   Button terminer=(Button) findViewById(R.id.btn_terminer2);
        terminer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
*/
    }



    public void prepareList()
    {
        typePiece = new ArrayList<String>();
        typePiece.add("cuisine");
        typePiece.add("salle");
        typePiece.add("cuisine");
        typePiece.add("salle");
        typePiece.add("cuisine");
        typePiece.add("salle");
        typePiece.add("cuisine");
        typePiece.add("salle");

        listFlag = new ArrayList<Integer>();
        listFlag.add(R.drawable.icon_10a);
        listFlag.add(R.drawable.icon_11a);
        listFlag.add(R.drawable.icon_12a);
        listFlag.add(R.drawable.icon_13a);
        listFlag.add(R.drawable.icon_14a);
        listFlag.add(R.drawable.icon_15a);
        listFlag.add(R.drawable.icon_16a);
        listFlag.add(R.drawable.icon_17a);

    }
  /*  private class HttpRequestTask extends AsyncTask<Void, Void,ArrayList<Piece>>
    {
        @Override
        protected ArrayList<Piece>doInBackground(Void... params) {
            RestTemplate restTemplate = new RestTemplate();
            try {
                ResponseEntity<ArrayList<Piece>> rateResponse =
                        restTemplate.exchange("http://172.16.0.68:8080/EdomRestAPI/piece/list",
                                HttpMethod.GET, null, new ParameterizedTypeReference<ArrayList<Piece>>() {
                                });
                ArrayList<Piece> rates = rateResponse.getBody();

                return rates;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            return null;
        }

        @Override
        protected void onPostExecute(ArrayList<Piece> result) {
            super.onPostExecute(result);
            //dialog.dismiss();
            prepareList();
            if(result != null) {
                Toast.makeText(getApplicationContext(), "good ", Toast.LENGTH_SHORT).show();
                typePiece=new ArrayList<>();
                for(int i=0;i<result.size();i++) {

                    typePiece.add(result.get(i).getTypePieceInstance().getLibeleTypePiece());
                }
                mAdapter = new CustomGridViewAdapter(AskAddPiece.this,typePiece, listFlag);

                // LogmentAdapter adapter = new LogmentAdapter(getActivity().getApplicationContext(), R.layout.list_logement_fragment_list, result);
                gridView.setAdapter(mAdapter);
                gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        Intent intent = new Intent(AskAddPiece.this, equipementActivity_main.class);
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