package com.example.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ImageFragment extends Fragment {
    private ImageView image_;

    public ImageFragment(){
       // Requiered empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_image, container, false);
        image_ = view.findViewById(R.id.ImageF_ContainerView);
        return view;
    }

    public void ChangeImageAlpha(int alpha){
        // seekbar progress goes from 0 to 100 while image alpha goes from 0 to 255, keep that in mind

        int t_value=alpha * 255 / 100;
        image_.setImageAlpha(t_value);
    }








}// Cierra clase
