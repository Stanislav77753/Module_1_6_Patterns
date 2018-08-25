package com.stanislav.patterns.structural.facade;

public class WorkFlow {
    private JavaDeveloper javaDeveloper = new JavaDeveloper();
    private PhpDeveloper phpDeveloper = new PhpDeveloper();

    public void createWebSite(){
        javaDeveloper.doWork();
        phpDeveloper.doWork();
        System.out.println("website created");
    }
}
