package ArrayofObjects;

public class product {
     int productid;
     String productname;
    float price;

    public product(int productid, String productname, float price) {
        this.productid = productid;
        this.productname = productname;
        this.price = price;
    }
    public static void display(product parray[])//we can give any name instead of parray as it is just passing those values
    {
        for (product p : parray) {
            if (p.price < 100) {
                System.out.println(p.price + " " + p.productname + " " + p.productid);
            }
        }
    }
public static void main(String[] args) {
    product p1 = new product(12, "pen", 200);
    product p2 = new product(13, "pencil", 10);
    //product p4=new product();
    product parray[] = {p1, p2};

    display(parray);


    for (product p : parray) {
        System.out.println(p.price + " " + p.productname + " " + p.productid);

    }

}


}
