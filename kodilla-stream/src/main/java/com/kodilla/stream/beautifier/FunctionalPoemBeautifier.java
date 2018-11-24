package com.kodilla.stream.beautifier;


import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class FunctionalPoemBeautifier {
    public static String addThreeStars(String string){
        return "***" + string + "***";
    }

    public static String convertToUpper(String string){
        return toUpperCase(string);
    }

    public static String addQuotation(String string){
        return "\"" + string + "\"";
    }

    public static String addOneStarFiveTimes(String string){
        for(int i = 1; i < 5; i++){
            System.out.println(string);
            string = string + "*";
        }
        return string;
    }

    public static String removeLastChar(String string){
        for(int i = 1; i < 5; i++){
            System.out.println(string);
            string = string.substring(0, string.length() -1);
        }
        return string;
    }
}