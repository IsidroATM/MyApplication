package com.example.myapplication2.ClassUser;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication2.R;

import java.util.List;

public class ColorAdapter extends RecyclerView.Adapter<ColorAdapter.ColorViewHolder> {

    private List<ColorItem> colorList;

    public ColorAdapter(List<ColorItem> colorList) {
        this.colorList = colorList;
    }

    @NonNull
    @Override
    public ColorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_color, parent, false);
        return new ColorViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ColorViewHolder holder, int position) {
        ColorItem item = colorList.get(position);
        holder.tvColorName.setText(item.getName());
        holder.tvColorHex.setText(item.getHex());
        holder.colorCircle.setBackgroundColor(Color.parseColor(item.getHex()));
    }

    @Override
    public int getItemCount() {
        return colorList.size();
    }

    // ✅ ViewHolder definido dentro del adaptador
    public static class ColorViewHolder extends RecyclerView.ViewHolder {
        View colorCircle;
        TextView tvColorName, tvColorHex;

        public ColorViewHolder(@NonNull View itemView) {
            super(itemView);
            colorCircle = itemView.findViewById(R.id.viewColor);
            tvColorName = itemView.findViewById(R.id.tvNombreColor);
            tvColorHex = itemView.findViewById(R.id.tvCodigoColor);
        }
    }
}
