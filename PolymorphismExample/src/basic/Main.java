package basic;

interface Drawable{
    void draw();
    static int cube(int x){return x*x*x;}
}
class Rectangle implements Drawable{
    public void draw(){System.out.println("drawing rectangle");}
}

class Main{
    public static void main(String args[]){
        Drawable d=new Rectangle();
        Drawable a=new Drawable() {
            @Override
            public void draw() {

            }
        }
        d.draw();
        System.out.println(d.cube(3));
    }}