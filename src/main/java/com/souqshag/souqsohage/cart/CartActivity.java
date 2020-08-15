package com.souqshag.souqsohage.cart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.souqshag.souqsohage.R;
import com.souqshag.souqsohage.databinding.ActivityCartBinding;

public class CartActivity extends AppCompatActivity {
ActivityCartBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_cart);


    }
}