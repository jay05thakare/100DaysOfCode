
  import java.io.*;
  import java.net.InetAddress;
  
  public class D27Q1_Subnet_Mask_Of_An_IP_Address {
 
    public static void main(String[] args) throws IOException {
     
        System.out.println("ENTER IP:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ip = br.readLine();
        System.out.println();
        String checkclass = ip.substring(0, 3);



        int cc = Integer.parseInt(checkclass);
        String mask = null;
        if(cc>0 && cc<224)
        {
            if(cc<128)
            {
                System.out.println("Class A");
                System.out.println();
                mask = "255.0.0.0";
            }
            if(cc>127 && cc<192)
            {
                System.out.println("Class B");
                System.out.println();
                mask = "255.255.0.0";
            }
            if(cc>191)
            {
                System.out.println("Class C");
                System.out.println();
                mask = "255.255.255.0";
            }
        }
        System.out.println("MASK:\n"+mask);
                System.out.println();

        String networkAddr="";
        String[] ipAddrParts=ip.split("\\.");
        String[] maskParts=mask.split("\\.");

        for(int i=0;i<4;i++){
        int x=Integer.parseInt(ipAddrParts[i]);
        int y=Integer.parseInt(maskParts[i]);
        int z=x&y;
        networkAddr+=z+".";
        }
     
    System.out.println("ADDRESS:\n"+networkAddr.substring(0, networkAddr.length()-1));
   }
 
}
