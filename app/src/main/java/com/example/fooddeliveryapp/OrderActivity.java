package com.example.fooddeliveryapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import com.example.fooddeliveryapp.Adapters.OrdersAdapter;
import com.example.fooddeliveryapp.Models.OrdersModel;
import com.example.fooddeliveryapp.databinding.ActivityOrderBinding;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {

    ActivityOrderBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOrderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<OrdersModel> list = new ArrayList<>();
        list.add(new OrdersModel(R.drawable.pizza,"Pizza","160","151"));
        list.add(new OrdersModel(R.drawable.burger,"Burger","99","152"));
        list.add(new OrdersModel(R.drawable.pizza,"Pizza","160","153"));
        list.add(new OrdersModel(R.drawable.burger,"Burger","99","154"));
        list.add(new OrdersModel(R.drawable.pizza,"Pizza","160","155"));
        list.add(new OrdersModel(R.drawable.burger,"Burger","99","156"));
        list.add(new OrdersModel(R.drawable.pizza,"Pizza","160","157"));
        list.add(new OrdersModel(R.drawable.burger,"Burger","99","158"));
        list.add(new OrdersModel(R.drawable.pizza,"Pizza","160","159"));

        OrdersAdapter adapter = new OrdersAdapter(list,this);
        binding.orderRecyclerVIew.setAdapter(adapter);

        Context context;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        binding.orderRecyclerVIew.setLayoutManager(linearLayoutManager);
    }
}