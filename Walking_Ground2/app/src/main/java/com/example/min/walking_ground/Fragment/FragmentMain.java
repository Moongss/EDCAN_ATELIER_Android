package com.example.min.walking_ground.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.min.walking_ground.R;

/**
 * Created by min on 2017. 7. 24..
 */

public class FragmentMain extends Fragment {

    public FragmentMain() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_main,null);
        TextView time = (TextView) view.findViewById(R.id.section_label);
        time.setText("남은시간" + time.getText().toString());
        return view;
    }
}
