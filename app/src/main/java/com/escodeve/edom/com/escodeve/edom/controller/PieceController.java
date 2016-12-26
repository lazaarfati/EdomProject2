package com.escodeve.edom.com.escodeve.edom.controller;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.escodeve.edom.R;
import com.escodeve.edom.com.escodeve.edom.adapter.PieceAdapter;
import com.escodeve.edom.modele.Piece;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

    public class PieceController extends AppCompatActivity {

        ListView mListView;
        @Override
        protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            new HttpRequestTask().execute();
            setContentView(R.layout.activity_main);
            mListView=(ListView)findViewById(R.id.lvLogment);

        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {

            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.main_menu, menu);
            return true;
        }


        private class HttpRequestTask extends AsyncTask<Void, Void, List<Piece>>
        {
            @Override
            protected List<Piece>doInBackground(Void... params) {
                RestTemplate restTemplate = new RestTemplate();
                try {
                    ResponseEntity<List<Piece>> rateResponse =
                            restTemplate.exchange("http://172.16.0.68:8080/EdomRestAPI/piece/list",
                                    HttpMethod.GET, null, new ParameterizedTypeReference<List<Piece>>() {
                                    });
                    List<Piece> rates = rateResponse.getBody();

                    return rates;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                return null;
            }
            @Override
            protected void onPostExecute(List<Piece> result) {
                super.onPostExecute(result);
                //dialog.dismiss();
                if(result != null) {
                    Toast.makeText(getApplicationContext(), "good ", Toast.LENGTH_SHORT).show();

                    PieceAdapter adapter = new PieceAdapter(getApplicationContext(), R.layout.row_piece, result);
                    mListView.setAdapter(adapter);
                    mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            Toast.makeText(getApplicationContext(), "good ", Toast.LENGTH_SHORT).show();

                        }
                    });
                }
                if(result==null){       Toast.makeText(getApplicationContext(), "null ", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(getApplicationContext(), "Not able to fetch data from server, please check url.", Toast.LENGTH_SHORT).show();
                }
            }
        }


    }

