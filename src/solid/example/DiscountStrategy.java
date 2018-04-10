package solid.example;

//Discount types S for Sale, D for Discount, L for Liquidation

public class DiscountStrategy {
    private String discountType;
    private double discountAmount;

    public DiscountStrategy (String discountType, double discountAmount)
    {
        this.discountType = discountType;
        this.discountAmount = discountAmount;
    }

    public String getDiscountType()
    {
        return discountType;
    }

    public double getDiscountAmount()
    {
        return discountAmount;
    }

    @Override
    public String toString()
    {
        return "DiscountStrategy{" +
                "discountType='" + discountType + '\'' +
                ", travel=" + discountAmount +
                '}';
    }

}
