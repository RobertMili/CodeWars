package VowelCount;

public class Main {
}
class Vowels {
    public static int getCount(String str){
        int count = str.replaceAll("[^aeiou]", "").length();
        return count;
    }
}
