class Box3D extends Box{
    double height;
    Box3D(double l,double b,double h){
        super(l,b);
        height=h;
    }
    double volume(){
        return length*breadth*height;
    }
}