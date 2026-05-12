class Box{
    double width;
    double height;
    double depth;

    Box(){
        height=10;
        width=10;
        depth=10;
    }

   double volume(){
    return height*depth*width;
   }
   

}
class BoxDemo6{
    public static void main(String[]args){
        Box mybox1=new Box();
        Box mybox2=new Box();
        double vol;
        
       
        vol=mybox1.volume();
        System.out.println(vol);

    
       
        vol=mybox2.volume();
        System.out.println(vol);
    }
}

