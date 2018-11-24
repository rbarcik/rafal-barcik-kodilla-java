package com.kodilla.stream;

import com.kodilla.stream.beautifier.FunctionalPoemBeautifier;
import com.kodilla.stream.beautifier.PoemBeautifier;


import static jdk.nashorn.internal.objects.NativeString.toUpperCase;


public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Ala ma kota", (string -> toUpperCase(string)));
        poemBeautifier.beautify("Ala ma kota", FunctionalPoemBeautifier::addThreeStars);
        poemBeautifier.beautify("Ala ma kota", FunctionalPoemBeautifier::convertToUpper);
        poemBeautifier.beautify("Ala ma kota", FunctionalPoemBeautifier::addQuotation);
        poemBeautifier.beautify("Ala ma kota", FunctionalPoemBeautifier::addOneStarFiveTimes);
        poemBeautifier.beautify("Ala ma kota*****", FunctionalPoemBeautifier::removeLastChar);
    }
}
