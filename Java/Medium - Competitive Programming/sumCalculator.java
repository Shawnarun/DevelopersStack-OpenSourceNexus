/*
* Author : thushaonline
* Gmail : rajthusha99@gmail.com
* Date : 06.03.2024
* Description :  Abstract Class
*/

package MyData;
class MyName{
String name;
MyName(){
name=null;
}
void show(){
System.out.println(name);
}
}
public class DP{
public static void main(String args[]){
MyName ob=new MyName();
ob.show();
}
}