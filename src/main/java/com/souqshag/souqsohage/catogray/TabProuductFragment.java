package com.souqshag.souqsohage.catogray;

import android.os.Bundle;


import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;


import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.google.android.material.tabs.TabLayout;
import com.souqshag.souqsohage.R;
import com.souqshag.souqsohage.catogray.fragments.DealersFragment;
import com.souqshag.souqsohage.catogray.fragments.ProductsFragment;

import com.souqshag.souqsohage.databinding.FragmentProuductBinding;


public class TabProuductFragment extends Fragment {
    TabLayout tabLayout;

    AdpterTabSearsh adapter;
    FragmentProuductBinding binding;

    public TabProuductFragment() {
        // Required empty public constructor
    }
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_prouduct, container, false);
      view= binding.getRoot();
        view.setFocusableInTouchMode(true);
        view.requestFocus();
      requireActivity().getSupportFragmentManager().beginTransaction()
                .addToBackStack(null).commit();


        binding.toggles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.draw.openDrawer(Gravity.RIGHT);
            }
        });


        initTapAndPager();


        return view;
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

        adapter = new AdpterTabSearsh(getFragmentManager());
        adapter.addFragment(ProductsFragment.newInstance(), "حسب الفئة");
        adapter.addFragment(DealersFragment.newInstance(), "حسب البائع ");
        binding.viewPager.setAdapter(adapter);
        binding.tabLayout.setupWithViewPager(binding.viewPager);

        //Determine indicator width at runtime

    }

    private void itemTabs() {
        binding.tabLayout.addTab(tabLayout.newTab().setText("حسب الفئــة "));
        binding.tabLayout.addTab(tabLayout.newTab().setText("حسب البائــع "));

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);


    }


   /* public boolean onKeyDown(int keyCode, KeyEvent event) {

        switch (keyCode) {
            case KeyEvent.KEYCODE_BACK:
                String cameback="CameBack";
              Intent  intent = new Intent(getActivity(), NavgetionActivity.class);

                startActivity(intent);
                return true;
        }
        return false;
    }*/
}


