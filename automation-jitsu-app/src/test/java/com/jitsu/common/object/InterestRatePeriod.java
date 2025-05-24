/* (C)2023 */
package com.jitsu.common.object;

public class InterestRatePeriod {
    private String value;
    private Double rate;
    private String text;
    private int numDate;
    private String endDate;
    private Double temporaryInterestAmount;

    public InterestRatePeriod() {}

    public String getValue() {
        return value;
    }

    public InterestRatePeriod(
            String value,
            Double rate,
            int numDate,
            String endDate,
            Double temporaryInterestAmount) {
        this.value = value;
        this.rate = rate;
        this.numDate = numDate;
        this.endDate = endDate;
        this.temporaryInterestAmount = temporaryInterestAmount;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public int getNumDate() {
        return numDate;
    }

    public void setNumDate(int numDate) {
        this.numDate = numDate;
    }

    @Override
    public String toString() {
        return "InterestRatePeriod{"
                + "value='"
                + value
                + '\''
                + ", rate="
                + rate
                + ", text='"
                + text
                + '\''
                + ", numDate="
                + numDate
                + ", endDate='"
                + endDate
                + '\''
                + ", temporaryInterestAmount="
                + temporaryInterestAmount
                + '}';
    }
}
