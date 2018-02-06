package com.zisal.rms;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created on 2/6/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public class Main {

    public static void main(String [] args) {
        String plainWord = JOptionPane.showInputDialog(null, "Please Input Plain Word to be randomize");
        System.out.println(mess(plainWord));
    }

    private static String mess(String p_Word) {
        String[] arrPlainWord = p_Word.split(" ");
        String result = "";
        for (String string : arrPlainWord) {
            char firstLetter = string.charAt(0);
            char lastLetter = string.charAt(string.length() - 1);
            String tempResult = "";
            if (string.length() > 1) {
                String random = randomizeWord(string.substring(1, string.length()-1));
                tempResult += firstLetter + random + lastLetter;
            } else {
                tempResult += string;
            }
            result += tempResult.concat(" ");
        }
        return result;
    }

    private static String randomizeWord(String p_Word) {
        StringBuilder stringBuilder = new StringBuilder();
        List<Character> charList = new ArrayList<Character>();
        for (int a=0; a<p_Word.length(); a++) {
            charList.add(p_Word.charAt(a));
        }

        Random random = new Random();
        for (int a=0; a<p_Word.length(); a++) {
            int randInt = random.nextInt(charList.size());
            stringBuilder.append(charList.get(randInt));
            charList.remove(randInt);
        }

        return stringBuilder.toString();
    }
}
