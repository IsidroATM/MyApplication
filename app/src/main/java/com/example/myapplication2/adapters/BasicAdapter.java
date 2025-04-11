package com.example.myapplication2.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import  com.example.myapplication2.adapters.BasicAdapter;
import com.example.myapplication2.adapters.PersonItem;

import com.example.myapplication2.R;

import java.util.List;

public class BasicAdapter extends RecyclerView.Adapter<BasicAdapter.BasicViewHolder> {
//    private List<String> data;
    private List<PersonItem> data;
    public BasicAdapter(List<PersonItem> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public BasicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itembasic, parent, false);
        return new BasicViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BasicViewHolder holder, int position) {
//        TextView tvText = holder.itemView.findViewById(R.id.tvText);
//        String text = data.get(position);
//        tvText.setText(text);
//        PersonItem item = data.get(position);
//        // Concatenamos nombre y número, separados por un salto de línea
//        String text = item.getName() + "\n" + item.getNumber();
//        holder.tvItem.setText(text);
        // Obtener los datos
        String nombre = data.get(position).getNombre(); //
        String numero = data.get(position).getNumero();

        // Asignar el nombre y número a los TextViews
        holder.tvName.setText(nombre);
        holder.tvNumber.setText(numero);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }//<> Conocido como tipo genérico = List<String>//<Integer>

//    public class BasicViewHolder extends RecyclerView.ViewHolder{
//        public BasicViewHolder(@NonNull View itemView){
//            super(itemView);
//        }
//    }
    public class BasicViewHolder extends RecyclerView.ViewHolder {
        public TextView tvName, tvNumber;

        public BasicViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tvNumber = itemView.findViewById(R.id.tvNumber);
        }
    }
}
