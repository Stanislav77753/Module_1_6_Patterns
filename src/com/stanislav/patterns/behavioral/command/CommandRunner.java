package com.stanislav.patterns.behavioral.command;

public class CommandRunner {
    public static void main(String[] args) {
        Program program = new Program();
        User user = new User(new DownloadCommand(program), new InstallCommand(program),
                new SetupCommand(program), new RunCommand(program));
        user.downloadProgram();
        user.installProgram();
        user.setupProgram();
        user.runProgram();
    }
}
