package com.stanislav.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Team implements Staff {
    private List<Staff> teamStaff = new ArrayList<>();
    private String nameProject;

    public Team(String nameProject) {
        this.nameProject = nameProject;
    }

    public void addStaff(Staff staff){
        teamStaff.add(staff);
    }

    @Override
    public void doWork() {
        System.out.println("This team develop the " + nameProject + " project :");
        for(Staff staff : teamStaff){
            staff.doWork();
        }
    }
}
