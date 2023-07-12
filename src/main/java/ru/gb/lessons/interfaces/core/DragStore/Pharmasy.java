package ru.gb.lessons.interfaces.core.DragStore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Pharmasy implements Iterable<Component>, Comparable<Pharmasy> {

    private ArrayList<Component> components; // Лист с перечнем компонентов
    private int count; //счётчик

    public Pharmasy() {  // Лекарство
        this.components = new ArrayList<>(); // создание листа с перечнем
        this.count = 0;
    }
    public Pharmasy addComponent(Component component){ // Добавление, тип Компонент
        this.components.add(component);
        return this;
    }

    public List<Component> getComponents() {
        return components;
    } // Получить список компонентов

    @Override
    public String toString() { // Отображение компонентов
        return "Pharmasy{" +
                "components=" + components +
                ", index=" + count +
                '}' + " Total power: " + getPower(this) + "\n";
    }

    @Override
    public Iterator<Component> iterator() {
        return new ComponentIterator(); // Переписали HasNext + Next
    }
    @Override // todo 2.TASK - Update Compare
    public int compareTo(Pharmasy o) {
        int power1 = getPower(this);
        int power2 = getPower(o);
        int nameLength1 = getNameLen(this);
        int nameLength2 = getNameLen(o);

        if (power1 != power2) {
            return Integer.compare(power1, power2); // return (x < y) ? -1 : ((x == y) ? 0 : 1);
            } else {
            return Integer.compare(nameLength1, nameLength2);

        }

    }

    private int getPower(Pharmasy pharm){
        int res = 0;
        for (Component item : pharm.getComponents()) {
            res += item.getPower();
        }
        return res;
    }
    private int getNameLen(Pharmasy pharm){
        int res = 0;
        for (Component item : pharm.getComponents()) {
            res += item.getNameLen();
        }
        return res;
    }

    @Override
    public int hashCode() {
        return Objects.hash(components, count);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pharmasy pharmasy = (Pharmasy) o;
        return count == pharmasy.count && Objects.equals(components, pharmasy.components);
    }
}
