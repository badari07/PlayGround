package Phone;

public class OpratingFactory {
    public Os getInstance(String str) {
        if (str.equals("open")) {
            return new Anodiord();
        } else if (str.equals("closed")) {
            return new IOS();
        } else {
            return new windoes();
        }
    }
}
