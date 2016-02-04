package barth.nolan.AccessLab01;

public class Connection{
    Connection(String pN, String ip){
        portNum = pN;
        iPAddress = ip;
    }
    private String portNum;
    private String iPAddress;
    public String getiPAddress(){
        return iPAddress;
    }
    public String getPortNum(){
        return portNum;
    }
}
