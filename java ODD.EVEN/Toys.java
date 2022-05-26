import java.util.*;
public class Toys {

    public static int getMaxToys(int prices[],int money){

        int sum=0;

        int count=0;

        int max=0;

        for(int i=0;i<prices.length;i++){

            sum=count=0;

            for(int j=i;j<prices.length;j++){

                if((sum+prices[j])<=money){

                    sum=sum+prices[j];

                    count=count+1;

                    max=Math.max(count,max);

                }

                else{

                    count=0;

                    sum=0;

                    break;

                }

            }

        }

        return max;



    }
    public static void main(String[] args){

        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();

            int prices[]=new int[n];

            for(int i=0;i<n;i++){

                prices[i]=sc.nextInt();

            }  

            int money=sc.nextInt();

            System.out.println("The no of Toys you can purchased :- " + getMaxToys(prices, money));
        }

    }

   

}