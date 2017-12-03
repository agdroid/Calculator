package com.agdroid.calculator;

/**
 * Created by andre on 03.12.2017.
 */

public interface CalculatorContract {

    //Our View handles these methods (DisplayFragment)
    interface PublishToView {
        void showResult(String result);

        // Für Fehlermeldung bei ungültigen Resultat
        void showToastMessage(String message);
    }

    //passes click events from our View (DisplayFragment), to the presenter
    interface ForwardDisplayInteractionToPresenter {
        void onDeleteShortClick();

        void onDeleteLongClick();
    }

    //passes click events from our View (InputFragment), to the presenter
    interface ForwardInputInteractionToPresenter {
        void onNumberClick(int number);

        void onDecimalClick();

        void onEvaluateClick();

        void onOperatorClick(String operator);
    }
}
