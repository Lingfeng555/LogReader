package Packages;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class PackageManager {
    private HashMap<String, TreeSet<Package>> ipPackagesMap = new HashMap<>(); // Key = IPAddress, value = sortedPackagesSet
    private static PackageManager packageManager;
    private HashMap<String, Method> methods; // key = methodCode; value = method
    public PackageManager(){packageManager = this;}

    public void addMethod(){

    }

    public void addPackage(){
        
    }
}
