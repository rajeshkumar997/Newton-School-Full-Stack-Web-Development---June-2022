static int Phone(int N, int K, int M){
//Enter your code here 
// int a = N*K;
//   int b = -1;
//   if(a>M && N%2==0 && K%2==0){
//     a = N/K;
//     return a;
//   }
//   if(a>M){
//     a = (N/K)+1;
//     return a;
//   }
//   else{
//     return b;
//   }
   int x;
    if(N*K<M){
      return -1;
    }
    else{
    x = M/K;
      if(M%K != 0){
       x++;
      }
      return x;
    }
 }
