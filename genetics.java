import java.util.*;
import java.io.*;

public class genetics {
	
	static int N = 6;
	static int L = 5;
	static int[][] pop = new int[N][L];
	static int[][] newGen = new int[N][L];
	static double[][] amp = new double[N][2];

	public static void main(String args[]) {
		populate();
		//selection();
	}

	public static void populate() {
		System.out.println("Poblacion inicial: ");
		double total=0;
		double prom=0;

		for(int i=0; i<N; i++) {
			int dec = 0;
			System.out.print(i+1 + ": ");
			for(int x=0; x<L; x++) {
				pop[i][x] = (int)(Math.random() * 2);
				dec += pop[i][x] * (Math.pow(2,L-(x+1)));
				System.out.print(pop[i][x]);
			}
			amp[i][0] = Math.sqrt(Math.pow(dec,3));
			System.out.print("      Dec:" + dec);
			System.out.println("      Apt:" + amp[i][0]);
			total += amp[i][0];
		}

		prom = total/N;
		System.out.println(" ");
		System.out.println("Aptitud normalizada: ");

		for(int i=0; i<N; i++) {
			amp[i][1] = amp[i][0]/prom;
			System.out.print(i+1 + ": ");
			System.out.println(amp[i][1]);
		}

		System.out.println(" ");
	}

	public static void selection() {
		double rand = 0;
		
		for(int i=0; i<N; i++) {
			rand = Math.random() * N;
			for(int x=0; x<N; x++) {
				
			}
		}
		
	}
}