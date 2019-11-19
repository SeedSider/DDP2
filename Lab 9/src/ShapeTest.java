public class ShapeTest {
    public static void main(String[] args) {

        Shape a = new Shape();                 //Make Shape a using no args constructor
        System.out.println(a.getColor());      //Print color of Shape a
        System.out.println(a.isFilled());      //Print filled status of Shape a
        a.setColor("blue");                    //Change Shape a color to blue
        System.out.println(a.getColor());      //Print color of Shape a
        a.setFilled(false);                    //Change Shape a filled status to false
        System.out.println(a.isFilled());      //Print filled status of Shape a
        System.out.println(a);                 //Print a to String

        Shape b = new Shape("blue", false); //Make Shape b using constructor
        System.out.println(b.getColor());      //Print color of Shape b
        System.out.println(b.isFilled());      //Print filled status of Shape b
        b.setColor("cyan");                    //Change Shape a color to cyan
        System.out.println(b.getColor());      //Print color of Shape b
        b.setFilled(false);                    //Change Shape b filled status to false
        System.out.println(b.isFilled());      //Print filled status of Shape b
        System.out.println(b);                 //Print b to String

        Circle c = new Circle();
        System.out.println(c.getColor());      //Print color of Circle c that inherited from shape
        System.out.println(c.isFilled());      //Print filled status of Circle c that inherited from shape
        c.setColor("yellow");                  //Change Circle c color to yellow
        System.out.println(c.getColor());      //Print color of Circle c
        c.setFilled(false);                    //Change Circle c filled status to false
        System.out.println(c.isFilled());      //Print filled status of Circle c
        System.out.println(c.getRadius());     //Print radius of Circle c
        System.out.println(c.getPerimeter());  //Print perimeter of Circle c
        System.out.println(c.getArea());       //Print area of Circle c
        c.setRadius(10);    //Change radius of Circle c
        System.out.println(c);                 //Print Circle c to String


        Circle d = new Circle(12);
        System.out.println(d.getColor());      //Print color of Circle d that inherited from shape
        System.out.println(d.isFilled());      //Print filled status of Circle d that inherited from shape
        d.setColor("violet");                  //Change Circle d color to violet
        System.out.println(d.getColor());      //Print color of Circle d
        d.setFilled(false);                    //Change Circle d filled status to false
        System.out.println(d.isFilled());      //Print filled status of Circle d
        System.out.println(c.getRadius());     //Print radius of Circle d
        System.out.println(c.getPerimeter());  //Print perimeter of Circle d
        System.out.println(c.getArea());       //Print area of Circle d
        c.setRadius(10); //Change radius of Circle d
        System.out.println(d);                 //Print Circle d to String


        Circle e = new Circle(8, "cyan", true);
        System.out.println(e.getColor());      //Print color of Circle e
        System.out.println(e.isFilled());      //Print filled status of Circle e
        e.setColor("violet");                  //Change Circle e color to violet
        System.out.println(e.getColor());      //Print color of Circle e
        e.setFilled(false);                    //Change Circle e filled status to false
        System.out.println(e.isFilled());      //Print filled status of Circle e
        System.out.println(c.getRadius());                         //Print radius of Circle e
        System.out.println(c.getPerimeter());  //Print perimeter of Circle e
        System.out.println(c.getArea());       //Print area of Circle e
        c.setRadius(10);                       //Change radius of Circle e
        System.out.println(e);                 //Print Circle e to String

        Rectangle f = new Rectangle();
        System.out.println(f.getColor());      //Print color of Rectangle f that inherited from shape
        System.out.println(f.isFilled());      //Print filled status of Rectangle f that inherited from shape
        f.setColor("violet");                  //Change Rectangle f color to violet
        System.out.println(f.getColor());      //Print color of Rectangle f
        f.setFilled(false);                    //Change Rectangle f filled status to false
        System.out.println(f.isFilled());      //Print filled status of Rectangle f
        System.out.println(f.getLength());     //Print length of Rectangle f
        System.out.println(f.getWidth());      //Print width of Rectangle f
        System.out.println(f.getArea());       //Print area of Rectangle f
        System.out.println(f.getPerimeter());  //Print perimeter of Rectangle f
        f.setLength(10.0);                     //Change length of Rectangle f
        f.setWidth(12.0);                      //Change width of Rectangle f
        System.out.println(f);                 //Print Rectangle f to String

        Rectangle g = new Rectangle(8, 12);
        System.out.println(g.getColor());      //Print color of Rectangle g that inherited from shape
        System.out.println(g.isFilled());      //Print filled status of Rectangle g that inherited from shape
        g.setColor("violet");                  //Change Rectangle g color to violet
        System.out.println(g.getColor());      //Print color of Rectangle g
        g.setFilled(false);                    //Change Rectangle g filled status to false
        System.out.println(g.isFilled());      //Print filled status of Rectangle g
        System.out.println(g.getLength());     //Print length of Rectangle g
        System.out.println(g.getWidth());      //Print width of Rectangle g
        System.out.println(g.getArea());       //Print area of Rectangle g
        System.out.println(g.getPerimeter());  //Print perimeter of Rectangle g
        g.setLength(10.0);                     //Change length of Rectangle g
        g.setWidth(12.0);                      //Change width of Rectangle g
        System.out.println(g);                 //Print Rectangle g to String

        Rectangle h = new Rectangle(4 ,5, "grey", true);
        System.out.println(h.getColor());      //Print color of Rectangle h that inherited from shape
        System.out.println(h.isFilled());      //Print filled status of Rectangle h that inherited from shape
        h.setColor("violet");                  //Change Rectangle h color to violet
        System.out.println(h.getColor());      //Print color of Rectangle h
        h.setFilled(false);                    //Change Rectangle h filled status to false
        System.out.println(h.isFilled());      //Print filled status of Rectangle h
        System.out.println(h.getLength());     //Print length of Rectangle h
        System.out.println(h.getWidth());      //Print width of Rectangle h
        System.out.println(h.getArea());       //Print area of Rectangle h
        System.out.println(h.getPerimeter());  //Print perimeter of Rectangle h
        h.setLength(10.0);                     //Change length of Rectangle h
        h.setWidth(12.0);                      //Change width of Rectangle h
        System.out.println(h);                 //Print Rectangle h to String

        Square i = new Square();
        System.out.println(i.getColor());      //Print color of Square i that inherited from shape
        System.out.println(i.isFilled());      //Print filled status of Square i that inherited from shape
        i.setColor("violet");                  //Change Square i color to violet
        System.out.println(i.getColor());      //Print color of Square i
        i.setFilled(false);                    //Change Square i filled status to false
        System.out.println(i.isFilled());      //Print filled status of Square i
        System.out.println(i.getSide());       //Print side of Square i
        System.out.println(i.getArea());       //Print area of Square i
        System.out.println(i.getPerimeter());  //Print perimeter of Square i
        i.setSide(10.0);                       //Change side of Square i
        System.out.println(i);                 //Print Square i to String

        Square j = new Square(6);
        System.out.println(j.getColor());      //Print color of Square j that inherited from shape
        System.out.println(j.isFilled());      //Print filled status of Square j that inherited from shape
        j.setColor("violet");                  //Change Square j color to violet
        System.out.println(j.getColor());      //Print color of Square j
        j.setFilled(false);                    //Change Square j filled status to false
        System.out.println(j.isFilled());      //Print filled status of Square j
        System.out.println(j.getSide());       //Print side of Square j
        System.out.println(j.getArea());       //Print area of Square j
        System.out.println(j.getPerimeter());  //Print perimeter of Square j
        j.setSide(10.0);                       //Change side of Square j
        System.out.println(j);                 //Print Square i to String

        Square k = new Square(7, "orange", false);
        System.out.println(k.getColor());      //Print color of Square k that inherited from shape
        System.out.println(k.isFilled());      //Print filled status of Square k that inherited from shape
        k.setColor("violet");                  //Change Square k color to violet
        System.out.println(k.getColor());      //Print color of Square k
        k.setFilled(false);                    //Change Square k filled status to false
        System.out.println(k.isFilled());      //Print filled status of Square k
        System.out.println(k.getSide());       //Print side of Square k
        System.out.println(k.getArea());       //Print area of Square k
        System.out.println(k.getPerimeter());  //Print perimeter of Square k
        k.setSide(10.0);                       //Change side of Square k
        System.out.println(k);                 //Print Square k to String

    }
}