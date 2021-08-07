package com.vn.ntduoc.adapter.ntduoc.strategy.sort;

import java.util.ArrayList;
import java.util.List;

public class SortedList {
    private SortStrategy sortStrategy;
    private final List<String> items = new ArrayList<>();

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void addElement(String element) {
        this.items.add(element);
    }

    public void sort() {
        sortStrategy.sort(this.items);
    }
}
