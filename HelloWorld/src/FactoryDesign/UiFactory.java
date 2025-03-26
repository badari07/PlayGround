package FactoryDesign;

import FactoryDesign.Buttons.Button;
import FactoryDesign.Menus.Menu;

//only factory methods
public interface UiFactory{
 Button createButton();
 Menu createMenu();
}
