public enum TiresType {
    WINTER("Зимняя"), SUMMER("Летняя");

    String type;

    TiresType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}
