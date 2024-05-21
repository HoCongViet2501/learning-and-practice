package org.example;

public class Main {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = s1;
        s1 = s1+"Programming";
        System.out.println(s1.equals(s2));
        StringBuffer sb1 = new StringBuffer("Python");
        StringBuffer sb2 = sb1;
        sb1.append("Programming");
        System.out.println(sb1.equals(sb2));
    }
}