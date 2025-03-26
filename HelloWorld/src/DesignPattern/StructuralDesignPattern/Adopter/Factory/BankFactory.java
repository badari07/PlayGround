package DesignPattern.StructuralDesignPattern.Adopter.Factory;

import DesignPattern.StructuralDesignPattern.Adopter.BankApi;
import DesignPattern.StructuralDesignPattern.Adopter.IciciBankAdaptor;
import DesignPattern.StructuralDesignPattern.Adopter.SupportedBank;
import DesignPattern.StructuralDesignPattern.Adopter.YesBankAdapotor;

public class BankFactory {
    public static BankApi getBank(SupportedBank bankName) {
        if (bankName.equals(SupportedBank.ICICI)) {
            return new IciciBankAdaptor();
        } else if (bankName.equals(SupportedBank.YES)) {
            return new YesBankAdapotor();
        } else {
            return null;
        }
    }
}
