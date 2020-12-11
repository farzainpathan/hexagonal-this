package com.poetry.console.application;

import com.poetry.console.ConsoleAdapter;
import com.potery.PoetryReader;
import com.potery.port.RequestVerse;

public class Console {

    public static void main(String[] args) {
        RequestVerse poetryReader = new PoetryReader();
        ConsoleAdapter consoleAdaptor = new ConsoleAdapter(poetryReader, new ConsolePublication());
        consoleAdaptor.getVerse();
    }
}
