package xmaxTree_printing;

public class susobhan {
	public static void main(String args[]) {
		int n = 10;
		for(int i=n;i>=1;i--) {
			for(int j = 1;j<i;j++) {
				System.out.print(" ");
			}
			for(int k= n;k>=i;k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=n-5;i>=1;i--) {
			for(int j = 1;j<i;j++) {
				System.out.print(" ");
			}
			for(int k= n;k>=i;k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
		
		
		for(int i=n-5;i>=1;i--) {
			for(int j = 1;j<i;j++) {
				System.out.print(" ");
			}
			for(int k= n;k>=i;k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=n-5;i>=1;i--) {
			for(int j = 1;j<i;j++) {
				System.out.print(" ");
			}
			for(int k= n;k>=i;k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i = n;i>=1;i--) {
			for(int kk=1;kk<=((n+n)/3);kk++) {// as  i am giving the *_  at the time of printing each leaf so total space will be n+n
				System.out.print(" ");// we are  dividing n+n/3 because i have give same space in two side and   at the middle i  have to print star

			}
			
			for(int j=((n+n)/3)+1;j>=1;j--) {
				System.out.print("*");

			}
			System.out.println();

		}
		
		
	}

}
