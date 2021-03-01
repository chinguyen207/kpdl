/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdtjv.chuong03.donglenh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import lthdtjv.chuong03.coffeelogic.CoffeeShop;
import lthdtjv.chuong03.coffeelogic.Manager;



/**
 *
 * @author Admin
 */
public class testCoffee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        CoffeeShop[] a = new CoffeeShop[]{new CoffeeShop("Kha Coffee", "2 Nguyen Hue"),
                                          new CoffeeShop("White garden", "4 Nguyen Hue"),
                                          new CoffeeShop("Hoang Truc Vien", "3 Nguyen Hue")};
        Manager[] managers = new Manager[] {
                            new Manager(a, 1000, "Le Thi A", 0, df.parse("12-12-1999")),
                            new Manager(new CoffeeShop[]{
                                new CoffeeShop("Hoang Hac", "12 Nguyen Hue")
                            },
                                    2000, "Nguyen Van B", 1, df.parse("12-12-2000"))
                            };
       
        
                System.out.println(Arrays.toString(managers));
       
    }
    
}
