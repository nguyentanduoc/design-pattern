package com.vn.ntduoc.adapter.ntduoc.cmd.document;

public class DocumentEditorCommand implements DocumentCommand {
    private final Document document;
    private final String text;

    public DocumentEditorCommand(Document document, String text) {
        this.document = document;
        this.text = text;
        this.document.write(text);
    }

    @Override
    public void undo() {
        this.document.eraseLast();
    }

    @Override
    public void redo() {
        document.write(text);
    }
}
