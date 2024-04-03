package com.example.navigationbuttom.BangunRuang;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.navigationbuttom.BangunModel;
import com.example.navigationbuttom.R;

import java.time.Instant;
import java.util.ArrayList;

public class BangunRuangAdapter extends RecyclerView.Adapter<BangunRuangAdapter.MyViewHolder> {
    Context context;
    ArrayList<BangunModel> modelBangunRuang = new ArrayList<>();
    private RecyclerViewClickListener mListenerBangunRuang;

    public BangunRuangAdapter(Context context, ArrayList<BangunModel> modelBangunRuang, RecyclerViewClickListener listener) {
        this.context = context;
        this.modelBangunRuang = modelBangunRuang;
        this.mListenerBangunRuang = listener;
    }

    @NonNull
    @Override
    public BangunRuangAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_bangun_ruang, parent, false);
        return new BangunRuangAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BangunRuangAdapter.MyViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.tvBangunRuang.setText(modelBangunRuang.get(position).getName());
        Glide.with(context).load(modelBangunRuang.get(position).getImg()).into(holder.imgBangunRuang);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListenerBangunRuang.onClick(view, position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return modelBangunRuang.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imgBangunRuang;

        TextView tvBangunRuang;

        public MyViewHolder(View ItemView) {
            super(ItemView);
            imgBangunRuang = itemView.findViewById(R.id.imgBangunRuang);
            tvBangunRuang= itemView.findViewById(R.id.tvBangunRuang);
        }
    }
    public interface RecyclerViewClickListener {
        void onClick(View view, int position);
    }
}