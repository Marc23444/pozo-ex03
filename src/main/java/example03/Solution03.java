/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Marcelino Pozo-Joseph
 */
/*
    PSEUDOCODE
    -Create a scanner
    -Prompt the user for 2 seperate inputs
        -Ask first for a quote
        -Then ask who said the quote
    -Finally print out both inputs within quotes using a method that allows quotes to be printed
 */
package example03;

import java.util.Scanner;

public class Solution03 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the quote?");
        String quote = scan.nextLine();

        System.out.println("Who said it?");
        String author = scan.nextLine();

        System.out.println(author + " says, "+ "\""+quote+"\"");

    }
}
