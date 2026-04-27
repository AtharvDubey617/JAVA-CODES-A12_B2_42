class FinallyBlock {
    public static void main(String[] args) {
        try {
            int num = 121/0; // num = 121/11
            System.out.println(num);
        }
        /* Finally block will always execute
           even if there is not exception in try block */
        finally {
            System.out.println("This is finally block");
        }
        System.out.println("Out of try-catch-finally");
    }
}
