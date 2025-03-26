package DesignPattern.StructuralDesignPattern.Adopter;

import DesignPattern.StructuralDesignPattern.Adopter.ThirdParty.Yesbank.YesBank;

public class YesBankAdapotor implements BankApi {

    YesBank yesBank = new YesBank();
    @Override
    public void sendMoney(String account, int amount, String from, String to) {
            yesBank.transferMoney(account, amount, from, to);
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
