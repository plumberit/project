package com.shapovalov.app.data;

import com.shapovalov.app.model.Command;

import java.util.ArrayList;

public class Commands {

    static ArrayList<Command> commands = new ArrayList<>();

    static Command command1 = new Command();
    static Command command2 = new Command();
    static Command command3 = new Command();

    static {
        command1.setCommand("COMPARE");
        command2.setCommand("CREATE UNION");
        command3.setCommand("DELETE UNION");

        commands.add(command1);
        commands.add(command2);
        commands.add(command3);
    }





}
