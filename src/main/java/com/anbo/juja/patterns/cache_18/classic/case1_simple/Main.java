package com.anbo.juja.patterns.cache_18.classic.case1_simple;

/**
 * Created by oleksandr.baglai on 11.01.2016.
 */
// наш класс запускатор
public class Main {

    public static void main(String[] args) {
        // наш источник ресурсов с встроенным анлим-кешем
        // пример нарушения SRP, но нам для примера
        Cache resources = new Cache(new Provider());

        // вывод:
        System.out.println("Get " + resources.get(10));
        // Created Resource:10
        // Get Resource:10
        System.out.println("Get " + resources.get(10));
        // Get Resource:10
        System.out.println("Get " + resources.get(11));
        // Created Resource:11
        // Get Resource:11
        System.out.println("Get " + resources.get(12));
        // Created Resource:12
        // Get Resource:12
        System.out.println("Get " + resources.get(10));
        // Get Resource:10
        System.out.println("Get " + resources.get(13));
        // Created Resource:13
        // Get Resource:13
        System.out.println("Get " + resources.get(14));
        // Created Resource:14
        // Get Resource:14
        System.out.println("Get " + resources.get(10));
        // Get Resource:10
    }
}
