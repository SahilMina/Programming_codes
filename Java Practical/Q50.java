class box1{
double width;
double height;
double depth;
box1(){
System.out.println("constructor box");
width=10;
height=20;
depth=30;
}
double volume(){
return width*height*depth;
}
}
public class Q50{
public static void main(String[] args){
box1 mybox1=new box1();
box1 mybox2=new box1();


double vol;
vol=mybox1.volume();
System.out.println("volume is "+vol);
vol=mybox2.volume();
System.out.println("volume is "+vol);
}}