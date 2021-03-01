/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdtjv.chuong03.coffeelogic;

/**
 *
 * @author Admin
 */
public class CoffeeShop {
    private String name;
    private String address;

    public CoffeeShop() {
    }

    public CoffeeShop(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "CoffeeShop{" + "name=" + name + ", address=" + address + '}';
    }
    
    
}
