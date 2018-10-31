package com.example.zafkiel.fragment;

import android.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instance state
        if (savedInstanceState == null) {
            //inisiasi adapter untuk mengaktifkan fragment
            FragmentManager fragmentManager = getSupportFragmentManager();

            //inisiasi object fragment
            BodyPartsFragments fragmentPart;

            //membuat & mengambil fragment head
            fragmentPart = new BodyPartsFragments();
            fragmentPart.setmImageIds(ImageAssets.getHeads());
            fragmentPart.setmListIndex(8);
            //transaksi fragment head
            fragmentManager.beginTransaction().add(R.id.heads_container, fragmentPart).commit();

            //membuat & mengambil fragment body
            fragmentPart = new BodyPartsFragments();
            fragmentPart.setmImageIds(ImageAssets.getBodies());
            fragmentPart.setmListIndex(8);
            //transaksi fragment body
            fragmentManager.beginTransaction().add(R.id.bodies_container, fragmentPart).commit();

            //membuat & mengambil fragment leg
            fragmentPart = new BodyPartsFragments();
            fragmentPart.setmImageIds(ImageAssets.getLegs());
            fragmentPart.setmListIndex(8);
            //transaksi fragment leg
            fragmentManager.beginTransaction().add(R.id.legs_container, fragmentPart).commit();
        }
    }
}
