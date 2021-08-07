package com.vn.ntduoc.adapter.ntduoc.menu;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private final List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public IIterator<Item> iterator() {
        return new MenuItemIterator();
    }

    class MenuItemIterator implements IIterator<Item> {

        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < items.size();
        }

        @Override
        public Item next() {
            return items.get(currentIndex++);
        }
    }
}
