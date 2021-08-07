package com.vn.ntduoc.adapter.ntduoc.strategy.sort;

import java.util.List;

public interface SortStrategy {
    <T> void sort(List<T> items);
}
