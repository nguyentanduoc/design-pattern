package com.vn.ntduoc.adapter.ntduoc.state.pattern;

public class DocumentStatePatternApp {
    public static void main(String[] args) {
        DocumentContext context = new DocumentContext();
        context.setState(new NewState());
        context.applyState();

        context.setState(new RejectState());
        context.applyState();

        context.setState(new ApprovedState());
        context.applyState();

        context.setState(new SubmittedState());
        context.applyState();
    }
}
