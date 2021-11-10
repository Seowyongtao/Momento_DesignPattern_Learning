package com.momento;

public class Main {

    public static void main(String[] args) {

        var editor = new Editor();
        var history = new History();

        editor.setContent("content 1");
        history.push(editor.createState());
        System.out.println(editor.getContent());

        editor.setContent("content 2");
        history.push(editor.createState());
        System.out.println(editor.getContent());

        editor.setContent("content 3");
//        history.push(editor.createState());
//        System.out.println(editor.getContent());

        editor.restore(history.pop());
        System.out.println(editor.getContent());





    }
}
