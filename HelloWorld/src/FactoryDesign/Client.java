package FactoryDesign;

import FactoryDesign.Buttons.Button;
import FactoryDesign.Menus.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UiFactory uiFactory = flutter.getUiFactoryPlotofrm(SupportedPlotform.ANDRIOD);
        Button button = uiFactory.createButton();
        button.click();
        Menu menu = uiFactory.createMenu();
        menu.showMenu();

    }
}
