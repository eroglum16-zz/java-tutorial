public abstract class Product implements Displayable { // Abstraction
    // ürünlerin ortak özellikleri: fiyat, satıcı, kdv oranı , foto url

    final String SEPARATOR = "\t";

    private double price;
    private String seller;
    private double vatRate;
    private String imageUrl;

    // Overloading
    public double calculatePriceWithVat(){
        double vatPrice = price + (price * vatRate);
        return vatPrice;
    }

    public double calculatePriceWithVat(int quantity){
        double vatPrice = price + (price * vatRate);
        return vatPrice * quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public double getVatRate() {
        return vatRate;
    }

    public void setVatRate(double vatRate) {
        this.vatRate = vatRate;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
