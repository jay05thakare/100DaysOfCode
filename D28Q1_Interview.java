// class D28Q1_Interview {
//   // final static short i = 2;
//   // public static int j = 0;

//   // public static void main(String[] args) {
//   //   for (int k=0; k<3; k++){
//   //     switch(k){
//   //       case i: System.out.println('0');
//   //       case i-1: System.out.println('1');
//   //       case i-2: System.out.println('2');
//   //     }
//   //   }
//   // }

//   // public static void main(String[] args) {
//   //   try {
//   //     int x = 5 / 0;
//   //   } catch (Exception e) {
//   //     System.out.println("Excep");
  
//   //   }catch(ArithmeticException e){
//   //     System.out.println("arith");
//   //   }
//   //   System.out.println("last line");
//   // }

//   public static void main(String[] args) {
//     Animal a = new Cat();
//     Cat c = (Cat)a;
//     c.id = 6;
//     System.out.printf("%d%d", a.id, a.getId());
//     System.out.printf("%d%d", c.id, c.getId());
//   }
// }

// class Animal{
//   public int id = 3;
//   public int getId(){
//     return id;
//   }
// }

// class Cat extends Animal{
//   public int id = 9;
//   public int getId(){
//     return id;
//   }
// }

class D28Q1_Interview{
  public static void main(String[] args) {
    try{
      try{
        System.out.println("divide");
        int b = 39/0;
      }catch(ArithmeticException e){
        System.out.println(e);
      }
      
      try{
        int a[] = new int[5];
        a[5] = 100;
      }catch(ArrayIndexOutOfBoundsException e){
        System.out.println(e);
      }}
      catch(Exception e){
        System.out.println("donald");
      }
      System.out.println("eval");
    
  }
}