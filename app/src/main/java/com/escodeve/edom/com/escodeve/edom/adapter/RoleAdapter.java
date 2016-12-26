package com.escodeve.edom.com.escodeve.edom.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.escodeve.edom.R;
import com.escodeve.edom.modele.Role;

import java.util.List;


public class RoleAdapter extends ArrayAdapter<Role>  {

        private List<Role> RoleModelList;
        private int resource;
        private LayoutInflater inflater;
        //tweets est la liste des models à afficher
        public RoleAdapter(Context context,int resource, List<Role> roles) {
            super(context, resource, roles);
            RoleModelList=roles;
            this.resource=resource;
            this.inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            RoleViewHolder holder=null;

            if(convertView == null){
                holder=new RoleViewHolder();
                convertView = inflater.inflate(resource,null);
                holder.id=(TextView)convertView.findViewById(R.id.roleID);
                holder.name=(TextView)convertView.findViewById(R.id.roleName);
                holder.code=(TextView)convertView.findViewById(R.id.roleCode);
                convertView.setTag(holder);

            }else{
                holder=(RoleViewHolder)convertView.getTag();
            }
            holder.id.setText("id : "+RoleModelList.get(position).getId_role());
            holder.name.setText("name : "+RoleModelList.get(position).getNomRole());
            holder.code.setText("code : " + RoleModelList.get(position).getCode());


            return  convertView;}

        class RoleViewHolder{
            private TextView id;
            private TextView name;
            private TextView code;
        }


    }

