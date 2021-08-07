package com.vn.ntduoc.adapter.ntduoc.cmd.document;

import java.util.Stack;

public class DocumentInvoker {

    private final Stack<DocumentCommand> undoCommands = new Stack<>();
    private final Stack<DocumentCommand> redoCommands = new Stack<>();
    private final Document document = new Document();

    public void undo() {
        if (!undoCommands.isEmpty()) {
            DocumentCommand cmd = undoCommands.pop();
            cmd.undo();
            redoCommands.push(cmd);
        } else {
            System.out.println("nothing undo");
        }
    }

    public void redo() {
        if (!redoCommands.isEmpty()) {
            DocumentCommand cmd = redoCommands.pop();
            cmd.redo();
            undoCommands.push(cmd);
        } else {
            System.out.println("nothing redo");
        }
    }

    public void write(String text) {
        DocumentCommand cmd = new DocumentEditorCommand(document, text);
        undoCommands.push(cmd);
        redoCommands.clear();
    }

    public void read() {
        document.readDocument();
    }

}
