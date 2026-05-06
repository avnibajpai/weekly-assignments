import java.util.Scanner;

public class compare{
    static int getLength(String str){
        int c=0;
        while(true){
            try{ str.charAt(c); c++; }
            catch(Exception e){ break; }
        }
        return c;
    }

    static boolean compare(String a,String b){
        if(getLength(a)!=getLength(b)) return false;
        for(int i=0;i<getLength(a);i++){
            if(a.charAt(i)!=b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1=sc.next();
        System.out.print("Enter second string: ");
        String s2=sc.next();

        boolean manual=compare(s1,s2);
        boolean builtin=s1.equals(s2);

        System.out.println("Manual: "+manual);
        System.out.println("Built-in: "+builtin);
        System.out.println("Same result? "+(manual==builtin));
    }
}