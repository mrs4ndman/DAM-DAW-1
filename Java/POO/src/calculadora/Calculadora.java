package calculadora;

public class Calculadora {
    private int num1;
    private int num2;

   public Calculadora(int a, int b) {
       num1 = a;
       num2 = b;
   }
   
  
   public int suma() {
       int resul = num1 + num2;
       return resul;
   }
  
   public int resta() {
       int resul = num1 - num2;
       return resul;
   }
 
   public int multiplica() {
       int resul = num1 * num2;
       return resul;
   }
  
   public int divide() {
       int resul = num1 / num2;
       return resul;
   }
   
 
   public int divide0() {		   
	   if(num2 == 0)
	      throw new java.lang.ArithmeticException("Divisi�n por 0");
	   else{
	      int resul= num1 / num2;
	      return resul;
	   } 
	}

public static void main (String args[])
 {  double resultado;
    Calculadora calcu = new Calculadora(20,20);
    resultado = calcu.suma();
    System.out.println(resultado);
    resultado = calcu.multiplica();
    System.out.println(resultado);
    resultado = calcu.divide();
    System.out.println(resultado);
   	
 }

}