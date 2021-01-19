package com.example.fooddeliveryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.fooddeliveryapp.databinding.ActivityDetailBinding;
import com.example.fooddeliveryapp.databinding.ActivityMainBinding;

public class DetailActivity extends AppCompatActivity {

    ActivityDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int image = getIntent().getIntExtra("image",0);
        int price = Integer.parseInt(getIntent().getStringExtra("price"));
        String name = getIntent().getStringExtra("name");
        String description = getIntent().getStringExtra("desc");

        binding.detailImage.setImageResource(image);
        binding.priceLbl.setText(String.format("%d",price));
        binding.mainName.setText(name);
        binding.detailDescription.setText(description);
    }
}