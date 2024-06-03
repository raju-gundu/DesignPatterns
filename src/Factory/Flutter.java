package Factory;

public class Flutter {
    public void theme(){
        System.out.println("Setting Theme");
    }
    public void RefreshRate(){
        System.out.println("Changing Refresh Rate");
    }

    public UiFactory createUiFactory(String platform){
//        if (platform.equals("Android")){
//            return new AndroidUiFactory();
//        }
//        if (platform.equals("Ios")){
//            return new IosUiFactory();
//        }
//        return null;
        return UiFactoryFactory.createUiFactory(platform);

    }
}
