/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package runquad;
import java.util.Scanner;
/**
 *
 * @author ramaj
 */
public class RunQuad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape = null;
        
        while(shape == null) {
            System.out.print("Press R for Rectangle, S for Square, P for Parallelogram, H for Rhombus, or T for Trapezoid: ");
            char choice = scanner.next().toUpperCase().charAt(0);
            
            switch(choice) {
                case 'R':
                    shape = new Rectangle();
                    break;
                case 'S':
                    shape = new Square();
                    break;
                    
                    
                case 'P':
                    shape = new Parallelogram();
                    break;
                    
                case 'H':
                    shape = new Rhombus();
                    break;
                
                case 'T':
                    shape = new Trapezoid();
                    break;
                
                default:
                    System.out.println("Invalid choice. Please try again.");
                
            }
        
        }
        
        shape.showDescription();
        
    }
    
}
