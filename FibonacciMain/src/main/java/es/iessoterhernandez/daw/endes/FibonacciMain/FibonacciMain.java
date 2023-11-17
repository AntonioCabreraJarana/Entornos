package es.iessoterhernandez.daw.endes.FibonacciMain;

import java.util.Arrays;
import java.util.Scanner;

import es.iessoterhernandez.daw.endes.Fibonacci.Fibonacci;

/**
 * Hello world!
 *
 */
public class FibonacciMain 
{
	public static void main(String[] args)
    {
		var sc = new Scanner(System.in);
		System.out.println("Dime el tamaño de la serie");
       int numero = sc.nextInt();
       int[] serie = Fibonacci.fibonacci(numero);
       
       System.out.println( Arrays.toString(serie));
       
    }
}
