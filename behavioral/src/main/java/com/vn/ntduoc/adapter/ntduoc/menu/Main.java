package com.vn.ntduoc.adapter.ntduoc.menu;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.addItem(new Item("home", "/home"));
        menu.addItem(new Item("about", "/about"));
        menu.addItem(new Item("contact", "/contact"));
        menu.addItem(new Item("java", "/java"));

        IIterator<Item> itemIIterator = menu.iterator();
        while (itemIIterator.hasNext()) {
            Item item = itemIIterator.next();
            System.out.println(item.toString());
        }
    }
}
