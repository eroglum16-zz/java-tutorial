import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        /*
        String[] strings = new String[15];
        String[] strings2 = { "a", "b", "c" };

        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("b");


        for(int i = 0; i < 2; i++){
            System.out.println(stringList.get(i));
        }


        for (String str : stringList){
            System.out.println(str);
        }

        List<Product> productList = new ArrayList<>();
        productList.add(new Book());
        productList.add(new Cloth());

        //Casting
        Cloth cloth = (Cloth) productList.get(1);
        cloth.isUsed();
        */

        final String SEPARATOR = "\t";

        List<Book> bookList = new ArrayList<>();

        Book book1 = new Book();
        book1.setTitle("A game of thrones");
        book1.setAuthor("George R. R. Martin");
        book1.setNumberOfPages(700);
        book1.setPrice(50);

        Book book2 = new Book();
        book2.setTitle("Budala");
        book2.setAuthor("Fyodor Dostoyevski");
        book2.setNumberOfPages(800);
        book2.setPrice(20);

        bookList.add(book1);
        bookList.add(book2);

        List<Car> carList = new ArrayList<>();

        Car car1 = new Car();
        car1.setMake("Ford");
        car1.setModel("Focus");
        car1.setYear(2012);
        car1.setPrice(120000);

        Car car2 = new Car();
        car2.setMake("Toyota");
        car2.setModel("CHR");
        car2.setYear(2018);
        car2.setPrice(280000);

        carList.add(car1);
        carList.add(car2);

        List<Cloth> clothList = new ArrayList<>();

        Cloth cloth1 = new Cloth();
        cloth1.setName("Tişört");
        cloth1.setSize("medium");
        cloth1.setUsed(false);
        cloth1.setPrice(35);


        Cloth cloth2 = new Cloth();
        cloth2.setName("Pantolon");
        cloth2.setSize("44");
        cloth2.setUsed(false);
        cloth2.setPrice(90);

        clothList.add(cloth1);
        clothList.add(cloth2);

        System.out.println("Kitaplar");
        for (Book book : bookList){
            System.out.println(book.getLabel());
        }

        System.out.println("Arabalar");
        for (Car car : carList){
            System.out.println(car.getLabel());
        }

        System.out.println("Kıyafetler");
        for (Cloth cloth : clothList){
            System.out.println(cloth.getLabel());
        }

        List<CartItem> cart = new ArrayList<>();

        /*
            Kullanıcıdan seçtiği ürünler sıra sıra istenecek
            -1'e basıldığında ödeme kısmı için fiyat verilcek
         */

    }
}
