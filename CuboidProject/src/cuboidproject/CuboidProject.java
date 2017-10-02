/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuboidproject;

/**
 *
 * @author pwittenmyer
 */
public class CuboidProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuboid c1 = new Cuboid(1, 2, 3);
        
        System.out.println(c1.toString());
        System.out.println(c1.getVolume());
        
    }
    
}
