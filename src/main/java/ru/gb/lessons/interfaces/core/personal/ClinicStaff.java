package ru.gb.lessons.interfaces.core.personal;

public abstract class ClinicStaff {

    protected String name = getClass().getSimpleName();
    protected String profession;

    public ClinicStaff() {
    }
    public ClinicStaff(String name, String profession) {
        this.name = name;
        this.profession = profession;
    }

    public void firstView(){
        System.out.println("Питомец был осмотрен!");
    }

    public String getName() { return name;}
    public String getProfession() {
        return profession;
    }
}
