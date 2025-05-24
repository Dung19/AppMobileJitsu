/* (C)2023 */
package com.jitsu.common.object;

public class ATM {
    private String name;
    private String address;

    public ATM() {}

    public ATM(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "ATM{" + "name='" + name + '\'' + ", address='" + address + '\'' + '}';
    }
}
