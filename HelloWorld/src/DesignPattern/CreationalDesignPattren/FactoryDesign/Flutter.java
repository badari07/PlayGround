package DesignPattern.CreationalDesignPattren.FactoryDesign;

public class Flutter {

    void refreshUi() {
        System.out.println("Flutter: Refreshing UI");
    }

    void setThem(){
        System.out.println("Flutter: Setting Theme");

    }

    UiFactory getUiFactoryPlotofrm(SupportedPlotform platform) {
//        if (platform.equals(SupportedPlotform.ANDRIOD)) {
//            return new AndiodUiFactory();
//        } else if (platform.equals(SupportedPlotform.IOS)) {
//            return new IosUiFactory();
//        } else {
//            return null;
//        }
       return UiFactoryFactory.getUiFactoryPlotofrm(platform);

    }
}
