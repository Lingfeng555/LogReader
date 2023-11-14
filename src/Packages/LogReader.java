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
        int i = 0;
        while (line.charAt(i) != ' ') {
            ip = ip + String.valueOf(line.charAt(i));
            i++;
        }
        //System.out.println(ip);

        i = i + 6; // [
        while (line.charAt(i) != ' ') {
            date = date + String.valueOf(line.charAt(i));
            i++;
        }
        //System.out.println(date);
        
        i += 9; // "
        while (line.charAt(i) != '"') {
            methodHeader = methodHeader + String.valueOf(line.charAt(i));
            i++;
        }
        System.out.println(methodHeader);
    }
}
