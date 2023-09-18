package com.example.recyclerview_java;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerContactView extends RecyclerView.Adapter<RecyclerContactView.Viewholder> {
    Context context;
    ArrayList<CentextModel> arrayContext;
    RecyclerContactView(Context context,ArrayList<CentextModel> arrayContext){
        this.context = context;
        this.arrayContext = arrayContext;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycle_context,parent,false);
        Viewholder viewholder = new Viewholder(view);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        holder.imageView.setImageResource(arrayContext.get(position).image);
        holder.txtName.setText(arrayContext.get(position).name);
        holder.txtContact.setText(arrayContext.get(position).contact);
    }

    @Override
    public int getItemCount() {
        return arrayContext.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView txtName,txtContact;
        public Viewholder(View itemView){
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            txtName = itemView.findViewById(R.id.txtName);
            txtContact = itemView.findViewById(R.id.txtContact);

        }
    }
}
