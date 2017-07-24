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

public class FragmentSetting extends Fragment {

    public FragmentSetting() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_setting,null);
        TextView total_walk = (TextView) view.findViewById(R.id.setting_total_walk);
        TextView now_mission_complete = (TextView) view.findViewById(R.id.setting_now_mission_complete);
        TextView max_mission_complete = (TextView) view.findViewById(R.id.setting_max_mission_complete);
        total_walk.setText("총 걸음수 : " + total_walk.getText().toString());
        now_mission_complete.setText("현재 미션연속달성 횟수 : " + now_mission_complete.getText().toString());
        max_mission_complete.setText("최대 미션연속달성 횟수 : " + max_mission_complete.getText().toString());
        return view;
    }
}
