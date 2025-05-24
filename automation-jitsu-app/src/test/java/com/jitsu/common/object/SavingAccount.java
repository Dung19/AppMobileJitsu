/* (C)2023 */
package com.jitsu.common.object;

public class SavingAccount {

    private String accountNumber;
    private String principalAmount;
    private String externalTypeId;
    private String maturityDate;
    private String currency;

    public SavingAccount() {}

    public SavingAccount(
            String accountNumber,
            String principalAmount,
            String externalTypeId,
            String maturityDate,
            String currency) {
        this.accountNumber = accountNumber;
        this.principalAmount = principalAmount;
        this.externalTypeId = externalTypeId;
        this.maturityDate = maturityDate;
        this.currency = currency;
    }

    public String getPrincipalAmount() {
        return principalAmount;
    }

    public void setPrincipalAmount(String principalAmount) {
        this.principalAmount = principalAmount;
    }

    public String getExternalTypeId() {
        return externalTypeId;
    }

    public void setExternalTypeId(String externalTypeId) {
        this.externalTypeId = externalTypeId;
    }

    public String getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(String maturityDate) {
        this.maturityDate = maturityDate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "SavingAccount{"
                + "accountNumber='"
                + accountNumber
                + '\''
                + ", principalAmount='"
                + principalAmount
                + '\''
                + ", externalTypeId='"
                + externalTypeId
                + '\''
                + ", maturityDate='"
                + maturityDate
                + '\''
                + ", currency='"
                + currency
                + '\''
                + '}';
    }
}
