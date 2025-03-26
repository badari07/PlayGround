package DesignPattern.StructuralDesignPattern.Adopter;

import DesignPattern.StructuralDesignPattern.Adopter.Factory.BankFactory;

public class PhonePay {
    public static void main(String[] args) {
        BankApi bankApi = BankFactory.getBank(SupportedBank.YES);
        bankApi.sendMoney("1234", 100, "from", "to");


    }


}
