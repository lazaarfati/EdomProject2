package com.escodeve.edom.com.escodeve.edom.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.escodeve.edom.R;
import com.escodeve.edom.modele.Piece;

import java.util.List;

public class PieceAdapter extends ArrayAdapter<Piece>{


        //pieces est la liste des models à afficher
        public PieceAdapter(Context context,int r,List<Piece> pieces){
            super(context,r,pieces);
        }

        @Override
        public View getView(int position,View convertView,ViewGroup parent){

            if(convertView==null){
                convertView= LayoutInflater.from(getContext()).inflate(R.layout.row_piece,parent,false);
            }

            LogmentViewHolder viewHolder=(LogmentViewHolder)convertView.getTag();
            if(viewHolder==null){
                viewHolder=new LogmentViewHolder();
                viewHolder.id_piece=(TextView)convertView.findViewById(R.id.id_piece);
                viewHolder.typePieceInstance=(TextView)convertView.findViewById(R.id.id_type_piece);
                // viewHolder.avatar = (ImageView) convertView.findViewById(R.id.avatar);
                convertView.setTag(viewHolder);
            }

            //getItem(position) va récupérer l'item [position] de la List<Piece> pieces
            Piece piece=getItem(0);

            //il ne reste plus qu'à remplir notre vue
            viewHolder.id_piece.setText("id : "+piece.getId());
            viewHolder.typePieceInstance.setText("type : "+piece.getTypePieceInstance().getLibeleTypePiece());

            return convertView;}


        private class LogmentViewHolder {

           public TextView id_piece;

           public TextView typePieceInstance;

        }}




