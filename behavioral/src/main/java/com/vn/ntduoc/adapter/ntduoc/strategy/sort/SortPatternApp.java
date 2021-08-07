package com.vn.ntduoc.adapter.ntduoc.strategy.sort;

public class SortPatternApp {
    public static void main(String[] args) {
        SortedList sortedList = new SortedList();
        sortedList.addElement("Java Core");
        sortedList.addElement("Java Design Pattern");
        sortedList.addElement("Java Library");
        sortedList.addElement("Java Framework");

        sortedList.setSortStrategy(new QuickSort());
        sortedList.sort();

        sortedList.setSortStrategy(new MergeSort());
        sortedList.sort();
    }
}
