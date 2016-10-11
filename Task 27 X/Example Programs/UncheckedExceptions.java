public class UncheckedExceptions {
   
   public static void main(String args[]){
      int num[]={1,2,3,4};
      System.out.println(num[5]);
   }
}

/*
   These are not exceptions at all, but problems that arise beyond
   the control of the user or the programmer. Errors are typically
   ignored in your code because you can rarely do anything about an
   error. For example, if a stack overflow occurs, an error will
   arise. They are also ignored at the time of compilation.
*/