 package com.escodeve.edom.com.escodeve.edom.fragment;

import com.escodeve.edom.AddLogement;
import com.escodeve.edom.AddPiece;
import com.escodeve.edom.AskAddPiece;
import com.escodeve.edom.R;
import com.escodeve.edom.com.escodeve.edom.adapter.CustomGridViewAdapter;
import com.escodeve.edom.com.escodeve.edom.adapter.LogmentAdapter;
import com.escodeve.edom.icon_logement;
import com.escodeve.edom.modele.Logement;
import com.escodeve.edom.modele.Logment;
import com.escodeve.edom.modele.TypeLogment;


import android.app.Dialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

 /**
  * toutes les parties en commentaire en une relation avec le serveur , j'ai laisser toutes en statique pour que vous puissiez tester l'application
 */
public class list_logement_fragment extends Fragment {

    private Button btnn;
    private CustomGridViewAdapter mAdapter;
    private ArrayList<Integer> listFlag;
    private ArrayList<String> typelogement;
    private GridView gridView;
    int i=0;
     List<Logement> myEquipements = new ArrayList<Logement>();
     private static EditText editText;
     EditText editText1,editText2,editText3;

     AutoCompleteTextView act;
     String[] villes={"Oujda","Fès","Meknes","Tanger","Ahfir","Berkan"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.logemen_fragement, container, false);
        //rest
       // new HttpRequestTask().execute();
        prepareList();
        // prepared arraylist and passed it to the Adapter class
        mAdapter = new CustomGridViewAdapter(getActivity(),typelogement, listFlag);


       // Set custom adapter to gridview
        gridView = (GridView) rootView.findViewById(R.id.gridView1);
        gridView.setAdapter(mAdapter);

       // Implement On Item click listener
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position,
                                    long arg3) {
                Toast.makeText(getActivity(), mAdapter.getItem(position), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), AskAddPiece.class);
                startActivity(intent);
            }
        });

        final Intent intent = new Intent(getActivity(), AddLogement.class);
        btnn=(Button) rootView.findViewById(R.id.btn_ajouter);
        btnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivityForResult(intent, 1);

            }


        });


    return rootView;
    }



    public void prepareList()
    {

        typelogement = new ArrayList<String>();
        typelogement.add("maison");
        typelogement.add("villa");
        typelogement.add("hotel");
        typelogement.add("magazin");

        listFlag = new ArrayList<Integer>();
        listFlag.add(R.drawable.maison);
        listFlag.add(R.drawable.villa);
        listFlag.add(R.drawable.hotel);
        listFlag.add(R.drawable.magazin);

    }
     ////////////////////////////////////////////////////////////////////////:
    /* private class HttpRequestTask extends AsyncTask<Void, Void,ArrayList<Logment>>
     {
         @Override
         protected ArrayList<Logment>doInBackground(Void... params) {
             RestTemplate restTemplate = new RestTemplate();
             try {
                 ResponseEntity<ArrayList<Logment>> rateResponse =
                         restTemplate.exchange("http://172.16.0.68:8080/EdomRestAPI/logment/list",
                                 HttpMethod.GET, null, new ParameterizedTypeReference<ArrayList<Logment>>() {
                                 });
                ArrayList<Logment> rates = rateResponse.getBody();

                 return rates;
             } catch (Exception e) {
                 System.out.println(e.getMessage());
             }
             return null;
         }

         @Override
         protected void onPostExecute(ArrayList<Logment> result) {
             super.onPostExecute(result);
             //dialog.dismiss();
             prepareList();
             if(result != null) {
                 Toast.makeText(getActivity().getApplicationContext(), "good ", Toast.LENGTH_SHORT).show();
                typelogement=new ArrayList<>();
                 for(int i=0;i<result.size();i++) {

                     typelogement.add(result.get(i).getTypeLogmentInstance().getDesignation());
                 }
                 mAdapter = new CustomGridViewAdapter(getActivity(),typelogement, listFlag);

                // LogmentAdapter adapter = new LogmentAdapter(getActivity().getApplicationContext(), R.layout.list_logement_fragment_list, result);
                 gridView.setAdapter(mAdapter);
                 gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                     @Override
                     public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                         Toast.makeText(getActivity(), mAdapter.getItem(position), Toast.LENGTH_SHORT).show();
                         Intent intent = new Intent(getActivity(), AskAddPiece.class);
                         startActivity(intent);

                     }
                 });
             }
             if(result==null){

                 Toast.makeText(getActivity().getApplicationContext(),"", Toast.LENGTH_SHORT).show();

             }else {
                 Toast.makeText(getActivity().getApplicationContext(), "Not able to fetch data from server, please check url.", Toast.LENGTH_SHORT).show();
             }
         }
     }

*/
     //Validation de la formulaire



}