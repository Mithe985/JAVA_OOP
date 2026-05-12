class Box{
    double width;
    double height;
    double depth;

    Box(double h,double w,double d){
        height=h;
        width=w;
        depth=d;
    }

   double volume(){
    return height*depth*width;
   }
   

}
class BoxDemo7{
    public static void main(String[]args){
        Box mybox1=new Box(10,20,30);
        Box mybox2=new Box(20,30,40);
        double vol;
        
       
        vol=mybox1.volume();
        System.out.println(vol);

    
       
        vol=mybox2.volume();
        System.out.println(vol);
    }
}

