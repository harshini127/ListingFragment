package com.example.myfragments.sampleFragment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myfragments.R;


public class FragmentHolderActivity extends AppCompatActivity {

    static final String KEY_TEXT_VAL = "TEXT_VAL";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_holder);

        if (savedInstanceState == null) {

            Bundle argument = new Bundle();
            argument.putString(KEY_TEXT_VAL, "Hey I am pragmatically instantiated Check");

            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.fragment_container_view, SampleListingFragment.class, argument)
                    .commit();
        }

    }
}
