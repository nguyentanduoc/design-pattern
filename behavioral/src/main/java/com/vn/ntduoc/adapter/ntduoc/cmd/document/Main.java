package com.vn.ntduoc.adapter.ntduoc.cmd.document;

public class Main {
    public static void main(String[] args) {
        DocumentInvoker documentInvoker = new DocumentInvoker();
        documentInvoker.write("The one text");
        documentInvoker.undo();
        documentInvoker.read();

        documentInvoker.redo();
        documentInvoker.read();
    }
}
