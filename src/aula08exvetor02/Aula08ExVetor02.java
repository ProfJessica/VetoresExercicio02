package aula08exvetor02;
import java.util.Scanner;

public class Aula08ExVetor02 {

    public static void main(String[] args) {
        
        //Crie um vetor A com 5 elementos inteiros. 
        //Após criado o vetor A faça B[i] = A[i] * 2.
        
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        
        Scanner ler = new Scanner(System.in);
        
        for (int i=0; i<vetorA.length; i++) {
            System.out.println("Entre com o valor da posição: " + i);
            vetorA[i] = ler.nextInt();
            vetorB[i] = vetorA[i] * 2;
        }
        
        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++) {
           System.out.print(vetorA[i] + " ");
        }
        
        System.out.println(); // apenas para pular linha

        System.out.print("Vetor B = ");
        for (int i=0; i<vetorB.length; i++) {
           System.out.print(vetorB[i] + " ");
        }
        System.out.println(); // apenas para pular linha

    }
    
}
