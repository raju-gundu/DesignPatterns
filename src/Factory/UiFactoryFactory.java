package Factory;

public class UiFactoryFactory {
    public static UiFactory createUiFactory(String platform){
        if (platform.equals("Android")){
            return new AndroidUiFactory();
        }
        if (platform.equals("Ios")){
            return new IosUiFactory();
        }
        return null;
    }
}
