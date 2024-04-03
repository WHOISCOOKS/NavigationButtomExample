package com.example.navigationbuttom.BangunDatar;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationbuttom.BangunModel;
import com.example.navigationbuttom.MainActivity;
import com.example.navigationbuttom.R;
import com.example.navigationbuttom.BangunDatar.Persegi;
import com.example.navigationbuttom.BangunDatar.Lingkaran;
import com.example.navigationbuttom.BangunDatar.PersegiPanjang;
import com.example.navigationbuttom.BangunDatar.Segitiga;

import java.util.ArrayList;

public class BangunDatarFragment extends Fragment implements BangunDatarAdapter.RecyclerViewClickListener {
    ArrayList<BangunModel> modelbangundatar = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_bangun_datar, container, false);
        RecyclerView rvBangunDatar = rootview.findViewById(R.id.rvBangunDatar);

        modelbangundatar.add(new BangunModel("Persegi", R.drawable.rectangle));
        modelbangundatar.add(new BangunModel("Persegi Panjang", R.drawable.cuboid));
        modelbangundatar.add(new BangunModel("Segitiga", R.drawable.triangle));
        modelbangundatar.add(new BangunModel("Lingkaran", R.drawable.circle));

        rvBangunDatar.setLayoutManager(new LinearLayoutManager(getActivity()));
        BangunDatarAdapter adapter = new BangunDatarAdapter(getContext(), modelbangundatar, this);
        rvBangunDatar.setAdapter(adapter);

        return rootview;
    }

    @Override
    public void onClick(View view, int position) {
        String selectedBangun = modelbangundatar.get(position).getName();

        Intent intent;
        switch (selectedBangun) {
            case "Persegi":
                intent = new Intent(requireActivity(), Persegi.class);
                view.getContext().startActivity(intent);
                break;
            case "Persegi Panjang":
                intent = new Intent(view.getContext(), PersegiPanjang.class);
                view.getContext().startActivity(intent);
                break;
            case "Segitiga":
                intent = new Intent(requireActivity(), Segitiga.class);
                view.getContext().startActivity(intent);
                break;
            case "Lingkaran":
                intent = new Intent(requireActivity(), Lingkaran.class);
                view.getContext().startActivity(intent);
                break;
            default:
                intent = new Intent(requireActivity(), MainActivity.class);
                view.getContext().startActivity(intent);
                break;
        }
    }
}