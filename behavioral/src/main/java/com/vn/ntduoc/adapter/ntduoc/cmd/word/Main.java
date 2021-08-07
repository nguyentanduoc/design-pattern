package com.vn.ntduoc.adapter.ntduoc.cmd.word;

public class Main {
    public static void main(String[] args) {
        WordDocument wordDocument = new WordDocument();
        WordInvokerCmd wordInvokerCmd = new WordInvokerCmd();
        wordInvokerCmd.insert(wordDocument, "first line");
        wordDocument.print();

        wordInvokerCmd.undo();
        wordDocument.print();

        wordInvokerCmd.redo();
        wordDocument.print();

        wordInvokerCmd.insert(wordDocument, "second line");
        wordDocument.print();
    }
}
