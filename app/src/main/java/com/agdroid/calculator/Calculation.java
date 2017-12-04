package com.agdroid.calculator;

import org.javia.arity.Symbols;

/**
 * Created by andre on 04.12.2017.
 */

public class Calculation {

    private final Symbols symbols;
    private CalculationResult calculationResult;
    private static String currentExpression;

    interface CalculationResult {
        void onExpressionChanged(String result, boolean successful);
    }

    public void setCalculationResultListener(CalculationResult calculationResult) {
        this.calculationResult = calculationResult;
        currentExpression = "";
    }

    public Calculation() {
        symbols = new Symbols();
    }




}
