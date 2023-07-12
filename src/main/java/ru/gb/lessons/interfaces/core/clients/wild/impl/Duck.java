package ru.gb.lessons.interfaces.core.clients.wild.impl;

import ru.gb.lessons.interfaces.core.clients.*;
import ru.gb.lessons.interfaces.core.clients.Runnable;
import ru.gb.lessons.interfaces.core.clients.owners.Owner;
import ru.gb.lessons.interfaces.core.clients.wild.WildAnimal;

import java.time.LocalDate;

public class Duck extends WildAnimal implements Animals, Flyable, Runnable, Swimable, Soundable {

    public Duck(){
    }

    public Duck(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }


    @Override
    public int fly() {
        System.out.println(CLASS_NAME + "Летит со скоростью: 25 км/ч");
        return 25;
    }

    @Override
    public int run(){
        System.out.println(CLASS_NAME + "Ходит со скоростью: 5 км/ч");
        return 4;
    }

    @Override
    public int swim() {
        System.out.println(CLASS_NAME + "Плавает со скоростью: 3 км/ч");
        return 3;
    }

    @Override
    public String sing() {
        System.out.println("Тихо");
        return "loud";
    }
    @Override
    public String getClassName() {
        return name;
    }

}
