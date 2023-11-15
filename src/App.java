import Packages.LogReader;
import Packages.PackageManager;

public class App {
    public static void main(String[] args) throws Exception {
        LogReader logReader = new LogReader("Resources/log.log");
        logReader.read();
        System.out.println("Registred IPs : " + PackageManager.getPackageManager().getPackages().keySet());
        for (String str: PackageManager.getPackageManager().getPackages().keySet()){
            System.out.println("IP " + str +  ": " + PackageManager.getPackageManager().getPackages().get(str).size() + " packaes" );
            System.err.println("\tFirst Package: "+ PackageManager.getPackageManager().getPackages().get(str).getFirst().getDate());
             System.err.println("\tLast Package: "+ PackageManager.getPackageManager().getPackages().get(str).getLast().getDate());
        }
    }
}
