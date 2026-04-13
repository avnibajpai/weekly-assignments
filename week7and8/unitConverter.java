import java.util.Scanner;
class unitConverter{
    //week 2
    public static double convertKmToMiles(double km){
        return km * 0.621371;
    }
    public static double convertMilesToKilometers(double miles){
        return miles * 1.60934;
    }
    public static double convertMetersToFeet(double kilometers){
        return kilometers * 3.28084;
    }
    public static double convertFeetToMeters(double kilometers){
        return kilometers * 0.3048;
    }
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("CHOICE 1:\n to convert km to miles ");
        System.out.println("CHOICE 2:\n to convert miles to km ");
        System.out.println("CHOICE 3:\n to convert m to feet ");
        System.out.println("CHOICE 4:\n to convert feet to m ");
        System.out.println("Enter a choice(1-4): ");
        int ch=input.nextInt();
        switch(ch){
            case 1:
                System.out.println("Enter kilometers: ");
                double km = input.nextDouble();
                System.out.println(convertKmToMiles(km));
                break;
                case 2:
                    System.out.println("Enter miles: ");
                    double m = input.nextDouble();
                    System.out.println(convertMilesToKilometers(m));
                    break;
                    case 3:
                        System.out.println("Enter meters: ");
                        double mt = input.nextDouble();
                        System.out.println(convertMetersToFeet(mt));
                        break;
                        case 4:
                            System.out.println("Enter feet: ");
                            double ft = input.nextDouble();
                            System.out.println(convertFeetToMeters(ft));
                            break;
                            default:
                                System.out.println("Invalid choice.");

        }

    }
}