package com.escodeve.edom.com.escodeve.edom.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.escodeve.edom.R;
import com.escodeve.edom.modele.TypePiece;

import java.util.List;

public class TypePieceAdapter extends ArrayAdapter<TypePiece> {


        private List<TypePiece> TypePieceModelList;
        private int resource;
        private LayoutInflater inflater;

        //tweets est la liste des models à afficher
        public TypePieceAdapter(Context context,int resource, List<TypePiece> typesPieces) {
            super(context, resource, typesPieces);
            TypePieceModelList=typesPieces;
            this.resource=resource;
            this.inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            TypePieceViewHolder holder=null;

            if(convertView == null){
                holder=new TypePieceViewHolder();
                convertView = inflater.inflate(resource,null);
                holder.libeleTypePiece=(TextView)convertView.findViewById(R.id.type_piece_libele);
                convertView.setTag(holder);

                /********/
                //
            }else{
                holder=(TypePieceViewHolder)convertView.getTag();
            }
            holder.libeleTypePiece.setText("libelé : " + TypePieceModelList.get(position).getLibeleTypePiece());
          


            return  convertView;}

        class TypePieceViewHolder{
            private TextView libeleTypePiece;
           
        }


    }

