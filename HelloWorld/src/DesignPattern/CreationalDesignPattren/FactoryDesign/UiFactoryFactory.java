package DesignPattern.CreationalDesignPattren.FactoryDesign;

public class UiFactoryFactory {
    public static UiFactory getUiFactoryPlotofrm(SupportedPlotform platform) {
        if (platform.equals(SupportedPlotform.ANDRIOD)) {
            return new AndiodUiFactory();
        } else if (platform.equals(SupportedPlotform.IOS)) {
            return new IosUiFactory();
        } else {
            return null;
        }
    }
}
