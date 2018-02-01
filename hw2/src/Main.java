package hw2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Patiwet
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DynamicArray var = new DynamicArray(2);
        var.printStructure();
        var.pushBack(5);
        var.pushBack(6);
        var.printStructure();
        var.pushBack(7);
        var.printStructure();
        var.pushBack(8);
        var.printStructure();
        var.pushBack(9);
        var.printStructure();

    }
}
