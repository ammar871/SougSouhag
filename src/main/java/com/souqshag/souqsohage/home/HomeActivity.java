package com.souqshag.souqsohage.home;

import androidx.appcompat.app.AppCompatActivity;

import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;

import com.souqshag.souqsohage.R;
import com.souqshag.souqsohage.catogray.CatograyFragment;


public class HomeActivity extends AppCompatActivity {
  // ActivityHomeBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
//        binding = DataBindingUtil.setContentView(this, R.layout.activity_home);
//
//
//
        loadFragment(new CatograyFragment());
//        binding.toggles.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                binding.draw.openDrawer(Gravity.RIGHT);
//            }
//        });
//

    }

    private boolean loadFragment(Fragment fragment) {
        String backStateName = fragment.getClass().getName();

        FragmentManager manager = getSupportFragmentManager();
        boolean fragmentPopped = manager.popBackStackImmediate (backStateName, 0);
        if (!fragmentPopped) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .addToBackStack(backStateName)
                    .replace(R.id.linershow, fragment)
                    .commit();
            return true;
        }
        return false;
    }
}