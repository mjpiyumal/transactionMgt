package io.mjcoding.util;

import java.util.HashMap;
import java.util.Map;

public class PaymentUtils {

    private static Map<String, Double> paymentMap = new HashMap<>();

    static {
        paymentMap.put("acc1", 12000.00);
        paymentMap.put("acc2", 10000.00);
        paymentMap.put("acc3", 5000.00);
        paymentMap.put("acc4", 8000.00);
    }

    public static boolean validateCreditLimit(String accNo, double payment) {
        if (payment > paymentMap.get(accNo)) {
            throw new InsufficientAmountException("Fund is too much");
        } else {
            return true;
        }
    }

}
