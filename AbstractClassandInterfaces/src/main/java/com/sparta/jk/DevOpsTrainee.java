package com.sparta.jk;

public class DevOpsTrainee extends Trainee implements Trainable{

    public int experience;
    public String[] certifications;
    
    public DevOpsTrainee(String name, int age, String email, int phone) {
        super(name, age, email, phone);
    }

    public String[] getProjects() {
        return projects;
    }

    public void setProjects(String[] projects) {
        this.projects = projects;
    }

    public String[] getCertifications() {
        return certifications;
    }

    public void setCertifications(String[] certifications) {
        this.certifications = certifications;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String[] projects;



    @Override
    public void study() {

    }

    @Override
    public void train() {

    }
}
