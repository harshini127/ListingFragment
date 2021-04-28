package com.example.myfragments.sampleFragment;


import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.example.myfragments.R;


public class SampleListingFragment extends Fragment {
    SwipeRefreshLayout srlSimpleListing;
    RecyclerView rvSimpleListing;
    private static final String TAG = "SampleListingFragment";

    public SampleListingFragment() {
        super(R.layout.fragment_listing_sample);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        srlSimpleListing = view.findViewById(R.id.srlSimpleListing);
        rvSimpleListing = view.findViewById(R.id.rvSimpleListing);
        srlSimpleListing.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                Log.d(TAG, "onRefresh: called ");
                rvSimpleListing.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        srlSimpleListing.setRefreshing(false);
                    }
                }, 2000);
            }
        });
    }
}
