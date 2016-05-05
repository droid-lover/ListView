package com.myjarvis.listviewexample.model;

/**
 * Created by jarvis on 05-May-16
 * at  2:45 PM .
 */
public class Model {

    private String name;
    private boolean selected;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public Model(String name) {
        this.name = name;
        selected = false;

    }
}
