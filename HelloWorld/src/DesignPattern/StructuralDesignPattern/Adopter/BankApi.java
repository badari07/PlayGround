package DesignPattern.StructuralDesignPattern.Adopter;

public interface BankApi {
    void sendMoney(String account, int amount, String from, String to);
    void receiveMoney(String account, int amount, String from, String to);
    void registerAccount(String account, String name, String address, long phone, String email);
    long getBalance(String account);
}
