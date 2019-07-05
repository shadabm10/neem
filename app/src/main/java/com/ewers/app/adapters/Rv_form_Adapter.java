package com.ewers.app.adapters;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.ewers.app.R;
import com.ewers.app.screens.Dashboard;
import com.ewers.app.screens.DashboardOne;

import java.util.ArrayList;
import java.util.List;

import modal.Album;


public class Rv_form_Adapter  extends RecyclerView.Adapter<Rv_form_Adapter.ViewHolder> {


    List<Album> albums_arr;
    Context context;
    ArrayList<Boolean> booleansarr;
    String selected = "";
    Album album;

    public Rv_form_Adapter(Context context,List<Album> albums_arr) {
        this.context = context;
        this.albums_arr = albums_arr;

        setBooleanValue();
    }

    public void setBooleanValue(){

        booleansarr = new ArrayList<>();
        for(int i = 0 ; i<albums_arr.size(); i++ ){
            if(i == 0){
                booleansarr.add(true);

            }else {
                booleansarr.add(false);
            }

        }

    }


    @NonNull
    @Override
    public Rv_form_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {


        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.rv_form_item, viewGroup, false);

        return new ViewHolder(itemView);
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {

        if (booleansarr.get(position)){
            holder.rl_main.setBackground(context.getResources().getDrawable(R.drawable.ic_group_47));
            holder.name_tv.setTextColor(context.getResources().getColor(R.color.white));
            holder.sl_no_tv.setTextColor(context.getResources().getColor(R.color.white));
            selected = "yes";
        }else{
            holder.rl_main.setBackground(context.getResources().getDrawable(R.drawable.ic_group_7));
            holder.name_tv.setTextColor(context.getResources().getColor(R.color.grey));
            holder.sl_no_tv.setTextColor(context.getResources().getColor(R.color.grey));
            selected = "no";

        }

        album = albums_arr.get(position);
        holder.name_tv.setText(album.getName());
        holder.sl_no_tv.setText( String.valueOf(album.getSerial_no()));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSelectedData(position,true);

                holder.rl_main.setBackground(context.getResources().getDrawable(R.drawable.ic_group_47));
                holder.name_tv.setTextColor(context.getResources().getColor(R.color.white));
                holder.sl_no_tv.setTextColor(context.getResources().getColor(R.color.white));

                album = albums_arr.get(position);

                Intent intent = new Intent(context, DashboardOne.class);
                intent.putExtra("name",album.getName());
                context.startActivity(intent);


            }
        });




    }

    @Override
    public int getItemCount() {
        return albums_arr.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView sl_no_tv,name_tv;
        RelativeLayout rl_main;

        ViewHolder(View view) {
            super(view);
            sl_no_tv = view.findViewById(R.id.sl_no_tv);
            name_tv = view.findViewById(R.id.name_tv);
            rl_main = view.findViewById(R.id.rl_main);


        }

    }

    public void setSelectedData(int position, boolean boo){
        booleansarr.clear();
        setBooleanonClick();
        booleansarr.set(position, boo);
        notifyDataSetChanged();



    }

    public void setBooleanonClick(){
        booleansarr = new ArrayList<>();
        for(int i = 0 ; i<albums_arr.size(); i++ ){

            booleansarr.add(false);
        }
    }


}
