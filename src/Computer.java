import java.math.BigDecimal;

public class Computer {

    private String model;
    private double diagonalOfMonitor;
    private boolean isCompanyComputer;
    private BigDecimal price;
    private boolean isLaptop;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getDiagonalOfMonitor() {
        return diagonalOfMonitor;
    }

    public void setDiagonalOfMonitor(double diagonalOfMonitor) {
        this.diagonalOfMonitor = diagonalOfMonitor;
    }

    public boolean isCompanyComputer() {
        return isCompanyComputer;
    }

    public void setCompanyComputer(boolean companyComputer) {
        isCompanyComputer = companyComputer;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean isLaptop() {
        return isLaptop;
    }

    public void setLaptop(boolean laptop) {
        isLaptop = laptop;
    }
    public Computer(String model, double diagonalOfMonitor, boolean isCompanyComputer, BigDecimal price, boolean isLaptop) {
        this.model = model;
        this.diagonalOfMonitor = diagonalOfMonitor;
        this.isCompanyComputer = isCompanyComputer;
        this.price = price;
        this.isLaptop = isLaptop;
    }
    public Computer(double diagonalOfMonitor, boolean isCompanyComputer) {
        this.model = "Dell";
        this.diagonalOfMonitor = diagonalOfMonitor;
        this.isCompanyComputer = isCompanyComputer;
        this.price = new BigDecimal("250.5");
    }

    @Override
    public String toString() {
        return "Computers{" +
                "model='" + model + '\'' +
                ", diagonalOfMonitor=" + diagonalOfMonitor +
                ", isCompanyComputer=" + isCompanyComputer +
                ", price=" + price +
                ", isLaptop=" + isLaptop +
                '}';
    }
}

