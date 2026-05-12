class Box{
    double width;
    double height;
    double depth;

   double volume(){
    return height*depth*width;
   }
   void setDim(double h,double w,double d){
    height=h;
   width=w;
    depth=d;
   }

}
class BoxDemo5{
    public static void main(String[]args){
        Box mybox1=new Box();
        Box mybox2=new Box();
        double vol;
        

        mybox1.setDim(10,20,15);
       
        vol=mybox1.volume();
        System.out.println(vol);

       
         mybox2.setDim(10,20,15);
       
        vol=mybox2.volume();
        System.out.println(vol);
    }
}

