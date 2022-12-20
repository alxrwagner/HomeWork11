import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car.Insurance ladaInsurance = new Car.Insurance(LocalDate.of(2021, 5, 1), 21000, "787f8g76q");
        Car.Insurance audiInsurance = new Car.Insurance(LocalDate.of(2020, 3, 3), 21000, "789h8g76q");
        Car.Insurance bmwInsurance = new Car.Insurance(LocalDate.of(2022, 4, 22), 21000, "787f8g45j");
        Car.Insurance kiansurance = new Car.Insurance(LocalDate.of(2024, 12, 10), 21000, "787f0k76q");
        Car.Insurance hyundaiInsurance = new Car.Insurance(LocalDate.of(2024, 1, 15), 21000, "788f9g00l");

        Car lada = new Car("Lada", "Granta", "Желтый", "Россия", 2015, 1.7f,
                "Механическая", "Седан", 4, 345, "Летняя");
        Car audi = new Car("Audi ", "A8 50 L TDI quattro", "Черный ", "Германия", 2020, 3.0f,
                "Автомат", "Хэтчбек", 4, 378, "Летняя");
        Car bmw = new Car("BMW", "Z8", "Черный", "Германия", 2021  , 3.0f,
                "Автомат", "Универсал", 4, 254, "Зимняя");
        Car kia = new Car("Kia ", "Sportage 4-го поколения", "Красный", "Южная Корея", 2018 , 2.4f,
                "Автомат", "Хэтчбек", 4, 789, "Летняя");
        Car hyundai = new Car("Hyundai ", "Avante", "Оранжевый", "Южная Корея", 2016 , 1.6f,
                "Автомат", "Седан", 4, 304, "Зимняя");

        lada.setInsurance(ladaInsurance);
        audi.setInsurance(ladaInsurance);
        bmw.setInsurance(ladaInsurance);
        kia.setInsurance(ladaInsurance);
        hyundai.setInsurance(ladaInsurance);

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
    }
}