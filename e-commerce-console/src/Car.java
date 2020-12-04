public class Car extends Product{
    // marka, model ve yıl

    private String make;
    private String model;
    private int year;

    @Override
    public String getLabel(){
        return this.getMake() + SEPARATOR + this.getModel() + SEPARATOR + this.getPrice();
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
