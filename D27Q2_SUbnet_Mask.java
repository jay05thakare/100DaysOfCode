
  import java.util.*;

public class D27Q2_SUbnet_Mask {
public static boolean isPowerOfTwo(int n){
if(n == 0)
return false;
return (int)(Math.ceil((Math.log(n)/Math.log(2)))) == (int)(Math.floor((Math.log(n)/
Math.log(2))));
}
public static void classC(int[] input, int n, Hashtable<Integer, Integer> map){
String net_id = input[0]+"."+input[1]+"."+input[2]+".";
int subnet_mask_bit = 24+(int)(Math.ceil(Math.log(n)/Math.log(2)));
int extra = subnet_mask_bit - 24;
int copy_extra =extra;
int sum = 0;
while(extra > 0){
sum += map.get(extra);
extra -= 1;
}
int last = 0;
int no_of_ip_in_sub = (int)Math.pow(2,8-(copy_extra));
System.out.println("Network Address: " + net_id +"0");
System.out.println("Subnet mask is of "+subnet_mask_bit+" bit.");
System.out.println("Subnet mask: "+"255.255.255."+sum);
System.out.println("Number of ip address in one subnet: "+no_of_ip_in_sub);
System.out.println("----------------------Subnet-----------------------");
for(int i = 0; i<n;i++){
System.out.println("Subnet "+(i+1)+": "+net_id+last+" to "+net_id+
(last+no_of_ip_in_sub-1));
last += no_of_ip_in_sub;
}
}
public static void classB(int[] input, int n, Hashtable<Integer, Integer> map){
int two_raise = (int)(Math.ceil((Math.log(n)/Math.log(2))));
int host_id_bit = 16-two_raise;
int no_of_ip_in_sub =(int)(Math.pow(2,host_id_bit));
String net_id = input[0]+"."+input[1]+".";
int subnet_mask_bit = 16+two_raise;
int sum1 = 225;
int sum2 = 0;
if(host_id_bit>8){
int extra = 32-(16+host_id_bit);
sum1=0;
while(extra > 0){
sum1 += map.get(extra);
extra -= 1;
}
}
else{
int extra = 8-host_id_bit;
while(extra > 0){
sum2 += map.get(extra);
extra -= 1;
}
}
int first = 0;
boolean check_no_of_ip = false;
if(no_of_ip_in_sub>256){
check_no_of_ip =true;
first = (no_of_ip_in_sub/256)-1;
}
else{
first = no_of_ip_in_sub-1;
}
System.out.println("Network Address: " + net_id +"0.0");
System.out.println("Subnet mask is of "+subnet_mask_bit+" bit.");
System.out.println("Subnet mask: "+"255.255."+sum1+"."+sum2);
System.out.println("Number of ip address in one subnet: "+no_of_ip_in_sub);
System.out.println("----------------------Subnet-----------------------");
if(n == 1){
System.out.println("Subnet 1: "+net_id+"0.0"+" to "+net_id+"255.255");
}
else if(n == 2){
System.out.println("Subnet 1: "+net_id+"0.0"+" to "+net_id+first+".255");
System.out.println("Subnet 2: "+net_id+(first+1)+".0"+" to "+net_id+
(first+first+1)+".255");
}
else if(n == 4){
System.out.println("Subnet 1: "+net_id+"0.0"+" to "+net_id+first+".255");
System.out.println("Subnet 2: "+net_id+(first+1)+".0"+" to "+net_id+
(first+first+1)+".255");
System.out.println("Subnet 3: "+net_id+(first+first+2)+".0"+" to "+net_id+
(first+first+first+3)+".255");
System.out.println("Subnet 4: "+net_id+(first+first+first+4)+".0"+" to "+net_id+"255.255");
}
else{
if(check_no_of_ip){
System.out.println("Subnet 1: "+net_id+"0.0 to "+net_id+first+".255");
System.out.println("Subnet 2: "+net_id+(first+1)+".0 to "+net_id+
(first+first+1)+".255");
System.out.println("Subnet 3: "+net_id+(first+first+2)+".0"+" to "+net_id+(first+first+first+2)+".255");
for(int i = 0; i<3;i++)
System.out.println(" .");
System.out.println("Subnet "+(n-2)+": "+net_id+(255-first-first-first-2)+".0 to "+net_id+(255-first-first-2)+".255");
System.out.println("Subnet "+(n-1)+": "+net_id+(255-first-first-1)+".0 to "+net_id+(255-first-1)+".255");
System.out.println("Subnet "+(n)+": "+net_id+(255-first)+".0 to "+net_id+"255.255");
}
else{
System.out.println("Subnet 1: "+net_id+"0.0"+" to "+net_id+"0."+first);
System.out.println("Subnet 2: "+net_id+"0."+(first+1)+" to "+net_id+"0."+(first+first+1));
System.out.println("Subnet 3: "+net_id+"0."+(first+first+2)+" to "+net_id+"0."+(first+first+first+2));
for(int i = 0; i<3;i++)
System.out.println(" .");
System.out.println("Subnet "+(n-2)+": "+net_id+"255."+(255-first-first-first-2)+" to "+net_id+"255."+(255-first-first-2));
System.out.println("Subnet "+(n-1)+": "+net_id+"255."+(255-first-first-1)+" to "+net_id+"255."+(255-first-1));
System.out.println("Subnet "+(n)+": "+net_id+"255."+(255-first)+" to "+net_id+"255.255");
}
}
}
public static void classA(int[] input, int n, Hashtable<Integer, Integer> map){
int two_raise = (int)(Math.ceil((Math.log(n)/Math.log(2))));
int host_id_bit = 24-two_raise;
int no_of_ip_in_sub =(int)(Math.pow(2,host_id_bit));
String net_id = input[0]+".";
int subnet_mask_bit = 8+two_raise;
int sum1 = 225;
int sum2 = 225;
int sum3 = 0;
if(host_id_bit>16){
int extra = 32-(8+host_id_bit);
sum1=0;
sum2=0;
while(extra > 0){
sum1 += map.get(extra);
extra -= 1;
}
}
else if(host_id_bit>8){
int extra = 16-host_id_bit;
sum2=0;
while(extra > 0){
sum2 += map.get(extra);
extra -= 1;
}
}
else{
int extra = 8-host_id_bit;
while(extra > 0){
sum3 += map.get(extra);
extra -= 1;
}
}
System.out.println("Network Address: " + net_id +"0.0.0");
System.out.println("Subnet mask is of "+subnet_mask_bit+" bit.");
System.out.println("Subnet mask: "+"255."+sum1+"."+sum2+"."+sum3);
System.out.println("Number of ip address in one subnet: "+no_of_ip_in_sub);
System.out.println("----------------------Subnet-----------------------");
int first = 0;
int ch = 0;
if(no_of_ip_in_sub>65536){
first = ((no_of_ip_in_sub/256)/256)-1;
ch = 2;
}
else if(no_of_ip_in_sub>256){
first = (no_of_ip_in_sub/256)-1;
ch =1;
}
else
first = no_of_ip_in_sub-1;
if(n == 1){
System.out.println("Subnet 1: "+net_id+"0.0.0"+" to "+net_id+"255.255.255");
}
else if(n == 2){
System.out.println("Subnet 1: "+net_id+"0.0.0"+" to "+net_id+first+"255.255");
System.out.println("Subnet 2: "+net_id+(first+1)+".0.0"+" to "+net_id+
(first+first+1)+"255.255");
}
else if(n == 4){
System.out.println("Subnet 1: "+net_id+"0.0.0"+" to "+net_id+first+".255.255");
System.out.println("Subnet 2: "+net_id+(first+1)+".0.0"+" to "+net_id+
(first+first+1)+".255.255");
System.out.println("Subnet 3: "+net_id+(first+first+2)+".0.0"+" to "+net_id+
(first+first+first+3)+".255.255");
System.out.println("Subnet 4: "+net_id+(first+first+first+4)+".0.0"+" to "+net_id+"255.255.255");
}
else{
if(ch == 2){
System.out.println("Subnet 1: "+net_id+"0.0.0 to "+net_id+first+".255.255");
System.out.println("Subnet 2: "+net_id+(first+1)+".0.0 to "+net_id+
(first+first+1)+".255.255");
System.out.println("Subnet 3: "+net_id+(first+first+2)+".0.0 to "+net_id+(first+first+first+2)+".255.255");
for(int i = 0; i<3;i++)
System.out.println(" .");
System.out.println("Subnet "+(n-2)+": "+net_id+(255-first-first-first-2)+".0.0 to "+net_id+(255-first-first-2)+".255.255");
System.out.println("Subnet "+(n-1)+": "+net_id+(255-first-first-1)+".0.0 to "+net_id+(255-first-1)+".255.255");
System.out.println("Subnet "+(n)+": "+net_id+(255-first)+".0.0 to "+net_id+"255.255.255");
}
else if(ch == 1){
System.out.println("Subnet 1: "+net_id+"0.0.0"+" to "+net_id+"0."+first+".255");
System.out.println("Subnet 2: "+net_id+"0."+(first+1)+".0 to "+net_id+"0."+(first+first+1)+".255");
System.out.println("Subnet 3: "+net_id+"0."+(first+first+2)+".0 to "+net_id+"0."+(first+first+first+2)+".255");
for(int i = 0; i<3;i++)
System.out.println(" .");
System.out.println("Subnet "+(n-2)+": "+net_id+"255."+(255-first-first-first-2)+".0 to "+net_id+"255."+(255-first-first-2)+".255");
System.out.println("Subnet "+(n-1)+": "+net_id+"255."+(255-first-first-1)+".0 to "+net_id+"255."+(255-first-1)+".255");
System.out.println("Subnet "+(n)+": "+net_id+"255."+(255-first)+".0 to "+net_id+"225.255.255");
}
else{
System.out.println("Subnet 1: "+net_id+"0.0.0"+" to "+net_id+"0.0."+first);
System.out.println("Subnet 2: "+net_id+"0.0."+(first+1)+" to "+net_id+"0.0."+(first+first+1));
System.out.println("Subnet 3: "+net_id+"0.0."+(first+first+2)+" to "+net_id+"0.0."+(first+first+first+2));
for(int i = 0; i<3;i++)
System.out.println(" .");
System.out.println("Subnet "+(n-2)+": "+net_id+"255.255."+(255-
first-first-first-2)+" to "+net_id+"255.255."+(255-first-first-2));
System.out.println("Subnet "+(n-1)+": "+net_id+"255.255."+(255-
first-first-1)+" to "+net_id+"255.255."+(255-first-1));
System.out.println("Subnet "+(n)+": "+net_id+"255.255."+(255-first) +" to "+net_id+"255.255.255");
}
}
}
public static void entireProgram(String[] getting_ip, int n, Hashtable<Integer, Integer> map)
{
int[] input = new int[4];
if(getting_ip.length == 4){
input[0] = Integer.valueOf(getting_ip[0]);
input[1] = Integer.valueOf(getting_ip[1]);
input[2] = Integer.valueOf(getting_ip[2]);
input[3] = Integer.valueOf(getting_ip[3]);
}
else{
System.out.print("Invalid IP");
}
if(!(input[0]<=255 && input[0]>=0) || !(input[1]<=255 && input[1]>=0) || !
(input[2]<=255 && input[2]>=0) || !(input[3]<=255 && input[3]>=0)){
System.out.print("Invalid IP");
}
else{
if(input[0]>=0 && input[0]<128){
System.out.println("Class: A");
classA(input, n, map);
}
else if(input[0]>=128 && input[0]<192){
System.out.println("Class: B");
classB(input, n, map);
}
else if(input[0]>=192 && input[0]<224){
System.out.println("Class: C");
classC(input, n, map);
}
else if(input[0]>=224 && input[0]<240){
System.out.println("Class: D");
System.out.println("Multicast Address");
}
else if(input[0]>=240 && input[0]<=255){
System.out.println("Class: E");
System.out.println("Reserved Address");
}
}
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
char c = 'Y';
Hashtable<Integer, Integer> map = new Hashtable<Integer, Integer>();
map.put(8, 1);
map.put(7, 2);
map.put(6, 4);
map.put(5, 8);
map.put(4, 16);
map.put(3, 32);
map.put(2, 64);
map.put(1, 128);
System.out.print("Enter IP address: ");
String ip_address = sc.nextLine();
String[] getting_ip = ip_address.split("\\.");
while(c == 'Y'){
System.out.print("Enter no of subnet you want: ");
int n = sc.nextInt();
if(isPowerOfTwo(n)){
entireProgram(getting_ip, n, map);
c = 'N';
}
else{
System.out.println("No. of Subnet should be power of 2");
c = 'Y';
}
}
}
}
