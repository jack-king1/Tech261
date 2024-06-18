package com.sparta.jk;

public class JavaTrainee extends Trainee implements Trainable{

    public int experience;
    public String[] certifications;
    public String github;
    public String[] projects;


    public JavaTrainee(String name, int age, String email, int phone) {
        super(name, age, email, phone);
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String[] getCertifications() {
        return certifications;
    }

    public void setCertifications(String[] certifications) {
        this.certifications = certifications;
    }

    public String[] getProjects() {
        return projects;
    }

    public void setProjects(String[] projects) {
        this.projects = projects;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    @Override
    public void study() {

    }

    @Override
    public void train() {

    }
}
