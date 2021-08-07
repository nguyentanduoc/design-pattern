package com.vn.ntduoc.adapter.translator;

public class TranslatorAdapter implements VietnameseTarget {

    private final JapaneseAdaptee japaneseAdaptee;

    public TranslatorAdapter(JapaneseAdaptee japaneseAdaptee) {
        this.japaneseAdaptee = japaneseAdaptee;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Reading message: " + message);
        String vietnamWords = this.translate(message);
        System.out.println("Sending words....");
        japaneseAdaptee.receive(vietnamWords);
    }

    private String translate(String message) {
        System.out.println("Translated!");
        return "こんにちは";
    }
}
