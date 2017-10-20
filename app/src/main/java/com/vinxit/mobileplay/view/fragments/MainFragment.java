package com.vinxit.mobileplay.view.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.vinxit.mobileplay.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Vinxit_HK on 2017/10/18.
 */

public class MainFragment extends Fragment{

    @BindView(R.id.tv_main)
    TextView textView;

    private static final String TYPE = "type";
    private int mType = 1;
    public static MainFragment newInstance(int type){
        MainFragment fragment = new MainFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(TYPE,type);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        toString();
        mType = getArguments().getInt(TYPE);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main,container,false);
        ButterKnife.bind(this,view);
        textView.setText(""+mType);
        return view;
    }
}
