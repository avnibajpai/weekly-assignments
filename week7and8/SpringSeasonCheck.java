import java.util.Scanner;
//LEVEL 1
class SpringSeasonCheck{
    String springSeason(int month, int day){
        if(month>=3 && month<=6) {
            if(month==3 && day>=20 && day<=31 )
             return "Spring Season";
            if(month==4 && day>=1 && day<=30)
             return "Spring Season";
            if(month==5 && day>=1 && day<=31)
                return "Spring Season";
            if(month==6 && day>=1 && day<=20)
                return "Spring Season";
        }

        return "Not Spring Season";
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter month number and day");
        int month=sc.nextInt();
        int day=sc.nextInt();
        SpringSeasonCheck s=new SpringSeasonCheck();
        System.out.println(s.springSeason(month,day));

    }
}