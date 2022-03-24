package com.example.fragments;

import android.os.Bundle;
import android.widget.SeekBar;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.fragments.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements ToolbarFragment.ToolbarFragmentListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onButtonClick(int value) {
        ImageFragment image_fragment = (ImageFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentContainerView2);

        if(image_fragment != null){
            image_fragment.ChangeImageAlpha(value);
        }

    }
}
