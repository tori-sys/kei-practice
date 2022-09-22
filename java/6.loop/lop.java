public class lop{
	public static String fizzbuzz(int num){
			if(num % 3 == 0 && num % 5 == 0){
				return num + "FizzBuzz";
			} else if(num % 5 == 0){
				return num + "Buzz";
			} else if(num % 3 == 0){
				return num + "Fizz";
			}else{
				return Integer.toString(num);
			}
		}
	public static void main(String[] args){
		for (int i = 1; i <=  20; i++){
			System.out.println(fizzbuzz(i));
		}
	}
}
