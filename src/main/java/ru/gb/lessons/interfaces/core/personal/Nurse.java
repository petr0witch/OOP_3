package ru.gb.lessons.interfaces.core.personal;

public class Nurse extends ClinicStaff implements Doing {
    public Nurse() {

    }
    public Nurse(String name, String profession) {
        super(name, profession);
    }
    public String doVaccine(){
        return (getName() + " вакцинировала питомца: " );
    }
}
