

class Multsuma{

    public static void multSuma(double num1, double num2, double num3){
        System.out.println(num1*num2 + num3);
    }

    public static void caramba(double number){
        multSuma(number, Math.exp(-number), Math.sqrt(1-Math.exp(-number)));
    }
    
    public static void main(String[] args){
        multSuma(1, 2, 3);
        multSuma(Math.sin(Math.PI /4),1, Math.cos(Math.PI/4) / 2);
        multSuma(Math.log(10),1, Math.log(20));
        caramba(1);
    }
}
