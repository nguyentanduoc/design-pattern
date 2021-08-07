package com.vn.ntduoc.adapter.translator;

public class VietnameseClient {
    public static void main(String[] args) {
        VietnameseTarget vietnameseTarget = new TranslatorAdapter(new JapaneseAdaptee());
        vietnameseTarget.sendMessage("xin chao");
    }
}
