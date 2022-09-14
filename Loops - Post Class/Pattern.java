static void Pattern(int N){
//Enter your code here

    if(N>=3){
        for(int i = 1; i<=N+1; i++){
            if(i==2){
                continue;
            }
            int x = 0;
            for(int j=1; j<=i; j++){
                if(i==1 || i==N+1){
                    System.out.print("*");

                }else{
                    x++;
                    if(x==1 || x==i){
                        System.out.print("*");
                    }else{
                        System.out.print("^");
                    }
                }
            }
            System.out.print("\n");
        }
    }
}
