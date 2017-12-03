package com.agdroid.calculator;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnLongClick;


/**
 * A simple {@link Fragment} subclass.
 */
public class DisplayFragment extends Fragment implements CalculatorContract.PublishToView {

    private CalculatorContract.ForwardDisplayInteractionToPresenter forwartInteraction;

    public void setPresenter (CalculatorContract.ForwardDisplayInteractionToPresenter forwartInteraction) {
        this.forwartInteraction = forwartInteraction;
    }

    @BindView(R.id.lbl_display)
    TextView display;

    @OnClick(R.id.imb_delete)
    public void onDeleteShortClick(View v){
        forwartInteraction.onDeleteShortClick();
    }

    @OnLongClick(R.id.imb_delete)
    public boolean onDeleteLongClick(View v){
        forwartInteraction.onDeleteLongClick();
        return true;
    }

    public DisplayFragment() {
        // Required empty public constructor
    }

    public static DisplayFragment newInstance(){
        return new DisplayFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_display, container, false);
        ButterKnife.bind(this,v);

        return v;
    }

    @Override
    public void showResult(String result) {

    }

    @Override
    public void showToastMessage(String message) {

    }
}
