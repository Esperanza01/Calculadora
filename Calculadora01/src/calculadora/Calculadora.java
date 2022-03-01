/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author redes
 */
public class Calculadora {
    private int num1;
    private int num2;
    
    public Calculadora(int a, int b){
        num1=a;
        num2=b;
    }
    /* ggdh*/
    public int suma(){
        int result=num1+num2;
        return result;
    }
    
    /*Realizar cambios en la clase Calculadora directamente en el repositorio de GitHub (por ejemplo,
añadiendo un comentario). Actualizar los cambios en la copia local y comprobar que los cambios se
han actualizado. Hacer capturas de todo el proceso.*/
    
    public int resta(){
        int result;
        if (resta2())   result = num1-num2;
        else            result = num2-num1;
        return result;
    }
        
    public boolean resta2(){
        if (num1 > num2)    return true;
        else                return false;
    }
    
    public int multiplica(){
        int result=num1*num2;
        return result;
    }
    
    public int divide(){
        int result=num1/num2;
        return result;
    }
    
    public Integer divide2(){
        if(num2==0) return null;
        int result=num1/num2;
        return result;
    }

     public int divide0(){
        if(num2==0) 
            throw new java.lang.ArithmeticException("División por 0");
        else{
            int result=num1/num2;
            return result;
        }
    }
     
    /**
     * @param args the command line arguments
     */
    /*
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora calcu = new Calculadora(20, 10);
        System.out.println(calcu.suma());
    }
    */
}
