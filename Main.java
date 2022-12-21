import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car.Insurance ladaInsurance = new Car.Insurance(LocalDate.of(2021, 5, 1), 21000, "787f8g76q");
        Car.Insurance audiInsurance = new Car.Insurance(LocalDate.of(2020, 3, 3), 21000, "789h8g76q");
        Car.Insurance bmwInsurance = new Car.Insurance(LocalDate.of(2022, 4, 22), 21000, "787f8g45j");
        Car.Insurance kiansurance = new Car.Insurance(LocalDate.of(2024, 12, 10), 21000, "787f0k76q");
        Car.Insurance hyundaiInsurance = new Car.Insurance(LocalDate.of(2024, 1, 15), 21000, "788f9g00l");

        Car lada = new Car("Lada", "Granta", "Россия", 2015, 120, "Желтый",
                1.7f, "Механика", "Седан", 4, 345, TiresType.SUMMER);
        Car audi = new Car("Audi ", "A8 50 L TDI quattro", "Германия ", 2020, 180, "Черный",
                3.0f, "Автомат", "Хэтчбек", 4, 386, TiresType.WINTER);
        Car bmw = new Car("BMW", "Z8", "Германия", 2021, 160  , "Черный",
                3.0f, "Автомат", "Седан", 4, 364, TiresType.SUMMER);
        Car kia = new Car("Kia ", "Sportage 4-го поколения", "Южная Корея", 2018, 2018 , "Красный",
                1.7f, "Автомат", "Хэтчбек", 4, 789, TiresType.WINTER);
        Car hyundai = new Car("Hyundai ", "Avante", "Южная Корея", 2016, 170 , "Зеленый",
                1.6f, "Автомат", "Седан", 4, 983, TiresType.SUMMER);

        Bus bmvBus = new Bus("BMW", "M1", "Германия", 2001, 300, "Желтый", TypeOfBuss.SCHOOL_BUSS);
        Bus hyundaiBus = new Bus("Hyundai", "Aero Space", "Южная Корея", 2013, 120, "Синий", TypeOfBuss.TRAVEL_BUSS);
        Bus hyundaiBus2 = new Bus("BMW", "Aero Town", "Южная Корея", 2018, 110, "Красный", TypeOfBuss.CITY_BUSS);

        lada.setInsurance(ladaInsurance);
        audi.setInsurance(audiInsurance);
        bmw.setInsurance(bmwInsurance);
        kia.setInsurance(kiansurance);
        hyundai.setInsurance(hyundaiInsurance);

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);

        System.out.println(bmvBus);
        System.out.println(hyundaiBus);
        System.out.println(hyundaiBus2);
    }
}