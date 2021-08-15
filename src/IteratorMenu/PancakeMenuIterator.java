package IteratorMenu;

import java.util.ArrayList;

public class PancakeMenuIterator implements IteratorMenu{
    ArrayList<MenuItem> menuItems;
    int position = 0;

    public PancakeMenuIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return menuItems.size() < position;
    }

    @Override
    public Object next() {
        return menuItems.get(position++);
    }
}
