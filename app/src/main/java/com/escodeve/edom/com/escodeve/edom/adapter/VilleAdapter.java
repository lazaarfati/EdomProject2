package com.escodeve.edom.com.escodeve.edom.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.escodeve.edom.R;
import com.escodeve.edom.modele.Ville;

import java.util.List;


    public class VilleAdapter extends ArrayAdapter<Ville> {


        private List<Ville> VilleModelList;
        private int resource;
        private LayoutInflater inflater;
        //tweets est la liste des models à afficher
        public VilleAdapter(Context context,int resource, List<Ville> villes) {
            super(context, resource, villes);
            VilleModelList=villes;
            this.resource=resource;
            this.inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            VilleViewHolder holder=null;

            if(convertView == null){
                holder=new VilleViewHolder();
                convertView = inflater.inflate(resource,null);
                holder.name=(TextView)convertView.findViewById(R.id.nomVille);
                convertView.setTag(holder);

                /********/
                //
            }else{
                holder=(VilleViewHolder)convertView.getTag();
            }
            holder.name.setText("name : "+VilleModelList.get(position).getNom());


            return  convertView;}

        class VilleViewHolder{
            private TextView name;
        }


    }

