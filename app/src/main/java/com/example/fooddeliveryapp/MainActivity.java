package com.example.fooddeliveryapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;

import com.example.fooddeliveryapp.Adapters.MainAdapter;
import com.example.fooddeliveryapp.Models.MainModel;
import com.example.fooddeliveryapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<MainModel> list = new ArrayList<>();
        list.add(new MainModel(R.drawable.burger,"Burger","60","Burger with extra cheese"));
        list.add(new MainModel(R.drawable.pizza,"Pizza","160","Pizza with extra cheese and veggies"));

        MainAdapter adapter = new MainAdapter(list,this);
        binding.recylcerview.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recylcerview.setLayoutManager(layoutManager);


    }
}