import java.util.Scanner;

public class chararray {

    static int getLength(String str){
        int c=0;
        while(true){
            try{ str.charAt(c); c++; }
            catch(Exception e){ break; }
        }
        return c;
    }

    static char[] manualArray(String str){
        int len=getLength(str);
        char[] arr=new char[len];
        for(int i=0;i<len;i++){
            arr[i]=str.charAt(i);
        }
        return arr;
    }

    static boolean compare(char[] a,char[] b){
        if(a.length!=b.length) return false;
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        String text=sc.next();

        char[] manual=manualArray(text);
        char[] builtin=text.toCharArray();

        System.out.println("Same result? "+compare(manual,builtin));
    }
}