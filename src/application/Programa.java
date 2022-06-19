package application;

import java.util.Locale;

import entities.Calculos;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Calculos cal = new Calculos();

		System.out.println("Solução analítica:");
		System.out.println("t(s) IL(A)");
		for (double t = 0.0; t < 1; t+=0.1) {
			cal.IL = cal.V/cal.R * (1 - Math.exp(-cal.R*t/cal.L));
			System.out.printf("%.1f", t);
			System.out.print("  ");
			System.out.printf("%.2f", cal.IL);
			System.out.println();
		}
		
			System.out.println();
//Solução numérica de Euler:
			System.out.println("Solução numérica (Euler):");
			System.out.println("t(s) IL(A)");
			
			System.out.printf("%.1f", cal.t0);
			System.out.print("  ");
			System.out.printf("%.2f", cal.q0);
			System.out.println();
			
			System.out.printf("%.1f", cal.t1);
			System.out.print("  ");
			System.out.printf("%.2f", cal.q1);
			System.out.println();
			
			System.out.printf("%.1f", cal.t2);
			System.out.print("  ");
			System.out.printf("%.2f", cal.q2);
			System.out.println();
			
			System.out.printf("%.1f", cal.t3);
			System.out.print("  ");
			System.out.printf("%.2f", cal.q3);
			System.out.println();
			
			System.out.printf("%.1f", cal.t4);
			System.out.print("  ");
			System.out.printf("%.2f", cal.q4);
			System.out.println();
			
			System.out.printf("%.1f", cal.t5);
			System.out.print("  ");
			System.out.printf("%.2f", cal.q5);
			System.out.println();
			
			System.out.printf("%.1f", cal.t6);
			System.out.print("  ");
			System.out.printf("%.2f", cal.q6);
			System.out.println();
			
			System.out.printf("%.1f", cal.t7);
			System.out.print("  ");
			System.out.printf("%.2f", cal.q7);
			System.out.println();
			
			System.out.printf("%.1f", cal.t8);
			System.out.print("  ");
			System.out.printf("%.2f", cal.q8);
			System.out.println();
			
			System.out.printf("%.1f", cal.t9);
			System.out.print("  ");
			System.out.printf("%.2f", cal.q9);
			System.out.println();
			
			System.out.printf("%.1f", cal.t10);
			System.out.print("  ");
			System.out.printf("%.2f", cal.q10);
			System.out.println();
			
			System.out.println();
			
//Solução numérica de Runge-Kutta: 
			System.out.println("Solução numérica (Runge-Kutta):");
			System.out.println("t(s) IL(A)");
			System.out.printf("%.1f", cal.t0);
			System.out.print("  ");
			System.out.printf("%.2f", cal.rk0);
			System.out.println();
			
			System.out.printf("%.1f", cal.t1);
			System.out.print("  ");
			System.out.printf("%.2f", cal.rk1);
			System.out.println();
			
			System.out.printf("%.1f", cal.t2);
			System.out.print("  ");
			System.out.printf("%.2f", cal.rk2);
			System.out.println();
			
			System.out.printf("%.1f", cal.t3);
			System.out.print("  ");
			System.out.printf("%.2f", cal.rk3);
			System.out.println();
			
			System.out.printf("%.1f", cal.t4);
			System.out.print("  ");
			System.out.printf("%.2f", cal.rk4);
			System.out.println();
			
			System.out.printf("%.1f", cal.t5);
			System.out.print("  ");
			System.out.printf("%.2f", cal.rk5);
			System.out.println();
			
			System.out.printf("%.1f", cal.t6);
			System.out.print("  ");
			System.out.printf("%.2f", cal.rk6);
			System.out.println();
			
			System.out.printf("%.1f", cal.t7);
			System.out.print("  ");
			System.out.printf("%.2f", cal.rk7);
			System.out.println();
			
			System.out.printf("%.1f", cal.t8);
			System.out.print("  ");
			System.out.printf("%.2f", cal.rk8);
			System.out.println();
			
			System.out.printf("%.1f", cal.t9);
			System.out.print("  ");
			System.out.printf("%.2f", cal.rk9);
			System.out.println();
			
			System.out.printf("%.1f", cal.t10);
			System.out.print("  ");
			System.out.printf("%.2f", cal.rk10);
			System.out.println();
	}
}