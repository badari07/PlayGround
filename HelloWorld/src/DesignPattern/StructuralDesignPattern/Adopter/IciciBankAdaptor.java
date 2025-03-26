package DesignPattern.StructuralDesignPattern.Adopter;

import DesignPattern.StructuralDesignPattern.Adopter.ThirdParty.IciciBank.IciciBank;

public class IciciBankAdaptor implements BankApi {

    IciciBank iciciBank = new IciciBank();
    @Override
    public void sendMoney(String account, int amount, String from, String to) {
        iciciBank.payMoney( from, to, account, amount);
    }

    @Override
    public void receiveMoney(String account, int amount, String from, String to) {

    }

    @Override
    public void registerAccount(String account, String name, String address, long phone, String email) {

    }

    @Override
    public long getBalance(String account) {
        return 0;
    }
}
