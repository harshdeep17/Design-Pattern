package design.pattern.creational.factory.ui;

import design.pattern.creational.factory.ui.components.AndroidButton;
import design.pattern.creational.factory.ui.components.Button;
import design.pattern.creational.factory.ui.components.Dropdown;
import design.pattern.creational.factory.ui.components.Menu;

public class AndroidUIFactory implements UIFactory{

    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return null;
    }

    @Override
    public Dropdown createDropdown() {
        return null;
    }
}
