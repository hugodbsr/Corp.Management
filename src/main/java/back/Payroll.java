package back;

import java.util.Date;

public class Payroll {
    private static int idCounter = 0;
    private final int ID;
    private Date payDate;
    private double basePay;
    private double commission;
    private double totalPay;

    public Payroll(double basePay, double commission) {
        this.ID = ++idCounter;
        this.payDate = new Date();
        this.basePay = basePay;
        this.commission = commission;
        this.totalPay = basePay + commission;
    }

    public int getID() {
        return ID;
    }

    public Date getPayDate() {
        return payDate;
    }

    public double getBasePay() {
        return basePay;
    }

    public double getCommission() {
        return commission;
    }

    public double getTotalPay() {
        return totalPay;
    }
}
