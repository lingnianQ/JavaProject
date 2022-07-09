package com.tech.www;

public class Student {
    //学号
    private String sid;
    //姓名
    private String name;
    //成绩
    private String score;

    public Student() {
    }

    public Student(String sid, String name, String score) {
        this.sid = sid;
        this.name = name;
        this.score = score;
    }


    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid='" + sid + '\'' +
                ", name='" + name + '\'' +
                ", score='" + score + '\'' +
                '}';
    }
}
