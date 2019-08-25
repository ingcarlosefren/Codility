/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codility;

/**
 *
 * @author CEFA
 */
public class solution {
     int contadorunos=0;
     int contadorceros=0;
     int contadormax=0;
     
    public int solution(int N){
        String binario;
         binario = Integer.toBinaryString(N);
       
       for(int i=0;i<binario.length();i++){
            
            if(binario.charAt(i)=='0'){
                contadorceros=contadorceros+1;
           }else{
           
           contadorunos=contadorunos+1;
           
                //System.out.println("entro aqui"+contadormax);
                
           if (contadormax<contadorceros){
           contadormax=contadorceros;
                }
           contadorceros=0;
            }
            //System.out.println(binario.charAt(i));
            
           
    }
         //System.out.println(contadorceros+" y "+contadorunos);
         System.out.println("el valor de N es "+contadormax);
        // System.out.println("tamaño del binario "+binario.length());
         
         return contadormax;
    }
    
        
    }
    

