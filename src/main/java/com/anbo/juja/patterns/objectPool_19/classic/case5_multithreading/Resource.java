package com.anbo.juja.patterns.objectPool_19.classic.case5_multithreading;

import ua.com.juja.patterns.objectPool.IdGenerator;

import java.util.Random;

/**
 * Created by oleksandr.baglai on 28.01.2016.
 */
// ресурс - это класс инскапсулирующий какую-то полезную,
// многократно используемую ответственность
public class Resource {

    // время на создание (или инициализацию) этого ресурса существенно
    public Resource() {
        setup();
    }

    // этот метод будет вызывать клиент у готового ресурса
    public void doit(String data) {
        calculate();
        System.out.println(this + " processed: " + data);
    }

    // метод для красивого вывода ресурса в консоль
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "@" + id;
    }

    // это хак, не относящийся к шаблону -
    // сделано так, чтобы каждый новый ресурс имел свой порядковый номер
    public String id = IdGenerator.put(this);

    // симуляция какой-то ресурсоемкой логики
    private void setup() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // симуляция какой-то другой ресурсоемкой логики :)
    private void calculate() {
        try {
            Thread.sleep(new Random().nextInt(2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
