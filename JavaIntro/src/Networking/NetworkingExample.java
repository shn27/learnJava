package Networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkingExample {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress  Address ;
        try {
              Address = InetAddress.getLocalHost() ;
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
      //  System.out.println(Address);
        Address = InetAddress.getByName("www.cricbuzz.com") ;

        System.out.println(Address);
        InetAddress ara[ ] = InetAddress.getAllByName("www.cricbuzz.com") ;
        for(int i = 0 ; i < ara.length ; i++){
          ;//  System.out.println(ara[i]);
        }

        System.out.println(Address.toString());
    }
}
