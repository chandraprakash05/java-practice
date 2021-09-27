package main.java.practice.controlstatements;

public class SwitchCasePractice {
    public static void main(String[] args){
        char var = 'a';
        if(isVowel(var)){
            System.out.println(var + " is a Vowel");
        }else{
            System.out.println(var + " is not a Vowel");
        }
    }
    static boolean isVowel(char c){
        switch (c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }
}
