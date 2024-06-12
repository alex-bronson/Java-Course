package com.example.task1_6_11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
    public static boolean isGmailOrOutlook(String email) {
        String googlePattern = "\\b[A-Za-z0-9]+@gmail\\.com\\b";
        String microsoftPattern = "\\b[A-Za-z0-9]+@outlook\\.com\\b";

        Pattern googleRegex = Pattern.compile(googlePattern);
        Matcher googleMatcher = googleRegex.matcher(email);

        Pattern microsoftRegex = Pattern.compile(microsoftPattern);
        Matcher microsoftMatcher = microsoftRegex.matcher(email);

        return googleMatcher.matches() || microsoftMatcher.matches();
    }
}
