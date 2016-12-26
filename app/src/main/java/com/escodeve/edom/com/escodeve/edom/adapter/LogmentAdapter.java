package com.escodeve.edom.com.escodeve.edom.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.escodeve.edom.R;
import com.escodeve.edom.modele.Logment;

import java.util.List;


public class LogmentAdapter extends ArrayAdapter<Logment>{

//logements est la liste des models à afficher
public LogmentAdapter(Context context,int r,List<Logment> logements){
        super(context,r,logements);
        }

@Override
public View getView(int position,View convertView,ViewGroup parent){

        if(convertView==null){
        convertView= LayoutInflater.from(getContext()).inflate(R.layout.row_logment,parent,false);
        }

        LogmentViewHolder viewHolder=(LogmentViewHolder)convertView.getTag();
        if(viewHolder==null){
        viewHolder=new LogmentViewHolder();
        viewHolder.id=(TextView)convertView.findViewById(R.id.id_id);
        viewHolder.addressInstance=(TextView)convertView.findViewById(R.id.id_address);
        viewHolder.code=(TextView)convertView.findViewById(R.id.id_code);
        // viewHolder.avatar = (ImageView) convertView.findViewById(R.id.avatar);
        convertView.setTag(viewHolder);
        }

        //getItem(position) va récupérer l'item [position] de la List<Logment> tweets
        Logment logement=getItem(0);

        //il ne reste plus qu'à remplir notre vue
        viewHolder.id.setText("id : "+logement.getId());
        viewHolder.addressInstance.setText("address : "+logement.getAddressInstance().getAdress());
        viewHolder.code.setText("code:"+logement.getCode());
        //  viewHolder.avatar.setImageDrawable(new ColorDrawable(tweet.getColor()));

        return convertView;}


private class LogmentViewHolder {

       public TextView id;

        public TextView code;

        public TextView addressInstance;

}}



