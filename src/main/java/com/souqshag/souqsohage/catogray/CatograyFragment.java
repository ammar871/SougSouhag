package com.souqshag.souqsohage.catogray;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;


import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import androidx.navigation.Navigation;
import androidx.recyclerview.widget.GridLayoutManager;


import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.souqshag.souqsohage.R;

import com.souqshag.souqsohage.adpters.GenericRecyclerAdapter;

import com.souqshag.souqsohage.databinding.FragmentCatograyBinding;
import com.souqshag.souqsohage.pojo.ModelCatogrey;

import java.util.ArrayList;
public class CatograyFragment extends Fragment {



    ArrayList<ModelCatogrey> listProdcut = new ArrayList<>();
    GenericRecyclerAdapter adapter;
    FragmentCatograyBinding binding;
    public CatograyFragment() {
        // Required empty public constructor
    }

    public static CatograyFragment newInstance() {
        return new CatograyFragment();
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_catogray, container, false);
        View view = binding.getRoot();

        initAdapter();
        getData();





        binding.toggles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.draw.openDrawer(Gravity.RIGHT);
            }
        });


        return view;
    }

    private void getData() {
        listProdcut = new ArrayList<>();
        listProdcut.add(new ModelCatogrey(R.drawable.order, "حضراوات وفواكه"));
        listProdcut.add(new ModelCatogrey(R.drawable.order, "حضراوات وفواكه"));
        listProdcut.add(new ModelCatogrey(R.drawable.order, "حضراوات وفواكه"));
        listProdcut.add(new ModelCatogrey(R.drawable.order, "حضراوات وفواكه"));
        listProdcut.add(new ModelCatogrey(R.drawable.order, "حضراوات وفواكه"));
        listProdcut.add(new ModelCatogrey(R.drawable.order, "حضراوات وفواكه"));


        adapter.addAll(listProdcut);
        binding.recyclerCato.setAdapter(adapter);
    }

    private void initAdapter() {
        adapter = new GenericRecyclerAdapter<ModelCatogrey>(getActivity()) {
            @Override
            protected View createView(Context context, ViewGroup viewGroup, int viewType) {
                LayoutInflater inflater =
                        (LayoutInflater) context.getSystemService
                                (Context.LAYOUT_INFLATER_SERVICE);
                View view = inflater.inflate
                        (R.layout.item_catogrey, viewGroup, false);
                return view;
            }

            @Override
            protected void bindView(final ModelCatogrey item,
                                    ViewHolder viewHolder, int position) {

              viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View view) {
                      Navigation.findNavController(view).navigate(R.id.action_catograyFragment_to_prouductFragment);


                  }
              });

            }
        };

        binding.recyclerCato.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        binding.recyclerCato.setHasFixedSize(true);

        binding.recyclerCato.setAdapter(adapter);
    }
    private void replaceFragment (Fragment fragment){
        String backStateName = fragment.getClass().getName();


    }

}