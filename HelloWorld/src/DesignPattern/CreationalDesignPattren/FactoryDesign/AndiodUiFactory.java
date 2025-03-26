package DesignPattern.CreationalDesignPattren.FactoryDesign;

import DesignPattern.CreationalDesignPattren.FactoryDesign.Buttons.AndriodButton;
import DesignPattern.CreationalDesignPattren.FactoryDesign.Buttons.Button;
import DesignPattern.CreationalDesignPattren.FactoryDesign.Menus.AndriodMenu;
import DesignPattern.CreationalDesignPattren.FactoryDesign.Menus.Menu;

public class AndiodUiFactory implements UiFactory{
    @Override
    public Button createButton() {
        return new AndriodButton();
    }

    @Override
    public Menu createMenu() {
        return new AndriodMenu();
    }
}
