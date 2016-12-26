package com.escodeve.edom.com.escodeve.edom.controller;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.escodeve.edom.R;
import com.escodeve.edom.com.escodeve.edom.adapter.VilleAdapter;
import com.escodeve.edom.modele.Ville;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;


public class VilleController extends ActionBarActivity{


        List<Ville> rates = null;
        ListView lvVilles;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            lvVilles=(ListView)findViewById(R.id.lvLogment);

        }

        @Override
        protected void onStart() {
            super.onStart();
            new HttpRequestTask().execute();
        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {

            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.main_menu, menu);
            return true;
        }



        private class HttpRequestTask extends AsyncTask<Void, Void, List<Ville>> {

            @Override
            protected void onPostExecute(List<Ville> list) {
                super.onPostExecute(list);

                VilleAdapter adapter=new VilleAdapter(getApplicationContext(), R.layout.row_ville,list);
                lvVilles.setAdapter(adapter);
            }

            @Override
            protected List<Ville> doInBackground(Void... params) {
                try {
                    RestTemplate restTemplate = new RestTemplate();
                    ResponseEntity<List<Ville>> rateResponse =
                            restTemplate.exchange("http://172.16.0.68:8080/EdomRestAPIV2/ville/list",
                                    HttpMethod.GET, null, new ParameterizedTypeReference<List<Ville>>() {
                                    });
                    rates = rateResponse.getBody();

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                return rates;
            }


        }
    }