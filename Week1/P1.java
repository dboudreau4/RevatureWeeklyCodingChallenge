package Week1;

import java.util.ArrayList;
import java.util.List;

public class P1{

    public static List<String> subs(String str){
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < str.length(); i++){
            for (int j = i+1; j <= str.length(); j++){
                list.add(str.substring(i, j));
            }
        }
        return list;
    }

    public static int LCS(String str1, String str2){
        List<String> l1 = subs(str1);
        List<String> l2 = subs(str2);
        int len = 0;
        for(String s1 : l1){
            for(String s2: l2){
                if(s1.equals(s2) && s1.length() > len){
                    len = s1.length();
                }
            }
        }
        return len;
    }
    public static void main(String[] args) {
        String A = "Minneapolis";
        String B = "Minnesota";

        System.out.println("Length of longest common subsequence of " + A + " and " + B);
        System.out.println(LCS(A, B));

    }

}