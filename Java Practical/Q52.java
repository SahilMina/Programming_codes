
class values{
int i;
int j;
int k;
int add;
values(){
i=5;
j=15;
add=i+j;
System.out.println("Constructor Sum type1 :"+add);
}
values(int i,int j,int k){
add=i+j+k;
System.out.println("Constructor Sum type2 :"+add);
}
}


public class Q52 {
    public static void main(String[] args) {
values Values1 = new values(); 
values Values2 = new values(5,12,17);  
 
}}
        
  