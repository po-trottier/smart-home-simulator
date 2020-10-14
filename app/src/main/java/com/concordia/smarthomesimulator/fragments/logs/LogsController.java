package com.concordia.smarthomesimulator.fragments.logs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.concordia.smarthomesimulator.R;

public class LogsController extends Fragment {

    private LogsModel logsController2;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        logsController2 = new ViewModelProvider(this).get(LogsModel.class);
        View root = inflater.inflate(R.layout.fragment_logs, container, false);
        final TextView textView = root.findViewById(R.id.text_slideshow);
        logsController2.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}