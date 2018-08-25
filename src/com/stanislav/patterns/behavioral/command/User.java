package com.stanislav.patterns.behavioral.command;

public class User {
    private Command download;
    private Command install;
    private Command setup;
    private Command run;

    public User(Command download, Command install, Command setup, Command run) {
        this.download = download;
        this.install = install;
        this.setup = setup;
        this.run = run;
    }

    public void downloadProgram(){
        download.execute();
    }
    public void installProgram(){
        install.execute();
    }
    public void setupProgram(){
        setup.execute();
    }
    public void runProgram(){
        run.execute();
    }
}
