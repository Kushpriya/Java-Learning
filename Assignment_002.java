import java.util.Scanner;
public class Assignment_002 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Nuclear Reactor Name:JX00-XC-HB1");
        System.out.println("Location of the Nuclear Reactor: East of Japan");
        Scanner sc = new Scanner(System.in);
        System.out.println("a)What is the total number of employees?");
        int total = Integer.parseInt(sc.nextLine());

        System.out.println("b)What is the name of the supervisor?");
        String name = sc.nextLine();

        System.out.println("c)How many times the Nuclear waste is removed from the core?");
        int times = Integer.parseInt(sc.nextLine());

        System.out.println("d)What is the total weight of the waste produced every 1 week?");
        float weight = Float.parseFloat(sc.nextLine());

        System.out.println("e)Is Electric Motor being replaced every 18 days? Press y for yes and n for no.");
        char response = sc.next().charAt(0);
        if(response=='y'){
            System.out.println(response);
           // System.out.println("Yes, the Electric Motor is being replaced every 18 days.");
        }else if(response=='n'){
            System.out.println("No, the Electric Motor is not being replaced every 18 days.");
        }else{
            System.out.println("Invalid Response");
        }
        System.out.println("f)What is the core average temperature ( celsius ) of the Nuclear Reactor?");

        double coreTempCelsius = sc.nextDouble();

        double coreTempKelvin = coreTempCelsius+273.15;

        System.out.print("The core average temperature is:");
        System.out.println(coreTempCelsius+"degree Celsius");
        System.out.println(coreTempCelsius+"Kelvin");
        System.out.println();
        System.out.println("Thank You!!!");


    }
}

