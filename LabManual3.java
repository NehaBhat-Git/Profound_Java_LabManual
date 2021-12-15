//accept two integer values via CLA* and perform all arithmetic operation
public class LabManual3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,num2;
		int add,sub,mult,mod;
		float div;
		num=Integer.parseInt(args[0]);
		num2=Integer.parseInt(args[1]);
		add=num+num2;
		System.out.println("Sum of 2 digit number is: "+add);
		
		sub=num-num2;
		System.out.println("Subtarction of 2 digit number is: "+sub);
		
		mult=num*num2;
		System.out.println("Multication of 2 digit number is: "+mult);
		
		mod=num%num2;
		System.out.println("Modulo of 2 digit number is: "+mod);
		
		div=(float)num/num2;
		System.out.println("Divsion of 2 digit number is: "+div);

	}

}
