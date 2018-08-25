package com.stanislav.patterns.behavioral.command;

public class InstallCommand implements Command {
    Program program;

    public InstallCommand(Program program) {
        this.program = program;
    }

    @Override
    public void execute() {
        program.install();
    }
}
