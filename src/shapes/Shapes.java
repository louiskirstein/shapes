/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import javax.swing.JOptionPane;

/**
 *
 * @author LK
 */
public class Shapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //    testCircle();
        testRectangle();
    }

    private static void testCircle() {
        Circle myCircle = new Circle(5.5);

    //    myCircle.setRadius(5.5);

        System.out.printf("Circle \n");
        System.out.printf("  radius = %.2f \n", myCircle.getRadius());

        System.out.printf("  diameter = %.2f \n", myCircle.getDiameter());

        System.out.printf("  area = %.2f \n", myCircle.getArea());

        System.out.printf("  circumference = %.2f \n", myCircle.getCircumference());

        System.out.printf("");

    }

    private static void testRectangle() {
        Rectangle myRectangle = new Rectangle();

        myRectangle.setLength(5.0);
        myRectangle.setWidth(6.0);
        System.out.println("   Rectangle     \n  -----------");
        System.out.printf("  width = %.2f \n", myRectangle.getWidth());
        System.out.printf("  length = %.2f \n", myRectangle.getLength());
        System.out.printf("  area = %.2f \n", myRectangle.getArea());
        System.out.printf("  rectangle = %.2f \n", myRectangle.getPerimeter());
        System.out.printf("  Is a square  = %s \n", myRectangle.isSquare());

    }

}
