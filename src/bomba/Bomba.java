/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bomba;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Bomba {

    private int contraseña;
    private int inten;

    public Bomba(){
        this.iniciar();
    }
    
    public Bomba(int contraseña, int inten) {
        this.contraseña = contraseña;
        this.inten = inten;
    }

    
    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    public int getInten() {
        return inten;
    }

    public void setInten(int inten) {
        this.inten = inten;
    }
    
    public void iniciar(){
        int bomba;
        bomba=(int)(Math.random()*999)+99;
        
        Scanner teclado= new Scanner(System.in);
        
        int contraseña, inten=0;
        
        
        while (inten<=9){
            inten++;
            System.out.println("Intento " +inten+ ", Ingrese contraseña: ");
            contraseña=teclado.nextInt();
            this.contraseña=contraseña;
            if (contraseña<bomba){
                System.out.println("La contraseña es muy pequeña");
            }else if(contraseña>bomba){
                System.out.println("La contraseña es muy grande");
            }else if(contraseña==bomba){
                System.out.println("Encontraste la contraseña, salvaste a todos, en el intento " + inten);
                break;
            }
            
            if(inten==10){
            System.out.println("Perdiste, boom");
        }
        }
        
        
    }
    
    
    
}
