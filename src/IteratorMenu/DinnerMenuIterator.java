package IteratorMenu;

import java.util.Iterator;

public class DinnerMenuIterator implements Iterator {
    MenuItem[] menuItems;
    int numberOfItems = 0;

    public DinnerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return numberOfItems < menuItems.length && menuItems[numberOfItems] != null;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems[numberOfItems];
        numberOfItems++;
        return menuItem;
    }

    @Override
    public void remove() {
        if (numberOfItems <= 0){
            throw new IllegalArgumentException("You can’t remove an item until you’ve done at least one next()");
        }
        if (menuItems[numberOfItems-1] != null){
            if (menuItems.length - 1 - (numberOfItems - 1) >= 0)
                System.arraycopy(menuItems, numberOfItems - 1 + 1, menuItems, numberOfItems - 1, menuItems.length - 1 - (numberOfItems - 1));
            menuItems[menuItems.length-1] = null;
        }
    }
}
