package com.vn.ntduoc.adapter.ntduoc.state.original;

public class StateDocumentApp {
    public static void main(String[] args) {
        DocumentService documentService = new DocumentService();
        documentService.setDocumentState(DocumentState.NEW);
        documentService.handleRequest();
    }
}
