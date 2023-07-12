package ru.gb.lessons.interfaces.core.DragStore;

public class Component {
    private String name;
    private String weight;
    private int power;

    public Component(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Component{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", power=" + power +
                '}';
    }

    public int getPower() {
        return this.power;
    }

    public int getNameLen(){
        return name.length();
    }


    public String getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
