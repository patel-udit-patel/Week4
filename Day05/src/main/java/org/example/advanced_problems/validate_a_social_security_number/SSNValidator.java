package org.example.advanced_problems.validate_a_social_security_number;

import java.util.regex.*;

//SSNValidator-> Validates the social security number
public class SSNValidator {
    public static void validateSSN(String text, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        boolean found = false;
        while (matcher.find()) {
            System.out.println("✅ \"" + matcher.group() + "\" is valid");
            found = true;
        }
        if (!found) {
            System.out.println("❌ No valid SSN found in: \"" + text + "\"");
        }
    }

    public static void main(String[] args) {
        String text1 = "My SSN is 123-45-6789.";
        String text2 = "Another format: 123456789 is not valid.";

        // Regular expression for SSN (format: XXX-XX-XXXX)
        String regex = "\\b\\d{3}-\\d{2}-\\d{4}\\b";

        // Validate SSNs in texts
        validateSSN(text1, regex);
        validateSSN(text2, regex);
    }

}
