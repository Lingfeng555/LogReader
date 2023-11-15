package Packages;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
/** This class create a instance of the package that is registered in the log file,
 *  it used basic datatypes of java.util.*
 *      @author LFenome
 */
public class HTTP_Package implements Comparable{
    private String ip;          // "127.0.0.1"
    private LocalDateTime date;     // "07/Nov/2016:11:35:01"
    private Method method;      // Instance of the class Method
    private String headerTitle; // "/admin/index.php"
    private String version;     // "HTTP/1.1"
    private String port;        // "973"
    private String dns;         // "http://127.0.0.1/admin/login.php"
    private String userAgent;   // "Mozilla/5.0 (Unknown; Linux i686) AppleWebKit/538.1 (KHTML, like Gecko) PhantomJS/2.1.1 Safari/538.1"

    /** Basic instance of HTTP package
     * 
     * @param ip    String of the source IPAddress
     * @param date  Moment that this package is registered
     * @param method    HTTP method
     * @param headerTitle   HTTP Method Header
     * @param version   HTTP Version
     * @param port  PortNumber
     * @param dns   Domain name
     * @param userAgent UserAgent device
     */
    public HTTP_Package(String ip, LocalDateTime date, Method method, String headerTitle, String version, String port, String dns, String userAgent) {
        this.ip = ip;
        this.date = date;
        this.method = method;
        this.headerTitle = headerTitle;
        this.version = version;
        this.port = port;
        this.dns = dns;
        this.userAgent = userAgent;
    }

    //Getters
    public String getIp() {return ip;}
    public LocalDateTime getDate() {return date;}
    public Method getMethod() {return method;}
    public String getHeaderTitle() {return headerTitle;}
    public String getVersion() {return version;}
    public String getPort() {return port;}
    public String getDns() {return dns;}
    public String getUserAgent() {return userAgent;}

    //Setters
    public void setIp(String ip) {this.ip = ip;}
    public void setDate(LocalDateTime date) {this.date = date;}
    public void setMethod(Method method) {this.method = method;}
    public void setHeaderTitle(String headerTitle) {this.headerTitle = headerTitle;}
    public void setVersion(String version) {this.version = version;}
    public void setPort(String port) {this.port = port;}
    public void setDns(String dns) {this.dns = dns;}
    public void setUserAgent(String userAgent) {this.userAgent = userAgent;}

    /** Defaul HashCode
     * 
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ip == null) ? 0 : ip.hashCode());
        result = prime * result + ((date == null) ? 0 : date.hashCode());
        result = prime * result + ((method == null) ? 0 : method.hashCode());
        result = prime * result + ((headerTitle == null) ? 0 : headerTitle.hashCode());
        result = prime * result + ((version == null) ? 0 : version.hashCode());
        result = prime * result + ((port == null) ? 0 : port.hashCode());
        result = prime * result + ((dns == null) ? 0 : dns.hashCode());
        result = prime * result + ((userAgent == null) ? 0 : userAgent.hashCode());
        return result;
    }
    /** Defaul equals
     * 
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        HTTP_Package other = (HTTP_Package) obj;
        if (ip == null) {
            if (other.ip != null)
                return false;
        } else if (!ip.equals(other.ip))
            return false;
        if (date == null) {
            if (other.date != null)
                return false;
        } else if (!date.equals(other.date))
            return false;
        if (method == null) {
            if (other.method != null)
                return false;
        } else if (!method.equals(other.method))
            return false;
        if (headerTitle == null) {
            if (other.headerTitle != null)
                return false;
        } else if (!headerTitle.equals(other.headerTitle))
            return false;
        if (version == null) {
            if (other.version != null)
                return false;
        } else if (!version.equals(other.version))
            return false;
        if (port == null) {
            if (other.port != null)
                return false;
        } else if (!port.equals(other.port))
            return false;
        if (dns == null) {
            if (other.dns != null)
                return false;
        } else if (!dns.equals(other.dns))
            return false;
        if (userAgent == null) {
            if (other.userAgent != null)
                return false;
        } else if (!userAgent.equals(other.userAgent))
            return false;
        return true;
    }
    /** CompareTo base con the Date of the package
     * 
     */
    @Override
    public int compareTo(Object o) {
        return this.getDate().compareTo(((HTTP_Package)o).getDate());
    }

    /** Default toString
     * 
     */
    @Override
    public String toString() {
        return "HTTP_Package [ip=" + ip + ", date=" + date + ", method=" + method + ", headerTitle=" + headerTitle
                + ", version=" + version + ", port=" + port + ", dns=" + dns + ", userAgent=" + userAgent + "]";
    }

    
}
