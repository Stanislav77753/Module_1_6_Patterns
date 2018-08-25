package com.stanislav.patterns.behavioral.command;

public class SetupCommand implements Command {
    Program program;

    public SetupCommand(Program program) {
        this.program = program;
    }

    @Override
    public void execute() {
        program.setup();
    }
}
