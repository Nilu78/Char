class Main {
  public static void main(String[] args) {

    System.out.println(printReverse(1234));// -> 654321
    System.out.println(printReverse(3452));// -> 001
    System.out.println(printReverse(1222272227));// -> 7222222221

  }

    public static int printReverse(int num){
      
      while (num > 0){
      System.out.print(num % 10);
      num /= 10;
        
        
      }
      return 0;
    }
    
    
}



