package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Singleton Pattern ... \n");
        System.out.println("If you see the same value, then singleton was reused" + "\n" +
                "If you see different values, then 2 singletons were created!" + "\n\n" +
                "RESULT:");
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}