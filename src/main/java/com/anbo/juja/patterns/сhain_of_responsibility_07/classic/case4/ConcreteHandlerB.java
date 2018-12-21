package com.anbo.juja.patterns.сhain_of_responsibility_07.classic.case4;

/**
 * Created by oleksandr.baglai on 24.09.2015.
 */
public class ConcreteHandlerB implements Handler {

    @Override
    public boolean canHandle(Request request) {
        return request.getMessage() instanceof String;
    }

    @Override
    public void handle(Request request){
        System.out.printf("Request %s processed by ConcreteHandlerB\n", request);
    }
}