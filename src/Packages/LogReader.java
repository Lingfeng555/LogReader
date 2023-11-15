package Packages;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LogReader {
    private File lofFile;

    /** Default constructor
     * 
     * @param path Initial filePath
     */
    public  LogReader (String path){lofFile = new File(path);}
    /** Empty constructor
     * 
     */
    public  LogReader (){lofFile = null;}
    
    //Getter and Setter
    public File getLofFile() {return lofFile;}
    public void setLofFile(File lofFile) {this.lofFile = lofFile;}
    public void setLofFile(String path) {this.lofFile = new File(path);}

    public void read(String path){setLofFile(path);read();}
    public void read(File lofFile){setLofFile(lofFile);read();}
    public void read(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(lofFile));
            String line;
            while ( (line = reader.readLine()) != null ) {
                processLine(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void processLine(String line){
        String ip = "";
        String date = "";
        String methodHeader = "";
        String port  = "";
        String methodNumber = "";
        String methodName = "";
        String dns = "";
        String userAgent = "";
        int i = 0;
        //Take the string value of the IP_______________________
        while (line.charAt(i) != ' ') {
            ip = ip + String.valueOf(line.charAt(i));
            i++;
        }
        //System.out.println(ip);

        //Take the string value of the Date_____________________
        i = i + 6; // [
        while (line.charAt(i) != ' ') {
            date = date + String.valueOf(line.charAt(i));
            i++;
        }
        //System.out.println(date);
        
        //Take the string value of the header___________________
        i += 9; // "
        while (line.charAt(i) != '"') {
            methodHeader = methodHeader + String.valueOf(line.charAt(i));
            i++;
        }
        //System.out.println(methodHeader);

        //Take the string value of the methodName_______________
        int j = 0;
        while (methodHeader.charAt(j) != ' ') {
            methodName = methodName + String.valueOf(methodHeader.charAt(j));
            j++;
        }
        //System.out.println(methodName);

        //Take the string value of the MethodNumber_____________
        i += 2;
        while (line.charAt(i) != ' '){
            methodNumber = methodNumber + String.valueOf(line.charAt(i));
            i++;
        }
        //System.out.println(methodNumber);

        //Take the string value of the portNumber_______________
        i+= 1;
        while (line.charAt(i) != ' '){
            port = port + String.valueOf(line.charAt(i));
            i++;
        }
        //System.out.println(port);

        //Take the string value of the DNS______________________
        i+= 2;
        while (line.charAt(i) != '"') {
            dns = dns + String.valueOf(line.charAt(i));
            i++;
        }
        //System.out.println(dns);

        i+= 3;
        while (line.charAt(i) != '"') {
            userAgent = userAgent + String.valueOf(line.charAt(i));
            i++;
        }
        //System.out.println(userAgent);

        
    }
}
