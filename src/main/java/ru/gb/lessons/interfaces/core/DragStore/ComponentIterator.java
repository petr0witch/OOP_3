package ru.gb.lessons.interfaces.core.DragStore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ComponentIterator implements Iterator<Component> {
    List<Component> components = new ArrayList<>();
    int count = 0;
    public boolean hasNext() {
        return count < components.size();
    }
    public Component next() {
        return components.get(count++);
    }
}
