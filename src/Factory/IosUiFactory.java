package Factory;



import Factory.Components.Button.IosButton;
import Factory.Components.Dropdown.IosDropdown;
import Factory.Components.Menu.IosMenu;

public class IosUiFactory implements UiFactory{

    @Override
    public IosButton createButton() {
        System.out.println("Creating Ios Button");
        return new IosButton();
    }

    @Override
    public IosMenu createMenu() {
        return new IosMenu();
    }

    @Override
    public IosDropdown createDropdown() {
        return new IosDropdown();
    }
}
