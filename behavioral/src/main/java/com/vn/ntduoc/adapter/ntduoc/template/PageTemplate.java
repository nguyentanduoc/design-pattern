package com.vn.ntduoc.adapter.ntduoc.template;

public abstract class PageTemplate {
    protected void showHeader() {
        System.out.println("Header");
    }

    protected void showNavigator() {
        System.out.println("Show navigator");
    }

    protected void showFooter() {
        System.out.println("Show header");
    }

    protected abstract void showBody();

    public final void showPage() {
        this.showHeader();
        this.showNavigator();
        this.showBody();
        this.showFooter();
    }
}
