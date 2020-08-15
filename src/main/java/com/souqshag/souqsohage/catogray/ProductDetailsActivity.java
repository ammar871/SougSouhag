package com.souqshag.souqsohage.catogray;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.souqshag.souqsohage.R;
import com.souqshag.souqsohage.databinding.ActivityProductDetailsBinding;

public class ProductDetailsActivity extends AppCompatActivity {
ActivityProductDetailsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_product_details);
    }
}


