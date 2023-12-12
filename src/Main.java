import java.util.HashMap;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       InfoCar infoCar = new InfoCar();
       Car car = new Car();
        Map<Car,InfoCar> cars = new HashMap<>();
        cars.put(new Car(1,54123),new InfoCar(2020,"Audi",285000d,"Green"));
        cars.put(new Car(2,45124),new InfoCar(1997,"Mersedes",45123213d,"Yellow"));
        cars.put(new Car(3,56423),new InfoCar(2015,"Honda",302055d,"Brown"));
        cars.put(new Car(4,12458),new InfoCar(2018,"Gelik",142587d,"Pink"));
        cars.put(new Car(5,45323),new InfoCar(2019,"Priora",784512d,"Red"));
        cars.put(new Car(6,54311),new InfoCar(2023,"Tesla",124587d,"White"));
        cars.put(new Car(7,74125),new InfoCar(2000,"Toyoyta",12369854d,"Blue"));
       for (Map.Entry df : cars.entrySet()){
           System.out.println(df.getKey() + "\n "+ df.getValue()+"\n");
       }


    }
}
//Car деген класс тузунуз (Id, номер авто)
//Дагы бир класс тузунуз, ал класста машинанын данныйлары сакталат (год выпуска, модель, цена, цвет)
//HashMap тузунуз ключ - машина, маани - машинанын данныйлары
//HashMapти толтуруп кайра entrySet деген методун колдонуп баардык элементтерин консольго чыгарыныз