package com.souqshag.souqsohage.adpters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.souqshag.souqsohage.R;
import com.souqshag.souqsohage.pojo.ModelCatogrey;

import java.util.ArrayList;

public class CatograyAdpter extends RecyclerView.Adapter<CatograyAdpter.HolderAdpter> {

    ArrayList<ModelCatogrey> list;
    Context mcontext;


    public CatograyAdpter(ArrayList<ModelCatogrey> names, Context mcontext) {
        this.list = names;
        this.mcontext = mcontext;
    }

    @NonNull
    @Override
    public HolderAdpter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_catogrey, parent, false);
        HolderAdpter chatViewHolder = new HolderAdpter(view);
        return chatViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull HolderAdpter holder, final int position) {
     ,


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class HolderAdpter extends RecyclerView.ViewHolder {
        public TextView txnamecto;
        public ImageView imaecato;

        public HolderAdpter(@NonNull View itemView) {
            super(itemView);


        }


    }



}


