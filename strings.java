//import java.util.Scanner;
//java strings are immutable 

public class strings {
    public static boolean palindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static float shortestpath(String str) {
        // TIME COMPLEXITY O(n)
        int x = 0;
        int y = 0;
        for (int i = 0; i < str.length(); i++) {
            char dir = str.charAt(i);
            // north
            if (dir == 'N') {
                y++;
            }
            // south
            else if (dir == 'S') {
                y--;
            }
            // east
            else if (dir == 'E') {
                x++;
            }
            // west
            else if (dir == 'W') {
                x--;
            }

        }
        int X2 = x * x;
        int Y2 = y * y;
        return (float) Math.sqrt(X2 + Y2);
    }

    public static String subString(String str, int si, int ei) {
        String ss = "";
        for (int i = 0; i < ei; i++) {
            ss += str.charAt(i);
        }
        return ss;
    }

    public static String uppercase(String gtr) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(gtr.charAt(0));
        sb.append(ch);

        for (int i = 1; i < gtr.length(); i++) {
            if (gtr.charAt(i) == ' ' && i < gtr.length() - 1) {
                sb.append(gtr.charAt(i));
                i++;
                sb.append(Character.toUpperCase(gtr.charAt(i)));
            } else {
                sb.append(gtr.charAt(i));
            }

        }
        return sb.toString();
    }
public static String compress(String str){
   String newStr="";
    for(int i=0; i<str.length();i++){
        Integer  count =1;
        while(i<str.length()-1   && str.charAt(i)==str.charAt(i+1)){
        count ++;
        i++;    
        }
        newStr+=str.charAt(i);
        if(count > 1){
            newStr += count.toString();
        }

    }
    return newStr;
} 
    public static void main(String[] args) {
        // char arr[]= {'a','b','c','d'};
        // String str="HOTEL RAINA";
        // System.out.println(str.length());
        // Scanner sc = new Scanner(System.in);
        // String name;
        // name =sc.nextLine();
        // System.out.println(name);

        // String fname = "John";
        // String lname= "Sony";
        // String fullname= fname+" "+ lname;
        // System.out.println(fullname.charAt(5));
        // for(int i=0;i<fullname.length();i++){
        // System.out.print(fullname.charAt(i)+" ");
        // }
        // String str = "madam";
        // String str = "WSE";
        // System.out.print(shortestpath(str));
        // String C1="ciaz";
        // String C2="ciaz";
        // String C3=new String("john");
        // if (C1==C2){
        // System.out.println("equal");
        // }else{
        // System.out.println("not equal");
        // }
        // if(C1==C3){
        // System.out.println("equal");
        // }else{
        // System.out.println("not equal");
        // }
        // if(C1.equals(C3)){ //.equals is function that compars any two strings to
        // check that they are same or not
        // System.out.println("equal");

        // }else{
        // System.out.println("not equal");
        // }
        // String str="joshua";
        // System.out.println(str.substring(4, 6));
        // System.out.println(subString(str, 0, 6));
        // String str[] = { "john", "joshua", "jovin" };
        // String largest = str[0];
        // for (int i = 1; i < str.length; i++) {
        // if (largest.compareTo(str[i]) < 0) {
        // largest = str[i];
        // }
        // }
        // System.out.println(largest);

        // code for string builder
        // StringBuilder sb = new StringBuilder("");
        // for (char ch = 'a'; ch <= 'z'; ch++) {
        // sb.append(ch);
        // }
        // System.out.println(sb.length());
        // String gtr = "joshua is a gay ";
        // System.out.println(uppercase(gtr));
        // String str = " abcd";
        // System.out.println(compress(str))
        // String str= "ShradhaDidi ";
        // String str1="ApnaCollege";
        // String str2= new String("ShradhaDidi");
        //System.out.println(str.equals(str1)+" "+str.equals(str2) );
        System.out.println(5>>2);
    }

}
