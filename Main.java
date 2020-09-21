package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Text: ");
        String txt = input.nextLine();

        int count = 0;
        for (int i = 0; i < txt.length(); i++) {
            if (txt.charAt(i) != ' ' && txt.charAt(i) != '!' && txt.charAt(i) != '?'
                    && txt.charAt(i) != ',' && txt.charAt(i) != '.' && txt.charAt(i) != ';'
                    && txt.charAt(i) != '/' && txt.charAt(i) != '-' && txt.charAt(i) != '\'') {
                count++;
            }
        }
      //  System.out.println(count + " letter(s)");

        int word;
        if (txt.length() > 0){
            word = 1;
        } else { word = 0;
        }
        for (int w = 0; w < txt.length(); w++) {
            if (txt.charAt(w) == ' ') {
                word++;
            }
        }
       // System.out.println(word + " word(s)");

        int sent = 0;
        for (int s = 0; s < txt.length(); s++) {
            if (txt.charAt(s) == '.' || txt.charAt(s) == '!' || txt.charAt(s) == '?') {
                sent++;
            }
        }
       // System.out.println(sent + " sentence(s)");

        float L = (float) count/word * 100;
        float S = (float) sent/word * 100;
        float index = 0.0588f * L - 0.296f * S - 15.8f;
        int grade = Math.round(index);

        if (grade < 0) {
            System.out.println("Before Grade 1");
        } else if (grade > 16) {
            System.out.println("Grade 16+");
        } else {System.out.println("Grade " + grade);
    }

    }
}
