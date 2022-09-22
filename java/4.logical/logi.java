import static java.lang.System.out;
public class logi{
	public static void main(String[] args){
		out.print(true || true);
		out.print(true || false);
		out.print(false && true);
		out.println(false && false);
		out.print(!true);
		out.println(!false);
		out.print(10 == 10);
		out.println(10 == 1);
		out.print(10 != 10);
		out.println(10 != 1);
		out.print(10 > 1);
		out.println(1 < 10);
		out.print(10 >= 1);
		out.print(1 <= 10);
		out.println(10 <= 10);
	}
}
