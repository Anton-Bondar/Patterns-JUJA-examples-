package com.anbo.juja.patterns.visitor_10.classic.case1_simple;

/**
 * Created by oleksandr.baglai on 21.10.2015.
 */
// этот посетитель только подглядывает за елементами
public class ConcreteVisitorC implements Visitor {

    // у него по методу на каждый тип элемента

    @Override
    public void visit(ConcreteElementA element) {
        System.out.printf("%s visited(1) %s, get something %s:%s\n",
                getClass().getSimpleName(),
                element.getClass().getSimpleName(),
                element.getSomething().getClass().getSimpleName(),
                element.getSomething());
    }

    @Override
    public void visit(ConcreteElementB element) {
        System.out.printf("%s visited(2) %s, get something %s:%s\n",
                getClass().getSimpleName(),
                element.getClass().getSimpleName(),
                element.getSomething().getClass().getSimpleName(),
                element.getSomething());
    }
}
