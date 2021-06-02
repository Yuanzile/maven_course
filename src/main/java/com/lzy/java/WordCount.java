package com.lzy.java;

import java.io.*;
import java.util.HashMap;
import java.util.Set;

public class WordCount {

    public static void main(String[] args) throws IOException {

        HashMap<String, Integer> map = new HashMap<>();//记录单词次数

        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("D:/test.txt")));

        String buffer = "";//
        while((buffer = reader.readLine()) != null){
            String buffer1 = replaceSign(buffer);
            String[] wordLine = buffer1.split(" ");
            for (String word :
                    wordLine) {
                String word1 = word.toLowerCase();
//                System.out.println(word1);
                if (map.containsKey(word1)) {
                    Integer value = map.get(word1);
                    map.put(word1,value + 1);
                }else{
                    map.put(word1,1);
                }
            }
        }

        reader.close();


        Set<String> set = map.keySet();
        for (String key :
                set) {
            int value = map.get(key);
            System.out.println(key + " " + value);
        }

    }
    //将其他符号转化为空格
    public static String replaceSign(String text){
        String[] array = {".", ",","?", "!"};
        for (int i = 0; i < array.length; i++) {
            text = text.replace(array[i]," ");
        }
        return text;
    }
}
