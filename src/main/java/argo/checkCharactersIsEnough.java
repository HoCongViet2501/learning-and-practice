package argo;

import java.util.HashSet;
import java.util.Set;

public class checkCharactersIsEnough {
    public static void main(String[] args) {
        String s = "qwertyuiopasdfghjklzxcvbnmhjghkm,hk";
        System.out.println(solution(s));
    }

    private static boolean solution(String s) {
        Set<Character> characters= new HashSet<>();
        for (char ch: s.toCharArray()){
            if (Character.isLetter(ch)){
                characters.add(ch);
            }
            if (characters.size()==26){
                return true;
            }

        }
        return false;
    }
}
