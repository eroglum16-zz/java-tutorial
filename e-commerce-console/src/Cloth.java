public class Cloth extends Product { // Inheritance
    // isim, beden ve kullanılmışMı?

    private String name;
    private String size;
    private boolean isUsed;

    @Override
    public String getLabel(){
        return this.getName() + SEPARATOR + this.getSize() + SEPARATOR + this.getPrice();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }
}
