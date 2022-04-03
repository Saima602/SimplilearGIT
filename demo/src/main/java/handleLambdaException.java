import java.util.function.BiConsumer;

public class handleLambdaException {
   public static void main(String[] args) {
	   int[] arr= {1,2,3,4,5,6};
	   int key=2;
	   printAll(arr,key,wrapperLambda((k,v)->System.out.println("AND IS :: "+k/v)));
   }
   
   private  static void printAll(int[] arr,int key,BiConsumer<Integer,Integer> consumer) {
	   for(Integer v:arr) {
		   consumer.accept(v, key);
	   }
   }
   
   private static BiConsumer<Integer,Integer> wrapperLambda(BiConsumer<Integer,Integer> consumer) {
	   return  (k,v) ->{
		   System.out.println("in program");
		   consumer.accept(k, v);
	   };
   }
}
