public class Calc {
	double plus(double a, double b) {
		return a+b;
	}
	double minus(double a, double b) {
		return a-b;
	}
	double kobeitu(double a, double b) {
		return a*b;
	}
	double bolu(double a, double b) {
		return a/b;
	}
	double darezhe(double a, double b) {
		return Math.pow(a, b);
	}
	double birbolu(int a) {
		return 1/a;
	}
	double tubir(double a) {
		return Math.sqrt(a);
	}
	char Clear() {
		return ' ';
	}
	double PM(double a) {
		double b=a*(-1);
		return b;
	}
	double Pr(double a , double b) {
		return a*b/100;
	}	
}