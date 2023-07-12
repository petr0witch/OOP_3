package ru.gb.lessons.interfaces.core.personal;

public class Doctor extends ClinicStaff implements Doing {
    public Doctor(){
    }
    public Doctor(String name, String profession) {
        super(name, profession);
    }
    public String doVaccine(){
        return ((getName()) + " вакцинировал питомца: " );
    }
    public String doOperation(){
        return ("Сотрудником " + getName() + " по специальности: " + getProfession() + "\nбыла проведена операция над пациентом: ");
    }
}
