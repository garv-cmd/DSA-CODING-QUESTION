/*
1. You are given a string str.
2. You are required to find the character with maximum frequency.
*/
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(hm.containsKey(c)){
                int freq = hm.get(c);
                freq++;
                hm.put(c,freq);
            }else{
                hm.put(c,1);
            }
        }
       
        char ch = s.charAt(0);
        
        for(Character key:hm.keySet()){
            if(hm.get(key)>hm.get(ch))
                ch = key;
            }
            System.out.println(ch);
        }
    }

