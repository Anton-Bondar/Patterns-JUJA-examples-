package com.anbo.juja.patterns.command_08.sample.sqlcmd.command;

import ua.com.juja.patterns.command.sample.sqlcmd.DatabaseManager;
import ua.com.juja.patterns.command.sample.sqlcmd.View;

/**
 * Created by oleksandr.baglai on 28.08.2015.
 */
public class Connect implements Command {

    private DatabaseManager manager;
    private View view;

    public Connect(DatabaseManager manager, View view) {
        this.manager = manager;
        this.view = view;
    }

    @Override
    public boolean canProcess(String command) {
        return command.startsWith("connect|");
    }

    @Override
    public String description() {
        return "Подключение к базе данных, с которой будем работать";
    }

    @Override
    public String format() {
        return "connect|databaseName|userName|password";
    }

    @Override
    public void process(String command) {

        String[] data = command.split("\\|");
        if (data.length != count()) {
            throw new IllegalArgumentException(
                    String.format("Формат команды '%s', а ты ввел '%s'",
                            format(), command));
        }
        String databaseName = data[1];
        String userName = data[2];
        String password = data[3];

        manager.connect(databaseName, userName, password);

        view.write("Успех!");
    }

    private int count() {
        return format().split("\\|").length;
    }


}
