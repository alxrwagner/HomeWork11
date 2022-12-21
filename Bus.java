public final class Bus extends Transport{

    private final TypeOfBuss typeOfBuss;


    public Bus(String brand, String model, String productionCountry, int productionYear, float maxSpeed, String color, TypeOfBuss typeOfBuss) {
        super(brand, model, productionCountry, productionYear, maxSpeed, color);

        if(typeOfBuss == null){
            this.typeOfBuss = TypeOfBuss.CITY_BUSS;
        }
        else {
            this.typeOfBuss = typeOfBuss;
        }
    }

    public TypeOfBuss getTypeOfBuss() {
        return typeOfBuss;
    }

    @Override
    public String toString() {
        return "Автобус: " +
                "Бренд: " + brand +
                ", Модель: " + model +
                ", Цвет: " + color +
                ", Страна-производитель: " + productionCountry +
                ", Год выпуска: " + productionYear +
                ", Максимальная скорость: " + maxSpeed +
                ", Тип: " + typeOfBuss;
    }
}
