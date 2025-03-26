package DesignPattern.CreationalDesignPattren.FactoryDesign.Buttons;

public class IosButton implements Button {
    @Override
    public void click() {
        System.out.println("Ios Button Clicked");
    }
}
