/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codility;
import java.util.Scanner;
/**
 *
 * @author CEFA
 */
public class BinaryGap {
    

	public static void main(String[] args) {
            int n=0;
            Scanner lector =new Scanner(System.in);
            System.out.println("escribe el numero a calcular:");
            n=lector.nextInt();
            solution sol=new solution();
            sol.solution(n);
        }
}

    

