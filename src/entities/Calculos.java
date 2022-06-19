package entities;

public class Calculos {

	public double V = 12.0;
	public double R = 2.0;
	public double L = 1.0;
	public double IL = 0.0;
	public double q0 = 0.0;
	public double rk0 = 0.0;
	
	public double t0 = 0.0;
	public double t1 = 0.1;
	public double t2 = 0.2;
	public double t3 = 0.3;
	public double t4 = 0.4;
	public double t5 = 0.5;
	public double t6 = 0.6;
	public double t7 = 0.7;
	public double t8 = 0.8;
	public double t9 = 0.9;
	public double t10 = 1.0;

//Fórmulas para a solução numérica de Euler:	
	public double q1 = q0 + ((V-R*q0)/L) * (t1-t0);
	public double q2 = q1 + ((V-R*q1)/L) * (t2-t1);
	public double q3 = q2 + ((V-R*q2)/L) * (t3-t2);
	public double q4 = q3 + ((V-R*q3)/L) * (t4-t3);
	public double q5 = q4 + ((V-R*q4)/L) * (t5-t4);
	public double q6 = q5 + ((V-R*q5)/L) * (t6-t5);
	public double q7 = q6 + ((V-R*q6)/L) * (t7-t6);
	public double q8 = q7 + ((V-R*q7)/L) * (t8-t7);
	public double q9 = q8 + ((V-R*q8)/L) * (t9-t8);
	public double q10 = q9 + ((V-R*q9)/L) * (t10-t9);
	
//Fórmulas para a solução numérica de Runge-Kutta:
	public double rk1 = rk0 + (((1/6)*(((V - (R * rk0) / L)) + 4 * ((V - (R * rk0) + (t1-t0)) / 2)) / L) + ((V - (R * rk0) + (t1-t0)) / L)) * (t1-t0);
	public double rk2 = rk1 + (((1/6)*(((V - (R * rk1) / L)) + 4 * ((V - (R * rk1) + (t2-t1)) / 2)) / L) + ((V - (R * rk1) + (t2-t1)) / L)) * (t2-t1);
	public double rk3 = rk2 + (((1/6)*(((V - (R * rk2) / L)) + 4 * ((V - (R * rk2) + (t3-t2)) / 2)) / L) + ((V - (R * rk2) + (t3-t2)) / L)) * (t3-t2);
	public double rk4 = rk3 + (((1/6)*(((V - (R * rk3) / L)) + 4 * ((V - (R * rk3) + (t4-t3)) / 2)) / L) + ((V - (R * rk3) + (t4-t3)) / L)) * (t4-t3);
	public double rk5 = rk4 + (((1/6)*(((V - (R * rk4) / L)) + 4 * ((V - (R * rk4) + (t5-t4)) / 2)) / L) + ((V - (R * rk4) + (t5-t4)) / L)) * (t5-t4);
	public double rk6 = rk5 + (((1/6)*(((V - (R * rk5) / L)) + 4 * ((V - (R * rk5) + (t6-t5)) / 2)) / L) + ((V - (R * rk5) + (t6-t5)) / L)) * (t6-t5);
	public double rk7 = rk6 + (((1/6)*(((V - (R * rk6) / L)) + 4 * ((V - (R * rk6) + (t7-t6)) / 2)) / L) + ((V - (R * rk6) + (t7-t6)) / L)) * (t7-t6);
	public double rk8 = rk7 + (((1/6)*(((V - (R * rk7) / L)) + 4 * ((V - (R * rk7) + (t8-t7)) / 2)) / L) + ((V - (R * rk7) + (t8-t7)) / L)) * (t8-t7);
	public double rk9 = rk8 + (((1/6)*(((V - (R * rk8) / L)) + 4 * ((V - (R * rk8) + (t9-t8)) / 2)) / L) + ((V - (R * rk8) + (t9-t8)) / L)) * (t9-t8);
	public double rk10 = rk9 + (((1/6)*(((V - (R * rk9) / L)) + 4 * ((V - (R * rk9) + (t10-t9)) / 2)) / L) + ((V - (R * rk9) + (t10-t9)) / L)) * (t10-t9);
}