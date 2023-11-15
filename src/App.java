import Packages.LogReader;
import Packages.PackageManager;

public class App {
    public static void main(String[] args) throws Exception {
        LogReader logReader = new LogReader("Resources/log.log");
        logReader.read();
        System.out.println(PackageManager.getPackageManager().getPackages().keySet());
    }
}
