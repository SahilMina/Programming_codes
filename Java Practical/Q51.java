

class values{
int i=5;
int j=10;
int k=15;
int add;
int sum(){
add=i+j;
return add;
}
int sum(int i,int j,int k){
add=i+j+k;
return add;
}
}


public class Q51 {
    public static void main(String[] args) {
int add;

values Values = new values();
   
add=Values.sum();
System.out.println("sum is :"+add);
add=Values.sum(10,5,25);
System.out.println("sum is :"+add);
}}
        
  