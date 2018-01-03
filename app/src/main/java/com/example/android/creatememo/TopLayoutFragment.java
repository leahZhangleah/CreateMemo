package com.example.android.creatememo;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by ceciliaHumlelu on 2017-12-19.
 */

public class TopLayoutFragment extends Fragment {
    private static EditText topTextView;
    private static EditText bottomTextView;

    TopSectionListener activityManager;

    public interface TopSectionListener{
        public void createMemo(String top, String bottom);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            activityManager = (TopSectionListener) context;
        } catch (ClassCastException e){
            throw new ClassCastException(context.toString() + " must implement TopSectionListener.");
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View topView = inflater.inflate(R.layout.top_layout,container,false);
        topTextView = (EditText) topView.findViewById(R.id.top_text);
        bottomTextView = (EditText) topView.findViewById(R.id.bottom_text);
        final Button button = (Button) topView.findViewById(R.id.create_memo_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                activityManager.createMemo(topTextView.getText().toString(),bottomTextView.getText().toString());
            }
        });
        return topView;
    }

}
