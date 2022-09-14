static int DragonSlayer(int A, int B, int C,int D){
//Enter your code here
 while(true){
     A =A - D;
     if(A<=0){
         return 1;
     }
     C = C - B;
     if(C<=0){
         return 0;
     }
 }
}
