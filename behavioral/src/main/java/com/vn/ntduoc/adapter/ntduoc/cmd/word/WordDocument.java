package com.vn.ntduoc.adapter.ntduoc.cmd.word;

import java.util.Stack;

public class WordDocument {

    private final Stack<String> lines = new Stack<>();

    public void insert(String message) {
        lines.push(message);
    }

    public void delete() {
        if (!lines.isEmpty()) {
            lines.pop();
        }
    }

    public void print() {
        if (lines.isEmpty()) {
            System.out.println("empty document");
        }
        for (String mgs : lines) {
            System.out.println(mgs);
        }
    }
}
