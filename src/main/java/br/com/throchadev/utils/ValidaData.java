package br.com.throchadev.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidaData {

    public static boolean isValidDate(String d)
    {
        String regex = "\\d{2}-\\d{2}-\\d{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher((CharSequence)d);
        return matcher.matches();
    }
}
