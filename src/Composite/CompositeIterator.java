package Composite;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {
    Stack<Iterator<MenuComponent>> stack = new Stack<>();

    public CompositeIterator(Iterator<MenuComponent> iterator){
        stack.push(iterator);
    }


    @Override
    public boolean hasNext() {
        if (stack.empty()){
            return false;
        } else{
            Iterator<MenuComponent> componentIterator = stack.peek();
            if (componentIterator.hasNext()){
                return true;
            } else{
                stack.pop();
                return hasNext();
            }
        }
    }

    @Override
    public Object next() {
        if (hasNext()){
            Iterator<MenuComponent> iterator = stack.peek();
            MenuComponent component = iterator.next();
            stack.push(component.createIterator());
            return component;
        } else {
            return null;
        }
    }
}
