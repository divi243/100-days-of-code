class SieveOfEratosthenes {
    void sieveOfEratosthenes(int n){
    boolean[] prime = new boolean[n+1];
    for(int i=0;i<=n;i++){
        prime[i] = true;
    }
    
    for(int i = 2; i<=n;i++){
        if(prime[i]==true){
            for(int j = i*i;j<=n;j=j+i){
                prime[j] =false;
            }
        }
    }
    for(int i=2;i<=n;i++){
        if(prime[i]==true){
            System.out.println(i+"");
        }
    }
}
public static void main(String args[]){
    SieveOfEratosthenes obj = new SieveOfEratosthenes();
   obj.sieveOfEratosthenes(30);
}
}
