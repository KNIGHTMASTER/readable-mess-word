package com.wissensalt.rms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created on 2/25/19.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@RestController
public class AjaxMess {

    @GetMapping("/mess")
    public String convert(@RequestParam("text") String p_Text) {
        return mess(p_Text);
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
