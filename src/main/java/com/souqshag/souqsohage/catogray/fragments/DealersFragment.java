package com.souqshag.souqsohage.catogray.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.GridLayoutManager;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.souqshag.souqsohage.R;
import com.souqshag.souqsohage.adpters.CatograyAdpter;
import com.souqshag.souqsohage.adpters.GenericRecyclerAdapter;
import com.souqshag.souqsohage.catogray.CatograyFragment;
import com.souqshag.souqsohage.databinding.FragmentDealersBinding;
import com.souqshag.souqsohage.pojo.ModelCatogrey;

import java.util.ArrayList;


public class DealersFragment extends Fragment {

    FragmentDealersBinding binding;
    ArrayList<ModelCatogrey> listProdcut = new ArrayList<>();
    GenericRecyclerAdapter adapter;
    public DealersFragment() {
        // Required empty public constructor
    }
    public static DealersFragment newInstance() {
        return new DealersFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_dealers, container, false);
        View view = binding.getRoot();

       // initAdapter();
        getData();


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
        binding.recyclerDealers.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        binding.recyclerDealers.setHasFixedSize(true);

        binding.recyclerDealers.setAdapter(adapter);
        CatograyAdpter catograyAdpter=new CatograyAdpter(listProdcut,getActivity());

//        adapter.addAll(listProdcut);
        binding.recyclerDealers.setAdapter(catograyAdpter);
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

//                viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        Navigation.findNavController(view).navigate(R.id.action_catograyFragment_to_prouductFragment);
//                    }
//                });

            }
        };

        binding.recyclerDealers.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        binding.recyclerDealers.setHasFixedSize(true);

        binding.recyclerDealers.setAdapter(adapter);
    }

}