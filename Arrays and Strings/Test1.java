import java.util.*;
public class Test1 {
    static boolean isSubstring(String s1, String s2) {
		/*this method returns true is one string is a substring of another*/
        return s2.contains(s1) || s1.contains(s2);
    }
    static boolean isRotation(String s1, String s2) {
		/*s3 is s1 concatinated with itself*/
        String s3 = s1+s1;
		/*if s2 is subtring of s3 then s1 is a rotation of s2*/
        return isSubstring(s3,s2);
    }
    public static void main(String[] args){
        String s1="java";
        String s2="va";
        /*Testing isSubstring method*/
        System.out.println(isSubstring(s1,s2));
        s1="waterbottle";
        s2="erbottlewat";
        /*Testing isRotation method*/
        System.out.println(isRotation(s1,s2));
    }
}
