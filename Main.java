import java.util.Random;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		double [][]a = {{0.5, 0.5, 0.5, 0.5, 0.5},
                    {0, 1, 0, 1, 1},
                    {0.5, 1, 0.5, 0.5, 0},
                    {0, 0.5, 0, 0.5, 0},
                    {1, 1, 1, 1, 1},
                    {0, 0, 0, 0.5, 0.5},
                    {0, 0.5, 0, 0, 1}};
    
		int i, j;
		int ch;
		
		System.out.print("mode (1, 2 or 3): ");
		Scanner sc = new Scanner(System.in);
		ch = sc.nextInt();
		
		switch (ch) {
		case 1 -> {
      for(i=0; i<a.length; i++){
      for(j=0; j<a[i].length; j++){
        a[i][j]=sc.nextDouble();
      }
      }
    }
  		
		case 2 -> {
      for(i=0; i<a.length; i++){
        for(j=0; j<a[i].length; j++){
          new Random();
        }
      }
    }    
		case 3 -> { }
		default -> {
			System.out.println("mode error");
			sc.close();
			return;
    }
    }
		
		//sc.close();
    for(double[]r:a){
      for(double item:r){
        System.out.print(item+" ");
      }
      System.out.println();
    }
    System.out.println("result:");
    
    int count=0;
    int b;
    System.out.print("numbers: ");
    for(i=0; i<a.length; i++){
      b=0;
      for(j=0; j<a[i].length; j++){
        if(a[i][j]>0){
          b++;
        }
      }
        if(b==5){
          count++;
          System.out.print(i+1+" ");
      }
    }
    System.out.println("\ncount: " +count);
	}
}
