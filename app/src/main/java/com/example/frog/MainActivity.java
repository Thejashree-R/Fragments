package com.example.frog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Fragment1 fragment1;
    Fragment2 fragment2;
    int switchfrag=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment1=new Fragment1();
        fragment2=new Fragment2();

        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.clayout,fragment1);
        fragmentTransaction.commit();
        switchfrag=1;

    }

    public void switchfrag(View view) {
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        if (switchfrag==1){
            fragmentTransaction.replace(R.id.clayout,fragment2);
            switchfrag=2;
        }
        else
        {
            fragmentTransaction.replace(R.id.clayout,fragment1);
            switchfrag=1;
        }
        fragmentTransaction.commit();


    }
}