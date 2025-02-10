
import java.util.Scanner;
public class ABC {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the size : ");
		int n = s.nextInt();
		System.out.println();
		
		for(int i=0;i<=(n-1);i++) {
			for(int j=0;j<=(n-1);j++) {
				//A
				if(i==0 && j!=0 && j!= (n-1)|| j == 0 && i!=0 || j == (n-1) && i!=0|| i == (n/2)) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {
				//B
				if(i==0 && j!=(n-1) || i == (n-1) && j!=(n-1) || j == 0 && i!=(n-1)|| j == (n-1) && i!=0 && i!= (n-1) && i!=(n/2) || i == (n/2) && j!= (n-1)) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {
				//C
				if(i==0 && j!=0 || i == (n-1) && j!=0|| j == 0 && i != 0 && i!=(n-1)) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {
				//D
				if(i==0 && j!=(n-1) || i == (n-1) && j!=(n-1) || j == 0 && i!=(n-1)|| j == (n-1) && i!=0 && i!= (n-1) ) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {
				//E
				if(i==0 && j!=0 || i == (n-1) && j!=0|| j == 0 && i != 0 && i!=(n-1) || i==(n/2)) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {
				//F
				if(i==0 && j!=0 || j == 0 && i != 0 || i==(n/2)) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {
				//G
				if(i==0 && j!=0 || j == 0 && i != 0 && i!=(n-1) || i==n-1 && j!=0 && j<=n/2 || j== (n/2) && i>n/2 || i == n/2 && j>n/2 && j != n-1 || j == n-1 && i>n/2 ) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {
				//H
				if(j==0 ||j == n-1 || i == n/2) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {
				//I
				if(i==0 ||i == n-1 || j == n/2) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {
				//J
				if(i==0 ||j == n/2 || i == n-1 && j<=n/2 || j == 0 && i>n/2 ) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {
				//K
				if(j==0 || (i+j) == n/2 || (i-j) == n/2 ) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {
				//L
				if(i==n-1 || j == 0) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {
				//M
				if(j==0 || j == n-1 || j == i && j <= n/2 || i<=n/2 && j >= n/2 && (i+j) == n-1) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {
				//N
				if(j==n-1 || j == 0 || i == j) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {	
				//O
				if(j==n-1 && i!=0 && i!=n-1 || j == 0 && i!= 0 && i!=n-1|| i == 0 && j!=0 && j!=n-1 || i == n-1 && j!=0 && j!=n-1) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {
				//P
				if(i == 0 && j!=n-1 || i==n/2  && j!=n-1 || j==0 ||  j == n-1 && i <=n/2 && i!=n-1 && i!=0 && i!=n/2 ) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {
				//Q
				if(i == 0 && j!=0 && j<3*n/4 || j == 0 && i!=0 && i<(3*n/4) || i == 3*n/4 && j<3*n/4 && j!=0 || j == 3*n/4 && i != 0 && i<= 3 * n/4  || i == j && j >=n/2) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {
				//R
				if(i == 0 && j!=n-1 || i==n/2  && j!=n-1 || j==0 ||  j == n-1 && i <=n/2 && i!=n-1 && i!=0 && i!=n/2 || (i-j) == n/2 ) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {
				//S
				if(i==0 && j!=0|| i==n/2 && j!=0  && j != n-1|| i == n-1 && j!=n-1 || j == 0 && i<n/2 && i!=0  || j == n-1 && i>n/2 && i!=n-1) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {
				//T
				if(i == 0 || j == n/2 ) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {
				//U
				if(j == 0 || j == n-1 || i==n-1 ) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {
				//V
				if(j == 0 && i<=n/2 || j == n-1 && i<=n/2 || (i-j)==n/2 || i+j == ((n-1)+(n/2) )) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {
				//W
				if(j==0 || j == n-1|| (i+j) == n-1 && j<=n/2|| i==j && i >=n/2) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {
				//X
				if(i == j || (i+j) == n-1 ) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {
				//Y
				if(i == j  && i<=n/2|| (i+j) == n-1 ) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {
				//Z
				if(i == 0 || (i+j) == n-1  || i == n-1) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
