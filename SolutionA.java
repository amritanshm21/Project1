/*HEYY BABY its me/*
import java.util.Scanner;
  
public class SolutionA{
  public static void main(String[] args){
    
    Scanner input= new Scanner(System.in);
    int n = input.nextInt();
    int[] arr = new int[n+1];
    
    for(int i=1;i<=n;i++){
      arr[i] = input.nextInt();
    }
    
    int k=-1;
    
    for(int i=1;i<=n;i++){
      if(arr[i] == i){
        k=i;
        break;
      }
    }
     
    if(k != -1){
      System.out.println(k);
    }
    else{
      System.out.println("NOT_FOUND");
    }
  }
}