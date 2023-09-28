package exp2;

public class exp2_1 {
    public static void main(String[] args) {
        System.out.println("----------a-Half Pyramid---------");
        
        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }System.out.println();
        }
        
        System.out.println("----------b-Inverted Half Pyramid---------");
        
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }System.out.println();
        }
        
        System.out.println("----------c-Hollow Half Pyramid---------");
        
        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                if (j==1 || j==i){
                    System.out.print(j+" ");
                }else if(i==5){
                    System.out.print(j+" ");
                }else{
                    System.out.print("  ");
                }
            }System.out.println();
        }
        
        System.out.println("---------d-Full Pyramid----------");
        
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5-i; j++){
                System.out.print(' ');
            }
            int x= i;
            for(int k =1; k<=i;k++){
                System.out.print(x);
                x++;
            }
            x = x-2;
            for(int l = 1; l<i ; l++){
                System.out.print(x);;
                x--;
            }
            System.out.println();
        }

        System.out.println("---------e-Hollow Full Pyramid----------");
        
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print("  ");
            }
            int l=1;
            for(int k=1; k<=(2*i-1);k++){
                if (k==1 && i!=5){
                    System.out.print("1 ");
                }else if(k==(2*i-1)){
                    System.out.print(i+" ");
                }else if(i==5 && k%2==1){
                    System.out.print(l+" ");
                    l++;
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("---------f-Hollow Inverted half Pyramid----------");
        
        int m=5;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m-i+1;j++){
                if (i==1){
                    System.out.print(j+" ");
                }else if(j==1){
                    System.out.print(i+" ");
                }else if(j==m-i+1){
                    System.out.print(m+" ");
                }else{
                    System.out.print("  ");
                }
            }System.out.println();
        }
    }  
}
