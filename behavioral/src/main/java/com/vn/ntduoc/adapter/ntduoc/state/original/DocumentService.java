package com.vn.ntduoc.adapter.ntduoc.state.original;

public class DocumentService {
    private DocumentState documentState;

    public void setDocumentState(DocumentState documentState) {
        this.documentState = documentState;
    }

    public void handleRequest() {
        switch (this.documentState) {
            case NEW:
                System.out.println("Create new document");
                break;
            case APPROVED:
                System.out.println("APPROVED");
                break;
            case REJECTED:
                System.out.println("REJECTED");
                break;
            case SUBMITTED:
                System.out.println("SUBMITTED");
                break;
            default:
                break;
        }
    }
}
