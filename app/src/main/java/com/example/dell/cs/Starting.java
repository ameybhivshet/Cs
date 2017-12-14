package com.example.dell.cs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Dell on 11/30/2017.
 */

public class Starting extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        android.support.v4.app.FragmentManager fragmentManager=getSupportFragmentManager();
        Dialog_fragment dialogFragment=new Dialog_fragment();

        dialogFragment.show(fragmentManager,"selectfragment");
    }
}
