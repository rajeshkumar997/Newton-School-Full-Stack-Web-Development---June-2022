static int Knight(int X, int Y){
//Ener your code here
int p[] = {2,1,-1,-2,-2,-1,1,2};
int q[] = {1,2,2,1,-1,-2,-2,-1};
int count = 0;
for(int i=0; i<8; i++){
    int x = X + p[i];
    int y = Y + q[i];
    
    if(x>=1 && y>=1 && x<=8 && y<=8)
    count++;
}
return count;
}
