public class Car {
    private String make;
    private int year;
    private String gear;
    private int km;
    private double motor;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public double calculatePrice() throws Exception{
        double totalPoints = 0;

        switch (make){
            case "Hyundai":
                totalPoints = totalPoints + 4;
                break;
            case "Renault":
                totalPoints += 8;
                break;
            case "Toyota":
                totalPoints += 12;
                break;
            case "Ford":
                totalPoints += 16;
                break;
            case "Mercedes":
                totalPoints += 20;
                break;
            default:
                throw new Exception("Markayı yanlış girdiniz");
        }

        //Vites değerlendirmesi
        if(gear.equalsIgnoreCase("otomatik")) totalPoints += 10;

        double yearPoint = (year - 2000) * 1.5;
        totalPoints += yearPoint;

        if(km < 100){
            totalPoints += 20;
        }else if(km < 200){
            totalPoints += 16;
        }else if(km < 300){
            totalPoints += 12;
        }else if(km < 400){
            totalPoints += 8;
        }else if(km < 500){
            totalPoints += 4;
        }

        if(motor >= 2){
            totalPoints += 20;
        }else if(motor >= 1.8){
            totalPoints += 16;
        }else if(motor >= 1.6){
            totalPoints += 12;
        }else if(motor >= 1.4){
            totalPoints += 8;
        }else if(motor >= 1.2){
            totalPoints += 4;
        }

        double price = totalPoints * 3000;
        return price;
    }
}
