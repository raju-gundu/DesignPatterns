package Factory;


import Factory.Components.Button.Button;
import Factory.Components.Dropdown.Dropdown;
import Factory.Components.Menu.Menu;

public interface UiFactory {
    public Button createButton();
    public Menu createMenu();
    public Dropdown createDropdown();
}
