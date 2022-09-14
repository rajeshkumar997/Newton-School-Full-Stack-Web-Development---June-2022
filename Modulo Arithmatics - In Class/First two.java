static int firstTwo(int N){
//Enter your code here
int rev_num = 0;
        while (N > 99) {

           // rev_num = rev_num * 10 + N % 10;
            N = N / 10;
            rev_num = (N%10)*10 + (N/10);
        }
        return rev_num;
    
}
