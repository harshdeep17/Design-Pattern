package design.pattern.creational.factory.ui;


import design.pattern.creational.factory.ui.components.Button;
import design.pattern.creational.factory.ui.components.Dropdown;
import design.pattern.creational.factory.ui.components.Menu;

public interface UIFactory {
    Button createButton();
    Menu createMenu();
    Dropdown createDropdown();
}
