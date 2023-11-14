import Packages.LogReader;

public class App {
    public static void main(String[] args) throws Exception {
        LogReader logReader = new LogReader("Resources/log.log");
        logReader.read();
    }
}
