package disemvowelTrolls;

public class Main {
}
class Troll {
    public static String disemVowel(String str) {

        //str.replaceAll("[^aeiou]", "").length();
        String strNew = str.replaceAll("(?i)[aeiou]","");

        return strNew;
    }
}
