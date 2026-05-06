import java.util.Scanner;

public class substring {

    static String manualSubstring(String str,int start,int end){
        String result="";
        for(int i=start;i<end;i++){
            result+=str.charAt(i);
        }
        return result;
    }

    static boolean compare(String a,String b){
        if(a.length()!=b.length()) return false;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        String text=sc.next();
        System.out.print("Enter start index: ");
        int s=sc.nextInt();
        System.out.print("Enter end index: ");
        int e=sc.nextInt();

        String manual=manualSubstring(text,s,e);
        String builtin=text.substring(s,e);

        System.out.println("Manual: "+manual);
        System.out.println("Built-in: "+builtin);
        System.out.println("Same result? "+compare(manual,builtin));
    }
}