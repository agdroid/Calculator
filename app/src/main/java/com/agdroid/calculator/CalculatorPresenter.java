package com.agdroid.calculator;

/**
 * Created by andre on 03.12.2017.
 */

public class CalculatorPresenter implements CalculatorContract.ForwardInputInteractionToPresenter,
        CalculatorContract.ForwardDisplayInteractionToPresenter {

    private CalculatorContract.PublishToView publishResult;

                                    //An object of DisplayFragment
    public CalculatorPresenter (CalculatorContract.PublishToView publishResult) {
        this.publishResult = publishResult;
    }

    @Override
    public void onDeleteShortClick() {

    }

    @Override
    public void onDeleteLongClick() {

    }

    @Override
    public void onNumberClick(int number) {

    }

    @Override
    public void onDecimalClick() {

    }

    @Override
    public void onEvaluateClick() {

    }

    @Override
    public void onOperatorClick(String operator) {

    }
}
