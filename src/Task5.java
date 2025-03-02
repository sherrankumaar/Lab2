import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task5 {
    public static void main(String[] args) {
        BigDecimal priceNet = new BigDecimal("9.99");
        BigDecimal vatRate = new BigDecimal("0.23");
        BigDecimal quantity = new BigDecimal("10000");

      BigDecimal vatMultiplier = vatRate.add(BigDecimal.ONE);

      BigDecimal priceGross = priceNet.multiply(vatMultiplier).setScale(4, RoundingMode.HALF_UP);

      BigDecimal totalWithVat = priceGross.multiply(quantity).setScale(2, RoundingMode.HALF_UP);

      BigDecimal totalWithoutVat = totalWithVat.divide(vatMultiplier, 10, RoundingMode.HALF_UP)
                .setScale(2, RoundingMode.HALF_UP);

        System.out.println("Net price: " + priceNet);
        System.out.println("Gross price (BigDecimal): " + priceGross);
        System.out.println("Total with VAT (BigDecimal): " + totalWithVat);
        System.out.println("Total excluding VAT (BigDecimal): " + totalWithoutVat);
    }
}
