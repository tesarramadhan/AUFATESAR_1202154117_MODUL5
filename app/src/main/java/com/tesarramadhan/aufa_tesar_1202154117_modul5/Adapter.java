package com.tesarramadhan.aufa_tesar_1202154117_modul5;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

/**
 * Created by Tesarramadhan on 3/25/2018.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.holder> {
    //deklarasi variabel
    private Context mcontex;
    private List<AddData> list;
    int color;

    public Adapter(Context cntx, List<AddData> list, int color){
        this.mcontex=cntx;
        this.list=list;
        this.color=color;
    }

    @Override
    public holder onCreateViewHolder(ViewGroup parent, int viewType) {
        //membuat view baru
        View view = LayoutInflater.from(mcontex).inflate(R.layout.cardview, parent, false);
        holder hldr = new holder(view);
        return hldr;
    }   //menentukan viewholder untuk recyclerview


    @Override
    public void onBindViewHolder(holder holder, int position) {
        AddData data = list.get(position);
        holder.ToDo.setText(data.getTodo());
        holder.Desc.setText(data.getDesc());
        holder.Priority.setText(data.getPrior());
        holder.card_view.setCardBackgroundColor(mcontex.getResources().getColor(this.color));
    }//menyetting nilai yang didapatkan pada viewholder

    @Override
    public int getItemCount() {
        return list.size();
    }
    //mendapatkan jumlah list

    public AddData getData(int position){
        return list.get(position);
    }
    //mendapatkan list dari adapter

    public void deleteData(int i){
        //hapus item yang terpilih
        list.remove(i);
        //memberi notifikasi item yang dihapus
        notifyItemRemoved(i);
        notifyItemRangeChanged(i, list.size());
    }//untuk menghapus list pada todolist


    class holder extends RecyclerView.ViewHolder{
        //deklarasi variable
        public TextView ToDo, Desc, Priority;
        public CardView card_view;
        public holder(View itemView){
            super(itemView);

            //get id text view dan cardview pada layout
            ToDo = itemView.findViewById(R.id.todo);
            Desc = itemView.findViewById(R.id.description);
            Priority = itemView.findViewById(R.id.number);
            card_view = itemView.findViewById(R.id.cardview);
        }
    }
}

