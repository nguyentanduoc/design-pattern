package com.vn.ntduoc.adapter.ntduoc.cmd.word;

import java.util.Stack;

public class WordInvokerCmd {

    public Stack<WordCommand> redo = new Stack<>();
    public Stack<WordCommand> undo = new Stack<>();

    public void insert(WordDocument wordDocument, String message) {
        WordCommand command = new EditDocumentComment(wordDocument, message);
        undo.push(command);
        redo.clear();
    }

    public void redo() {
        if (!redo.isEmpty()) {
            WordCommand command = redo.pop();
            command.redo();
            undo.push(command);
        } else {
            System.out.println("no thing redo");
        }
    }

    public void undo() {
        if (undo.isEmpty()) {
            System.out.println("not thing undo");
        } else {
            WordCommand command = undo.pop();
            command.undo();
            redo.add(command);
        }
    }
}
