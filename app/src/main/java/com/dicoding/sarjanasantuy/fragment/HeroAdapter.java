package com.dicoding.sarjanasantuy.fragment;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class HeroAdapter extends
        RecyclerView.Adapter<HeroAdapter.ViewHolder> {

    private ArrayList<Hero> heroes;
    private Context context;

    public HeroAdapter(Context context){
        this.context = context;
    }

    public ArrayList<Hero> getHeroes() {
        return heroes;
    }

    public void setHeroes(ArrayList<Hero> heroes) {
        this.heroes = heroes;
    }

    @NonNull
    @Override
    public HeroAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hero, parent,
                false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.tvName.setText(getHeroes().get(position).getHeroName());
        holder.tvDetail.setText(getHeroes().get(position).getHeroDetail());

        Glide.with(context).load(getHeroes().get(position).getHeroImage()).into(holder.ivHero);
        holder.mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, HeroDetail.class);
                intent.putExtra("data1", getHeroes().get(position).getHeroName());
                intent.putExtra("data2", getHeroes().get(position).getHeroDetail());
                intent.putExtra("imageV", getHeroes().get(position).getHeroImage());
                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return heroes.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public View mainLayout;
        ImageView ivHero;
        TextView tvName, tvDetail;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivHero = itemView.findViewById(R.id.itemhero_iv);
            tvName = itemView.findViewById(R.id.itemhero_tv_nama);
            tvDetail = itemView.findViewById(R.id.itemhero_tv_deskripsi);
        }
    }
}
