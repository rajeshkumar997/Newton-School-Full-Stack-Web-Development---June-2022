static boolean check(int N){

// //Enter your code here
boolean seven = false;
boolean nine = false;
while(N>0){
    int digit = N%10;
    if(digit == 7){
        seven = true;
    }
    if(digit == 9){
        nine = true;
    }
    N = N/10;
}
if(seven==true && nine==true){
   return false;
}
else{
    return true;
    }
}
static int MagicNumber(int N){
int i = 0;
while(check(N-i)== true && check(N+i) == true){
    i++;
}
if(check(N-i) == false){
    return N-i;
}
else{
   return N+i; 
}
}
