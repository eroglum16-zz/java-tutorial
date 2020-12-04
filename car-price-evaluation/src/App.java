import java.util.Scanner;

public class App {


    public static void main(String[] args) throws Exception{
        String make;
        int year;
        String gear;
        int km;
        double motor;

        Car userCar = new Car();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Arabanın markası: ");
        make = scanner.next();
        userCar.setMake(make);

        System.out.println("Vites: ");
        gear = scanner.next();
        userCar.setGear(gear);

        System.out.println("Arabanın yılı: ");
        year = scanner.nextInt();
        userCar.setYear(year);

        System.out.println("Arabanın kilometresi: ");
        km = scanner.nextInt();
        userCar.setKm(km);

        System.out.println("Arabanın motoru: ");
        motor = scanner.nextDouble();
        userCar.setMotor(motor);

        /*
        if(make.equalsIgnoreCase("Hyundai")){
            totalPoints = totalPoints + 4;
        }else if(make.equalsIgnoreCase("Renault")){
            totalPoints += 8;
        }else if(make.equalsIgnoreCase("Toyota")){
            totalPoints += 12;
        }else if(make.equalsIgnoreCase("Ford")){
            totalPoints += 16;
        }else if(make.equalsIgnoreCase("Mercedes")){
            totalPoints += 20;
        }else{
            System.out.println("Markayı yanlış girdiniz");
        }
        */

        // Marka değerlendirmesi

        System.out.println(userCar.calculatePrice());


    }
}
