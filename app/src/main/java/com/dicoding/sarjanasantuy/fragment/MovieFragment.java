package com.dicoding.sarjanasantuy.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class MovieFragment extends Fragment {


    private RecyclerView rvHero;
    public MovieFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_movie, container, false);
        rvHero = view.findViewById(R.id.profil);
        rvHero.setHasFixedSize(true);
        rvHero.setLayoutManager(new LinearLayoutManager(view.getContext()));
        HeroAdapter heroesAdapter = new HeroAdapter(view.getContext());
        heroesAdapter.setHeroes(HeroData.getHeroList());
        rvHero.setAdapter(heroesAdapter);
        return view;
    }



}
