import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public final class Car extends Transport {

    private final String bodyType;
    private final int seatsAmount;
    private final float engineVolume;
    private String transmission;
    private Integer registrationNumber;
    private TiresType tiresType;

    private Insurance insurance;

    public Car(String brand, String model,  String productionCountry,
               int productionYear, float maxSpeed, String color, float engineVolume, String transmission,
               String bodyType, int seatsAmount, Integer registrationNumber, TiresType tiresType) {
        super(brand, model, productionCountry, productionYear, maxSpeed, color);

        if(tiresType == null){
            this.tiresType = TiresType.SUMMER;
        }else{
            this.tiresType = TiresType.WINTER;
        }

        if (seatsAmount <= 0){
            this.seatsAmount = 0;
        }else {
            this.seatsAmount = seatsAmount;
        }

        if (registrationNumber == null || registrationNumber <=0){
            this.registrationNumber = 0;
        }else {
            this.registrationNumber = registrationNumber;
        }

        if(bodyType == null || bodyType.isBlank()){
            this.bodyType = "default ";
        }else {
            this.bodyType = bodyType;
        }

        if (engineVolume <= 0 ){
            this.engineVolume = 1.5f;
        }
        else {
            this.engineVolume = engineVolume;
        }

        if (transmission == null || transmission.isBlank()){
            this.transmission = "default";
        }else {
            this.transmission = transmission;
        }
    }


    private static class Key{
        private final Boolean remoteEngineStart;
        private  final Boolean keylessAccess;

        public Key(Boolean remoteEngineStart, Boolean keylessAccess) {

            if(remoteEngineStart == null){
                this.remoteEngineStart = false;
            }else {
                this.remoteEngineStart = remoteEngineStart;
            }

            if (keylessAccess == null){
                this.keylessAccess = false;
            }else {
                this.keylessAccess = keylessAccess;
            }
        }

        public Boolean getRemoteEngineStart() {
            return remoteEngineStart;
        }

        public Boolean getKeylessAccess() {
            return keylessAccess;
        }

        @Override
        public String toString() {
            return "Ключ: Удаленный запуск двигателя: " + remoteEngineStart +
                    ", Бесключевой доступ :" + keylessAccess;
        }
    }

    public static class Insurance{
        private final LocalDate validityPeriod;
        private final float cost;
        private final String number;

        @Override
        public String toString() {
            return "Страховка: " +
                    "Срок действия: " + validityPeriod +
                    ", Стоимость: " + cost +
                    ", Номер: " + number;
        }

        public Insurance(LocalDate validityPeriod, float cost, String number) {
            if(validityPeriod == null){
                this.validityPeriod = LocalDate.of(2000,1,1);
            }else {
                this.validityPeriod = validityPeriod;
            }

            if (cost <= 0){
                this.cost = 0;
            }else {
                this.cost = cost;
            }

            if(number == null || number.isBlank() || number.length() < 9){
                this.number = "000000000";
            }else {
                this.number = number.toUpperCase();
            }


        }

        public void checkValidityPeriod(){
            if(LocalDate.now().isAfter(validityPeriod) || LocalDate.now().isEqual(validityPeriod)){
                System.out.printf("Сегодня %tD, а страховка действует до %tD! Пора продлить!%n", LocalDate.now(), validityPeriod);
            }
        }

        public void checkNumber(){
            if(number.length() < 9){
                System.out.printf("Номер страховки %S некорректный!", number);
            }
        }

        public LocalDate getValidityPeriod() {
            return validityPeriod;
        }

        public float getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }
    }

    @Override
    public String toString() {
        return "Автомобиль: " +
                "Бренд: " + brand +
                ", Модель: " + model +
                ", Цвет: " + color +
                ", Страна-производитель: " + productionCountry +
                ", Год выпуска: " + productionYear +
                ", Объем двигателя: " + engineVolume +
                ", \nРегистрационный номер: " + registrationNumber +
                ", Количество мест: " + seatsAmount +
                ", Коробка передач: " + transmission +
                ", Тип резины: " + tiresType +
                ", Тип кузова: " + bodyType +
                ", Максимальная скорость: " + maxSpeed +
                ", " + insurance;
    }

    public void changeTires(int monthNumber){
        if (monthNumber < 11 && monthNumber > 4){
            tiresType = TiresType.SUMMER;
        }else {
            tiresType = TiresType.WINTER;
        }
    }

    public void setInsurance(Insurance insurance) {
        if(this.insurance == null) {
            this.insurance = insurance;
        }
    }

    public Insurance getInsurance() {
        if (this.insurance == null){
            return new Insurance(LocalDate.of(2000, 1, 1), 0f, "000000000");
        } else {
            return insurance;
        }
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumber(Integer registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setTiresType(String tiresType) {

        if(tiresType == null || tiresType.isBlank() || !tiresType.equalsIgnoreCase(TiresType.WINTER.type)){
            this.tiresType = TiresType.SUMMER;
        }else{
            this.tiresType = TiresType.WINTER;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getTransmission() {
        return transmission;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public int getSeatsAmount() {
        return seatsAmount;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public Integer getRegistrationNumber() {
        return registrationNumber;
    }

    public TiresType getTiresType() {
        return tiresType;
    }
}
