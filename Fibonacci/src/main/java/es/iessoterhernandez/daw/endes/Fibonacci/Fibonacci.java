package es.iessoterhernandez.daw.endes.Fibonacci;

/**
 * Hello world!
 *
 */
public class Fibonacci 
{
	public static int[] fibonacci(int number) {

		int[] result = new int[number];

        int a = 0;
        int b = 1;

        for (int i = 0; i < number; i++) {
            result[i] = a;

            int temp = a;
            a = b;
            b = temp + b;
        }

        return result;
	        

    }
}
