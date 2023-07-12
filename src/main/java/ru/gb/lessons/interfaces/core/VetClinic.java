package ru.gb.lessons.interfaces.core;

import ru.gb.lessons.interfaces.core.clients.Animal;
import ru.gb.lessons.interfaces.core.clients.Animals;
import ru.gb.lessons.interfaces.core.clients.Human;
import ru.gb.lessons.interfaces.core.clients.Swimable;
import ru.gb.lessons.interfaces.core.clients.home.impl.Cat;
import ru.gb.lessons.interfaces.core.clients.home.impl.Dog;
import ru.gb.lessons.interfaces.core.clients.wild.WildAnimal;
import ru.gb.lessons.interfaces.core.clients.wild.impl.Duck;
import ru.gb.lessons.interfaces.core.clients.wild.impl.WildCat;

import java.util.ArrayList;
import java.util.List;

public class VetClinic {
    private static List<Animals> animals = new ArrayList<>();
    public static void main(String[] args) {
        Human human = new Human("Kir");
        Cat cat = new Cat();
        Duck duck1 = new Duck();
        Dog dog1 = new Dog();
        WildCat wildcat1 = new WildCat();

        animals.add(cat);
        animals.add(duck1);
        animals.add(dog1);
        animals.add(wildcat1);

//        for (Animals elements : animals){
//            heal(elements);
//        }

        getSwimmingAnimal();

    }
    private static void heal(Animals patient){
        System.out.println(patient.getClassName() + " Вылечен");
    }

    // TODO: 05.07.2023 Попробовал сделать выборку по всем плавающим
    public static void getSwimmingAnimal() {
        for (Animals item : animals) {
            if (item instanceof Swimable) {
                System.out.println(((Animal) item).getCLASS_NAME());
            }
        }
    }
}
