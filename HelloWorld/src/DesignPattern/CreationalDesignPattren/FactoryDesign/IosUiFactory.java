package DesignPattern.CreationalDesignPattren.FactoryDesign;

import DesignPattern.CreationalDesignPattren.FactoryDesign.Buttons.Button;
import DesignPattern.CreationalDesignPattren.FactoryDesign.Buttons.IosButton;
import DesignPattern.CreationalDesignPattren.FactoryDesign.Menus.IosMenu;
import DesignPattern.CreationalDesignPattren.FactoryDesign.Menus.Menu;

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
