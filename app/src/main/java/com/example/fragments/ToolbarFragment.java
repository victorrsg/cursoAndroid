package com.example.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ToolbarFragment extends Fragment implements SeekBar.OnSeekBarChangeListener {

    private int seek_value_=0;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_toolbar, container, false);

        SeekBar bar= view.findViewById(R.id.seekBar);
        bar.setOnSeekBarChangeListener(this);

        Button button = view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                ButtonClicked(view);
            }
        });

        return view;
    }

    public void ButtonClicked(View view){
        activity_callback_.onButtonClick(seek_value_);
    }
    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        seek_value_ = i;
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {}

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {}

    //Prepare a listener, this will allow the fragment to call the activity when the button is clicked
    public interface ToolbarFragmentListener{
        public void onButtonClick(int value);
    }

    ToolbarFragmentListener activity_callback_;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        try {
            activity_callback_ = (ToolbarFragmentListener) context;
        }catch (ClassCastException e){
            throw new ClassCastException(context.toString() + "must implement ToolbarFragmentListener or it wont work");
        }
    }

}// Cierra Clase
