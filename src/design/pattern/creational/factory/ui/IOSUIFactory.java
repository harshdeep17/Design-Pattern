package design.pattern.creational.factory.ui;

import design.pattern.creational.factory.ui.components.Button;
import design.pattern.creational.factory.ui.components.Dropdown;
import design.pattern.creational.factory.ui.components.IOSButton;
import design.pattern.creational.factory.ui.components.Menu;

public class IOSUIFactory implements UIFactory{
    @Override
    public IOSButton createButton() {
        return new IOSButton();
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
