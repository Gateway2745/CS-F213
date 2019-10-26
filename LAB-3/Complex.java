package lab3;

public class Complex {
	double realPart;
	double imaginaryPart;
	
	public Complex() {
		realPart = 0.0;
		imaginaryPart = 0.0;
	}

	public Complex(double realPart, double imaginaryPart) {
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}
	
	public Complex(Double ...c) {
		this.realPart = c[0];
		this.imaginaryPart = c[1];
	}
	
	public Complex add(Complex otherNumber) {
		return new Complex(this.realPart + otherNumber.realPart, this.imaginaryPart + otherNumber.imaginaryPart );
	}
	
	public Complex subtract(Complex otherNumber) {
		return new Complex(this.realPart - otherNumber.realPart, this.imaginaryPart - otherNumber.imaginaryPart );
	}
	
	public Complex multiply(Complex otherNumber) {
		return new Complex(this.realPart * otherNumber.realPart, this.imaginaryPart * otherNumber.imaginaryPart );
	}
	
	public Complex divide(Complex otherNumber) {
		return new Complex(this.realPart / otherNumber.realPart, this.imaginaryPart * otherNumber.imaginaryPart );
	}
	
}
