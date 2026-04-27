class test{
    public static void main(String[] args) {
       int i=50;
       int j=0;
       int data;
       try{
        data=i/j;                    //may throw exception 
       }catch(Exception e){
        System.out.println(i/(j+2)); //resolving exception
       }
    }
}
