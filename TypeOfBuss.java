public enum TypeOfBuss {
    PARTY_BUSS("Патибасс"), SCHOOL_BUSS("Школьный автобус"), TRAVEL_BUSS("Автобус для путешествий"),
    CITY_BUSS("Городской транспорт");

    String typeOfBuss;

    TypeOfBuss(String typeOfBuss) {
        this.typeOfBuss = typeOfBuss;
    }

    @Override
    public String toString() {
        return typeOfBuss;
    }
}
