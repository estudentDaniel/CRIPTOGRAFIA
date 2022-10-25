public class MultInversoModular {

    public int ModuleInverso(int a, int m){
          for (int x = 1; x < m; x++){ 
              if(((a % m) * (x % m) % m) == 1){
                System.out.println("Valor modular: "+ x );
                  return x;
                  
              }
          }
          return 0;   
     }
}
