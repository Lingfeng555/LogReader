package Packages;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class PackageManager {
    private HashMap<String, TreeSet<HTTP_Package>> ipPackagesMap = new HashMap<>(); // Key = IPAddress, value = sortedPackagesSet
    private static PackageManager packageManager = new PackageManager();
    private HashMap<String, Method> methods; // key = methodCode; value = method
    public PackageManager(){packageManager = this;}

    public boolean addMethod(Method method){
        if(methods.containsKey(method.getCode())){return false;}
        else{methods.put(method.getCode(), method);return true;}
    }

    public void addPackage(HTTP_Package newPackage){
        if(ipPackagesMap.containsKey(newPackage.getIp())){
            ipPackagesMap.get(newPackage.getIp()).add(newPackage);
        }
        else{   
            ipPackagesMap.put(newPackage.getIp(), new TreeSet<>());
            addPackage(newPackage);
        }
    }
}
