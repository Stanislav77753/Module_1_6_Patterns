package com.stanislav.patterns.structural.composite;

public class CompositeRunner {
    public static void main(String[] args) {
        Team teamWebSite = new Team("WebSiteOne");
        Team teamBackend = new Team("backend for WebSiteOne");
        Team teamFrontend = new Team("frontend for WebSiteOne");
        Team teamQA = new Team("tests for WebSiteOne");

        teamBackend.addStaff(new JavaDeveloper());
        teamBackend.addStaff(new JavaDeveloper());
        teamBackend.addStaff(new CppDeveloper());

        teamFrontend.addStaff(new PhpDeveloper());
        teamFrontend.addStaff(new PhpDeveloper());

        teamQA.addStaff(new QAEngineer());

        teamWebSite.addStaff(teamBackend);
        teamWebSite.addStaff(teamFrontend);
        teamWebSite.addStaff(teamQA);
        teamWebSite.doWork();
    }
}
