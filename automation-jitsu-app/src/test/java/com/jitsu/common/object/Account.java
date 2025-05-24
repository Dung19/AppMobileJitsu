/* (C)2023 */
package com.jitsu.common.object;

public class Account {
    private String accNo;
    private String accName;
    private String accBalance;
    private String accCode;
    private String accLimit;

    public Account() {}

    public Account(String accNo, String accName, String accBalance, String accCode) {
        this.accNo = accNo;
        this.accName = accName;
        this.accBalance = accBalance;
        this.accCode = accCode;
    }

    public Account(String accNo, String accName, String accBalance) {
        this.accNo = accNo;
        this.accName = accName;
        this.accBalance = accBalance;
    }

    public Account(String accNo, String accBalance) {
        this.accNo = accNo;
        this.accBalance = accBalance;
    }

    public Account(
            String accNo, String accBalance, String accLimit, String accName, String accCode) {
        this.accNo = accNo;
        this.accBalance = accBalance;
        this.accLimit = accLimit;
        this.accName = accName;
        this.accCode = accCode;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(String accBalance) {
        this.accBalance = accBalance;
    }

    public String getAccCode() {
        return accCode;
    }

    public void setAccCode(String accCode) {
        this.accCode = accCode;
    }

    public String getAccLimit() {
        return accLimit;
    }

    public void setAccLimit(String accLimit) {
        this.accLimit = accLimit;
    }

    @Override
    public String toString() {
        return "Account{"
                + "accNo='"
                + accNo
                + '\''
                + ", accName='"
                + accName
                + '\''
                + ", accBalance='"
                + accBalance
                + '\''
                + ", accCode='"
                + accCode
                + '\''
                + ", accLimit='"
                + accLimit
                + '\''
                + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account that = (Account) o;
        return accNo.equals(that.accNo) && accBalance.equals(that.accBalance);
    }
}
