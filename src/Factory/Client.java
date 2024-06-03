package Factory;

import Factory.Components.Button.Button;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UiFactory uiFactory = flutter.createUiFactory("Ios");
        Button button = uiFactory.createButton();
        button.changeSize();

    }
}
