package com.vn.ntduoc.adapter.ntduoc.cmd.document;

import java.util.Stack;

public class Document {

    private final Stack<String> lines = new Stack<>();

    public void write(String text) {
        lines.push(text);
    }

    public void eraseLast() {
        if (!lines.isEmpty()) {
            lines.pop();
        }
    }

    public void readDocument() {
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
