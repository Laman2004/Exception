public class ListOfNumber {
  /*  public int[] arr = new int[10];
    public void writeList() {
        try {
            arr[10] = 11;
        }
        catch (NumberFormatException e1) {
            System.out.println("NumberFormatException => " + e1.getMessage());
        }
        catch (IndexOutOfBoundsException e2) {
            System.out.println("IndexOutOfBoundsException => " + e2.getMessage());
        }}
        public static void main(String[] args) {
            ListOfNumber list = new ListOfNumber();
            list.writeList(); }*/
        // declareing the type of exception
       /* public static void findFile() throws IOException {
            // code that may generate IOException
            File newFile = new File("test.txt");
            FileInputStream stream = new FileInputStream(newFile);
        }
        public static void main(String[] args) {
            try {
                findFile();
            }
            catch (IOException e) {
                System.out.println(e);
            }}}*/
      /*public static void divideByZero() {
          // throw an exception
          throw new ArithmeticException("Trying to divide by 0");
      }
      public static void main(String[] args) {
          divideByZero();
      }
  }*/
      public static void main(String[] args) {
          try {
              // code that generates exception
              int divideByZero = 5 / 0;
          }
          catch (ArithmeticException e) {
              System.out.println("ArithmeticException => " + e.getMessage());
          }
          finally {
              System.out.println("This is the finally block");
          }
      }
  }


