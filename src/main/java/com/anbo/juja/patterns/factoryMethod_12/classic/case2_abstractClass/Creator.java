package com.anbo.juja.patterns.factoryMethod_12.classic.case2_abstractClass;

/**
 * Created by oleksandr.baglai on 11.11.2015.
 */
// абстракция фабрики
//
// заметь это уже абстрактный класс,
// тут мы делаем однотипную логику для всех фекторей -
// допустим надо как-то настроить продукт после создания
public abstract class Creator {

    // каждая фабрика должна реализовать этот абстрактный фектори метод
    protected abstract Product factoryMethod();

    // а это полезная логика по настройке продукта,
    // а ты заметил тут templateMethod?
    public Product create(String config) {
        Product product = factoryMethod();

        product.setup(config);

        // тут может быть что-то еще, что необходимо для всех продуктов

        return product;
    }

}
