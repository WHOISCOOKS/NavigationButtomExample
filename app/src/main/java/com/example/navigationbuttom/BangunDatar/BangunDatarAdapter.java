package com.example.navigationbuttom.BangunDatar;

import android.annotation.SuppressLint;
import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.example.navigationbuttom.BangunModel;
import com.example.navigationbuttom.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BangunDatarAdapter extends RecyclerView.Adapter<BangunDatarAdapter.MyViewHolder> {
    Context context;
    ArrayList<BangunModel> modelbangundatar = new ArrayList<>();
    private RecyclerViewClickListener mListener;

    public BangunDatarAdapter(Context context, ArrayList<BangunModel> modelbangundatar, RecyclerViewClickListener listener) {
        this.context = context;
        this.modelbangundatar = modelbangundatar;
        this.mListener = listener;
    }

    @NonNull
    @Override
    public BangunDatarAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_bangun_datar, parent, false);
        return new BangunDatarAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BangunDatarAdapter.MyViewHolder holder, @SuppressLint("RecyclerView") int position) {

        holder.tvnamebangdatar.setText(modelbangundatar.get(position).getName());
        Glide.with(context).load(modelbangundatar.get(position).getImg()).into(holder.imagesbangundatar);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.onClick(view, holder.getBindingAdapterPosition());
            }
        });

    }

    @Override
    public int getItemCount() {
        return modelbangundatar.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imagesbangundatar;
        TextView tvnamebangdatar;

        public MyViewHolder(View ItemView) {
            super(ItemView);
            imagesbangundatar = itemView.findViewById(R.id.imagesbangundatar);
            tvnamebangdatar = itemView.findViewById(R.id.tvnamebangdatar);
        }
    }
    public interface RecyclerViewClickListener {
        void onClick(View view, int position);
    }
}