public abstract class Transport {

    protected final String brand;
    protected final String model;
    protected final String productionCountry;
    protected final int productionYear;

    protected float maxSpeed;
    protected String color;

    public Transport(String brand, String model, String productionCountry, int productionYear, float maxSpeed, String color) {
        if (brand == null || brand.isBlank()){
            this.brand = "default ";
        }else {
            this.brand = brand;
        }

        if (model == null || model.isBlank()){
            this.model = "default";
        }else {
            this.model = model;
        }

        if (color == null || color.isBlank()){
            this.color = "Белый";
        }else {
            this.color = color;
        }

        if (productionCountry == null || productionCountry.isBlank()){
            this.productionCountry = "default";
        }else {
            this.productionCountry = productionCountry;
        }

        if (productionYear <= 0){
            this.productionYear = 2000;
        }else {
            this.productionYear = productionYear;
        }

        if (maxSpeed <= 0 ){
            this.maxSpeed = 60f;
        }else {
            this.maxSpeed = maxSpeed;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(float maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
