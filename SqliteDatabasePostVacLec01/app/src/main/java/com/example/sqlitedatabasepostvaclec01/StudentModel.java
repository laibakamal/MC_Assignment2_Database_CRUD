package com.example.sqlitedatabasepostvaclec01;

public class StudentModel {
    private String name;
    private int rollNmber;
    private boolean isEnroll;

    @Override
    public String toString() {
        return "com.example.sqlitedatabasepostvaclec01.StudentModel{" +
                "name='" + name + '\'' +
                ", rollNmber=" + rollNmber +
                ", isEnroll=" + isEnroll +
                '}';
    }

    public StudentModel(String name, int rollNmber, boolean isEnroll) {
        this.name = name;
        this.rollNmber = rollNmber;
        this.isEnroll = isEnroll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNmber() {
        return rollNmber;
    }

    public void setRollNmber(int rollNmber) {
        this.rollNmber = rollNmber;
    }

    public int isEnroll() {
        if (isEnroll)
        {
            return 1;
        }
        return 0;
    }

    public void setEnroll(boolean enroll) {
        isEnroll = enroll;
    }
}
