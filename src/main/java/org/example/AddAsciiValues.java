package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddAsciiValues {

    public int addAsciiCodes(String input) {
        int result = 0;

        if (input == null) {
            return 0;
        }

        for (char key : input.toCharArray()) {
            if (Character.isLetterOrDigit(key)) {
                result += key;
            }
        }
        return result;
    }
}
