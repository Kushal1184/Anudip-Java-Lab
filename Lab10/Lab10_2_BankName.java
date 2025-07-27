public enum Lab10_2_BankName {
    ICICI(6.3),
    HDFC(5.8),
    SBI(6.0);

    private double interestRate;

    Lab10_2_BankName(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }
}
