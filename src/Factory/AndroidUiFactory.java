package Factory;

import Factory.Components.Button.AndroidButton;
import Factory.Components.Dropdown.AndroidDropdown;
import Factory.Components.Menu.AndroidMenu;

public class AndroidUiFactory implements UiFactory{
    @Override
    public AndroidButton createButton() {
        System.out.println("Creating Android Button");
        return new AndroidButton();
    }

    @Override
    public AndroidMenu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public AndroidDropdown createDropdown() {
        return new AndroidDropdown();
    }
}
