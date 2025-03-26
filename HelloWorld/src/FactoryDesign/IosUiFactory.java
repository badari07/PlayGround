package FactoryDesign;

import FactoryDesign.Buttons.Button;
import FactoryDesign.Buttons.IosButton;
import FactoryDesign.Menus.IosMenu;
import FactoryDesign.Menus.Menu;

public class IosUiFactory implements UiFactory {
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }
}
