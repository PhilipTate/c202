impot java.util.*;
public class fac{
	public static void main()(String args[]){

		int num=Interger.parseInt(args[0]);
		
		for(int i=num;i>0;i--){
			num*=i;
		}
		char c=num.(""+num).toCharArray();
		System.out.println(c[c.length-1]);		

	}
}
