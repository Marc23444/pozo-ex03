/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Marcelino Pozo-Joseph
 */
/*
    PSEUDOCODE GOES HERE
    Basically write out step by step what ur codes doing.
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
