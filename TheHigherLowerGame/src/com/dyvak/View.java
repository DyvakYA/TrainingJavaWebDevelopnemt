package com.dyvak;

/**
 * Created by Dyvak on 29.10.2016.
 */
public class View {
    // Text's constants
    public static final String INPUT_INT_DATA = "Input INT value = ";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";
    public static final String OUR_INT = "You win INT value = ";

    private final Model model;

    public View(Model model) {
        this.model = model;
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printMessageAndInt(String message, int value) {
        System.out.println(message + value);
    }

}