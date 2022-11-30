import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = new Scanner(System.in).nextLine();
        Customer customer1= new Customer("Alibek","Altynbbek uulu",Country.TURKEY,"alibke@amil.com",LocalDate.of(2002,3,2));
        Customer customer2= new Customer("Zhiidegul","Zhalilova",Country.USA,"zhijdegul.com",LocalDate.of(1993,1,15));
        Customer customer3= new Customer("Erbol","Ashirali uulu",Country.USA,"erbol@amil.com",LocalDate.of(2004,5,7));
        Customer[]customers={customer1,customer2,customer3};
        Scanner scanner=new Scanner(System.in);
        while (true){
            switch (scanner.nextByte()) {
                case 1 -> getFileReader();
                case 2 -> getText();
                case 3 -> System.out.println(customer1.getAge());
                case 4 -> System.out.println(Arrays.toString(customer1.getSameCountry(customers, scanner.nextLine())));
                case 5 -> System.out.println(Arrays.toString(customer1.sortCountry(customers)));
                case 6 -> System.out.println(Arrays.toString(customer1.allCustomer(customers)));
            }
        }
    }

    public static void getFileReader(){
        try{
            FileReader fileReader=new FileReader("myText.txt");
            Scanner scanner=new Scanner(fileReader);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }

        }catch (IOException e){
            System.out.println("There isn't such kind file of song" );
        }
    }

    public static void getText() {
        try (FileWriter fileWriter = new FileWriter("myText.txt")) {
            fileWriter.write("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Text~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            fileWriter.write("\n Customer деген класс тузунуз.Полерерин толтурунуз аты, фамилиясы,туулган олкосу,туулган жылы,почтасы");
            fileWriter.write("\nболсун.Дагы бир service деген интерфейс ачып аны анын ичине 4 метод жазыныз.");
            fileWriter.write("\n1-кардардын жашын кайтаруучу метод жазыныз,2-мамлекети окшош кардарларды");
            fileWriter.write("\nкайтарыныз,3-кардарлардын мамлекетин сорттоп чыгарыныз,4-баардык кардарларды кайтаруучу метод жазыныз");
            fileWriter.write("\nАл интерфейсти Customer клласына impliments кылып методдорго логикасын ");
            fileWriter.write("\nжазыныз.Mainдан жазган логиканызды иштетиниз\"");

        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

}