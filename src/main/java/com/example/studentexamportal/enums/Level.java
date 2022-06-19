package com.example.studentexamportal.enums;

import java.util.ArrayList;
import java.util.List;

public enum Level {
    HUNDRED(100), TWO_HUNDRED(200), THREE_HUNDRED(300), FOUR_HUNDRED(400),
    FIVE_HUNDRED(500), SIX_HUNDRED(600), EXTRA(000);


    private final int value;

    Level(final int newValue) {
        value = newValue;
    }

    public int getValue() { return value; }


}
