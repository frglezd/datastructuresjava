

class Area{
    public static double area(double radio){
        return Math.PI*radio*radio;
    }

    public static void area2(int radio){
        System.out.println(Math.PI*radio*radio);

    }


    public static void main(String[] args){
        System.out.println(area(5));
        area2(5);

    }


}
