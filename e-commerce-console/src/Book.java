public class Book extends Product{
    // başlık, yazar, sayfa sayısı

    //Kapsülleme (Encapsulation)
    private String title;
    private String author;
    private int numberOfPages;

    private static String autherOfTheMonth = "J. R. R. Tolkien";

    //Override

    @Override
    public double calculatePriceWithVat(){
        double vatPrice = super.getPrice() + (super.getPrice() * super.getVatRate());
        if (this.author.equalsIgnoreCase(autherOfTheMonth)){
            return vatPrice * 0.9;
        }
        return vatPrice;
    }

    @Override
    public double calculatePriceWithVat(int quantity){
        double vatPrice = super.getPrice() + (super.getPrice() * super.getVatRate());
        if (this.author.equalsIgnoreCase(autherOfTheMonth)){
            return vatPrice * 0.9 * quantity;
        }
        return vatPrice * quantity;
    }

    @Override
    public String getLabel(){
        return this.getTitle() + SEPARATOR + this.getAuthor() + SEPARATOR + this.getPrice();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }



}
