
import java.util.Scanner;
public class ABC {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the size : ");
		int n = s.nextInt();
		System.out.println();
		
		for(int i=0;i<=(n-1);i++) {
			for(int j=0;j<=(n-1);j++) {
				if(i==0 && j!=0 && j!= (n-1)|| j == 0 && i!=0 || j == (n-1) && i!=0|| i == (n/2)) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {
				if(i==0 && j!=(n-1) || i == (n-1) && j!=(n-1) || j == 0 && i!=(n-1)|| j == (n-1) && i!=0 && i!= (n-1) && i!=(n/2) || i == (n/2) && j!= (n-1)) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {
				if(i==0 && j!=0 || i == (n-1) && j!=0|| j == 0 && i != 0 && i!=(n-1)) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {
				if(i==0 && j!=(n-1) || i == (n-1) && j!=(n-1) || j == 0 && i!=(n-1)|| j == (n-1) && i!=0 && i!= (n-1) ) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {
				if(i==0 && j!=0 || i == (n-1) && j!=0|| j == 0 && i != 0 && i!=(n-1) || i==(n/2)) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {
				if(i==0 && j!=0 || j == 0 && i != 0 || i==(n/2)) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {
				if(i==0 && j!=0 || j == 0 && i != 0 && i!=(n-1) || i==n-1 && j!=0 && j<=n/2 || j== (n/2) && i>n/2 || i == n/2 && j>n/2 && j != n-1 || j == n-1 && i>n/2 ) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {
				if(j==0 ||j == n-1 || i == n/2) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {
				if(i==0 ||i == n-1 || j == n/2) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {
				if(i==0 ||j == n/2 || i == n-1 && j<=n/2 || j == 0 && i>n/2 ) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {
				if(j==0 || (i+j) == n/2 || (i-j) == n/2 ) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {
				if(i==n-1 || j == 0) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {
				if(j==0 || j == n-1 || j == i && j <= n/2 || i<=n/2 && j >= n/2 && (i+j) == n-1) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {
				if(j==n-1 || j == 0 || i == j) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {
				if(j==n-1 && i!=0 && i!=n-1 || j == 0 && i!= 0 && i!=n-1|| i == 0 && j!=0 && j!=n-1 || i == n-1 && j!=0 && j!=n-1) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {
				if(i == 0 && j!=n-1 || i==n/2  && j!=n-1 || j==0 ||  j == n-1 && i <=n/2 && i!=n-1 && i!=0 && i!=n/2 ) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {
				if(i == 0 && j!=0 && j<3*n/4 || j == 0 && i!=0 && i<(3*n/4) || i == 3*n/4 && j<3*n/4 && j!=0 || j == 3*n/4 && i != 0 && i<= 3 * n/4  || i == j && j >=n/2) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {
				if(i == 0 && j!=n-1 || i==n/2  && j!=n-1 || j==0 ||  j == n-1 && i <=n/2 && i!=n-1 && i!=0 && i!=n/2 || (i-j) == n/2 ) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {
				if(i==0|| i==n/2 || i == n-1 || j == 0 && i<=n/2  || j == n-1 && i>=n/2) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {
				if(i == 0 || j == n/2 ) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {
				if(j == 0 || j == n-1 || i==n-1 ) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {
				if(j == 0 && i<=n/2 || j == n-1 && i<=n/2 || (i-j)==n/2 || i+j == ((n-1)+(n/2) )) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {
				if(j==0 || j == n-1|| (i+j) == n-1 && j<=n/2|| i==j && i >=n/2) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {
				if(i == j || (i+j) == n-1 ) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {
				if(i == j  && i<=n/2|| (i+j) == n-1 ) {
					System.out.print("$ ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			for(int j=0;j<=(n-1);j++) {
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
