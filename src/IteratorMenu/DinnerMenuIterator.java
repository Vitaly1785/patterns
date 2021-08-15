package IteratorMenu;

public class DinnerMenuIterator implements IteratorMenu{
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
    public Object next() {
        MenuItem menuItem = menuItems[numberOfItems];
        numberOfItems++;
        return menuItem;
    }
}
