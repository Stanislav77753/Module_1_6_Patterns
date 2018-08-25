package com.stanislav.patterns.behavioral.command;

public class DownloadCommand implements Command {
    Program program;

    public DownloadCommand(Program program) {
        this.program = program;
    }

    @Override
    public void execute() {
        program.download();
    }
}
