package com.example.android.creatememo;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by ceciliaHumlelu on 2017-12-19.
 */

public class BottomLayoutFragment extends Fragment{
    private static TextView topTextView;
    private static TextView bottomTextView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View bottomView = inflater.inflate(R.layout.bottom_layout,container,false);
        topTextView = (TextView) bottomView.findViewById(R.id.top_text_view);
        bottomTextView = (TextView) bottomView.findViewById(R.id.bottom_text_view);

        return bottomView;
    }

    public void setMemo(String top, String bottom) {
        topTextView.setText(top);
        bottomTextView.setText(bottom);
    }
}
