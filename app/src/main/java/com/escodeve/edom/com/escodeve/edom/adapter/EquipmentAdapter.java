package com.escodeve.edom.com.escodeve.edom.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.escodeve.edom.R;
import com.escodeve.edom.modele.Equipment;

import java.util.List;


public class EquipmentAdapter extends ArrayAdapter<Equipment>{


    private List<Equipment> EquipmentModelList;
    private int resource;
    private LayoutInflater inflater;
        //equipements est la liste des models à afficher
        public EquipmentAdapter(Context context,int resource,List<Equipment> equipements){
                super(context, resource, equipements);
                EquipmentModelList=equipements;
                this.resource=resource;
                this.inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            }

        @Override
        public View getView(int position,View convertView,ViewGroup parent){
            EquipementViewHolder holder=null;
            if(convertView == null){
                holder=new EquipementViewHolder();
                convertView = inflater.inflate(resource,null);
                holder.id_equipement=(TextView)convertView.findViewById(R.id.id_equipement);
                holder.designation=(TextView)convertView.findViewById(R.id.id_designation_equipement);
                holder.typeEquipmentInstance=(TextView)convertView.findViewById(R.id.id_type_equipement);
                convertView.setTag(holder);

                /********/
                //
            }else{
                holder=(EquipementViewHolder)convertView.getTag();
            }

            //getItem(position) va récupérer l'item [position] de la List<Equipement> equipments
            Equipment equipement=getItem(0);

            //il ne reste plus qu'à remplir notre vue
            holder.id_equipement.setText("id : "+equipement.getId_equipement());
            holder.designation.setText("designation : "+equipement.getDesignation());
            holder.typeEquipmentInstance.setText("type:"+equipement.getTypeEquipmentInstance().getDesignation());

            return convertView;}


        private class EquipementViewHolder {


           public  TextView id_equipement;

           public TextView designation;


            public TextView typeEquipmentInstance;

        }}



