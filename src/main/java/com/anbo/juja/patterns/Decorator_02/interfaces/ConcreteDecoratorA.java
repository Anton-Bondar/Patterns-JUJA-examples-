package com.anbo.juja.patterns.decorator_02.interfaces;

/**
 * Created by oleksandr.baglai on 26.08.2015.
 */
public class ConcreteDecoratorA implements Component {

    private Component component;
    private String addedState;

    public ConcreteDecoratorA(Component component, String addedState) {
        this.component = component;
        this.addedState = addedState;
    }

    @Override
    public Object operation(Object input) {
        System.out.printf("Call ConcreteDecoratorA.operation('%s') with state: '%s'\n", input, addedState);

        Object result = "[before]" + component.operation(input + addedState) + "[after]";

        System.out.printf("Exit ConcreteDecoratorA.operation() with '%s'\n", result);
        return result;
    }
}
