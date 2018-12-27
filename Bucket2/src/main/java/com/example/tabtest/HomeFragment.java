package com.example.tabtest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tabtest.model.PostItem;
import com.example.tabtest.recyclerview.PostAdapter;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    public HomeFragment() {
    }

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.home, container, false);

        ArrayList<PostItem> listItem = new ArrayList<>();
        RecyclerView rvHome = view.findViewById(R.id.rv_home);

        //입력하는 for문
        for (int i =0; i<4;i++){
            PostItem item = new PostItem(true,
                    125,
                    "Once",
                    "https://upload.wikimedia.org/wikipedia/commons/1/15/Minatozaki_Sana_in_a_showcase_on_October_30%2C_2017_%282%29.jpg",
                    "No sana, no life");
            listItem.add(i,item);
        }

        PostAdapter adapter = new PostAdapter(getContext(),listItem);
        rvHome.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        rvHome.setAdapter(adapter);
        return view;
    }

}
