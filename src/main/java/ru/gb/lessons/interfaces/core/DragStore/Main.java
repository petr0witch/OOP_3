package ru.gb.lessons.interfaces.core.DragStore;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Pharmasy pharmasy1 = new Pharmasy();
        Component comp1 = new Component("Penicillin", "10 mg", 10);
        Component comp2 = new Component("Spirit", "100 mg", 100);
        pharmasy1.addComponent(comp1).addComponent(comp2);
//        while(((Iterator<Component>) pharmasy1).hasNext()) {
//            System.out.println(pharmasy1.next());
//        }
//        Pharmasy dogPharm = new Pharmasy();
//        System.out.println(dogPharm +"-------"); //пусто

        Pharmasy pharmasy2 = new Pharmasy();
        Component comp3 = new Component("Penicillin", "10 mg", 20);
        Component comp4 = new Component("Spirit", "100 mg", 1010);
        pharmasy2.addComponent(comp3).addComponent(comp4);

        Pharmasy pharmasy3 = new Pharmasy();
        Component comp6 = new Component("Penicillin00000", "10 mg", 30);
        Component comp7 = new Component("Spirit", "100 mg", 1000);
        pharmasy3.addComponent(comp6).addComponent(comp7);

        Pharmasy pharmasy4 = new Pharmasy();
        Component comp8 = new Component("Penicillin", "10 mg", 10);
        Component comp9 = new Component("Spirit", "100 mg", 100);
        pharmasy1.addComponent(comp8).addComponent(comp9);

        Pharmasy pharmasy5 = new Pharmasy();
        Component comp10 = new Component("Penicillin", "10 mg", 10);
        Component comp11 = new Component("Spirit", "100 mg", 100);
        pharmasy1.addComponent(comp10).addComponent(comp11);

        List<Pharmasy> general = new ArrayList<>();
        general.add(pharmasy3);
        general.add(pharmasy2);
        general.add(pharmasy1);
        general.add(pharmasy4);
        general.add(pharmasy5);

        System.out.println(general);
//        Collections.sort(general);
//        System.out.println("=============================================================================");
//        System.out.println(general);

        Set<Pharmasy> result = new HashSet<>();
        result.add(pharmasy1);
        result.add(pharmasy2);
        result.add(pharmasy3);
        result.add(pharmasy4);
        result.add(pharmasy5);
        System.out.println(result);
        System.out.println(result.size());


        int resu = pharmasy3.compareTo(pharmasy2);
        if (resu == -1) System.out.println("Second more powerful than second");
        else System.out.println("First more powerful than first");

        System.out.println(pharmasy2.equals(pharmasy3));


//        for (Pharmasy item : result) {
//            if (item.equals()) System.out.println("Yes");
//            else System.out.println("No");
//        }
    }
}
