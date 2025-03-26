package FactoryDesign;

import FactoryDesign.Buttons.AndriodButton;
import FactoryDesign.Buttons.Button;
import FactoryDesign.Menus.AndriodMenu;
import FactoryDesign.Menus.Menu;

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
