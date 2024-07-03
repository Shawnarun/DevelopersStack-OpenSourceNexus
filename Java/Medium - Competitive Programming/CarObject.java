/*
* Author : thushaonline
* Gmail : rajthusha99@gmail.com
* Date : 18.02.2024
* Description : String Data Type
*/

/*
 * Author : musaraf
 * Email : nowsathmusaraf037@gmail.com
 * Date : 25/06/2024
 * Description : Error Correction 
 */

class Car{
    String color;
    void start (){
        System.out.println("Staring the car");
    }
}
public class CarObject{
    public static void main (String args []){
        Car myCar = new Car();
        myCar.color = "Blue";
        myCar.start();
    }
}