package com.souqshag.souqsohage.catogray;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;

import com.google.android.material.tabs.TabLayout;
import com.souqshag.souqsohage.R;
import com.souqshag.souqsohage.catogray.fragments.DealersFragment;
import com.souqshag.souqsohage.catogray.fragments.ProductsFragment;
import com.souqshag.souqsohage.databinding.ActivityProductBinding;

public class ProductActivity extends AppCompatActivity {
ActivityProductBinding binding;
    AdpterTabSearsh adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_product);


        binding.toggles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.draw.openDrawer(Gravity.RIGHT);
            }
        });


        initTapAndPager();



    }

    @Override
    public void onResume() {
        super.onResume();
        if (adapter == null) {
            binding.viewPager.setAdapter(adapter);

        }
    }


    @Override
    public void onStart() {
        super.onStart();
        if (adapter == null) {
            binding.viewPager.setAdapter(adapter);

        }
    }

    private void initTapAndPager() {

        adapter = new AdpterTabSearsh(getSupportFragmentManager());
        adapter.addFragment(ProductsFragment.newInstance(), "حسب الفئة");
        adapter.addFragment(DealersFragment.newInstance(), "حسب البائع ");
        binding.viewPager.setAdapter(adapter);
        binding.tabLayout.setupWithViewPager(binding.viewPager);

        //Determine indicator width at runtime

    }

    private void itemTabs() {
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("حسب الفئــة "));
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("حسب البائــع "));

        binding.tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);


    }


}
