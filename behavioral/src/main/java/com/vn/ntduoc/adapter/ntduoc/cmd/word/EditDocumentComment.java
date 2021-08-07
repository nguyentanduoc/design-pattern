package com.vn.ntduoc.adapter.ntduoc.cmd.word;

public class EditDocumentComment implements WordCommand {

    private final WordDocument wordDocument;

    private final String text;

    public EditDocumentComment(WordDocument wordDocument, String message) {
        this.wordDocument = wordDocument;
        this.text = message;
        this.wordDocument.insert(message);

    }

    @Override
    public void redo() {
        this.wordDocument.insert(text);
    }

    @Override
    public void undo() {
        wordDocument.delete();
    }
}
