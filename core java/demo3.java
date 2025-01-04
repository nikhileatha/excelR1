class demo3{
    public static void main(String []args){
        int a=10;
        int b=20;
        int c=30;
        if((a>b)&&(a>c)){
            System.out.println("a id greater than b and c");
        }
        else if((b>c)&&(b>a)){
            System.out.println("b is greater than a and c");
        }
        else{
             System.out.println("c is greater");
        }
          }
}