package com.souqshag.souqsohage.catogray.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.souqshag.souqsohage.R;
import com.souqshag.souqsohage.adpters.CatograyAdpter;
import com.souqshag.souqsohage.adpters.GenericRecyclerAdapter;
import com.souqshag.souqsohage.databinding.FragmentShowProdcutBinding;
import com.souqshag.souqsohage.pojo.ModelCatogrey;

import java.util.ArrayList;


public class ProductsFragment extends Fragment {

    ArrayList<ModelCatogrey> listProdcut = new ArrayList<>();
    FragmentShowProdcutBinding binding;
    GenericRecyclerAdapter adapter;

    public ProductsFragment() {
        // Required empty public constructor
    }

    public static ProductsFragment newInstance() {
        return new ProductsFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_show_prodcut, container, false);
        View view = binding.getRoot();
        Toast.makeText(getActivity(), "ok", Toast.LENGTH_SHORT).show();
        initAdapter();
        listProdcut = new ArrayList<>();
        listProdcut.add(new ModelCatogrey(R.drawable.order, "حضراوات وفواكه"));
        listProdcut.add(new ModelCatogrey(R.drawable.order, "حضراوات وفواكه"));
        listProdcut.add(new ModelCatogrey(R.drawable.order, "حضراوات وفواكه"));
        listProdcut.add(new ModelCatogrey(R.drawable.order, "حضراوات وفواكه"));
        listProdcut.add(new ModelCatogrey(R.drawable.order, "حضراوات وفواكه"));
        listProdcut.add(new ModelCatogrey(R.drawable.order, "حضراوات وفواكه"));
        binding.recyclerProduct.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        binding.recyclerProduct.setHasFixedSize(true);

        binding.recyclerProduct.setAdapter(adapter);
//        adapter.addAll(listProdcut);
        CatograyAdpter catograyAdpter=new CatograyAdpter(listProdcut,getActivity());
        binding.recyclerProduct.setAdapter(catograyAdpter);



        return view;
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



            }
        };

        binding.recyclerProduct.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        binding.recyclerProduct.setHasFixedSize(true);

        binding.recyclerProduct.setAdapter(adapter);
    }
}