class funct {
    
    public static int suma(int x){
        return x + 3;
    }

    public static void multiplica(int n){
        System.out.println(n * 3);
    }
    
    public static void main(String[] args){
        multiplica(3);
        System.out.println(suma(9));
    }
}
