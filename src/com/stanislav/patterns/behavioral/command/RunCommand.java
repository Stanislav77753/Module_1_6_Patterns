package com.stanislav.patterns.behavioral.command;

public class RunCommand implements Command {
    Program program;

    public RunCommand(Program program) {
        this.program = program;
    }

    @Override
    public void execute() {
        program.run();
    }
}