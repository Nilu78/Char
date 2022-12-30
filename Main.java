class Main {
  public static void main(String[] args) {

    System.out.println("Hello World!");

   System.out.println(occurance("Hello World", 'a')); //-> 0
   System.out.println(occurance("Hello World", 'l')); //-> 2
   System.out.println(occurance("occurence", 'c'));//-> 3
    
  }

   public static int occurance(String str, char ch){
   int count = 0;
     for (int i = 0; i < str.length(); i++) {
       if (str.charAt(i) == ch) {
         count++;
       }
     }
     
    return count;
  }
}