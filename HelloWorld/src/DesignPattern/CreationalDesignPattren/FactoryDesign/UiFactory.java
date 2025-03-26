package DesignPattern.CreationalDesignPattren.FactoryDesign;

import DesignPattern.CreationalDesignPattren.FactoryDesign.Buttons.Button;
import DesignPattern.CreationalDesignPattren.FactoryDesign.Menus.Menu;

//only factory methods
public interface UiFactory{
 Button createButton();
 Menu createMenu();
}
