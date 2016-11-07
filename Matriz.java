
package matriz;

import java.util.Random;

public class Matriz{
  int matri[][];
    
    public Matriz(int linhas){
        matri = new int [linhas][linhas];   
    }
    
    public void inserir(){
        Random gerador = new Random();
        for(int i = 0; i < matri.length; i++){
            for(int j = 0; j < matri.length; j++){
                matri[i][j] = gerador.nextInt(2);
            }
        }
    }
    
    public void imprimirDados(){
        for(int i = 0; i < matri.length; i++){
            for(int j = 0; j < matri.length; j++){
                System.out.print(matri[i][j] + " ");
            }
            System.out.println();
        }      
    }  

    public void x(){
        System.out.println("-----------------");
        for(int i = 0; i < matri.length; i++){
            for(int j = 0; j < matri.length; j++){
                if(i == j){
                    System.out.print(matri[i][j]+ " "); 
                }                
                if(i+j == matri.length - 1){
                    if(i==j){
                        System.out.print("");
                    }
                    else{
                      System.out.print(matri[i][j]+ " ");  
                    } 
                }                
                else{
                    System.out.print("  ");
                }                
            }
            System.out.println(" ");
        }
    }
}