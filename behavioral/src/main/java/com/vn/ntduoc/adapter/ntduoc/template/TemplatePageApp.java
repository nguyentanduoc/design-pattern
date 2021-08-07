package com.vn.ntduoc.adapter.ntduoc.template;

public class TemplatePageApp {
    public static void main(String[] args) {
        PageTemplate pageTemplate = new HomePage();
        pageTemplate.showPage();

        PageTemplate contactPage = new ContactPage();
        contactPage.showPage();

        PageTemplate detailPage = new DetailPage();
        detailPage.showPage();
    }
}
