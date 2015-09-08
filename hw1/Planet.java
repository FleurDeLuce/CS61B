import java.lang.Math.*;
<<<<<<< HEAD
=======
import StdDraw;
>>>>>>> dbae847ef78a2e9d00f1b15c34cca5acdb9ac90e

public class Planet {
	public double x;
	public double y;
	public double xVelocity;
	public double yVelocity;
	public double mass;
	public String img;
	public double xNetForce;
	public double yNetForce;
<<<<<<< HEAD
	public double xAccel;
	public double yAccel;
=======
	public double xAcceleration;
	public double yAcceleration;
>>>>>>> dbae847ef78a2e9d00f1b15c34cca5acdb9ac90e

	public Planet(double x, double y, double xVelocity, 
				  double yVelocity, double mass, String img) {
		this.x = x;
		this.y = y;
		this.xVelocity = xVelocity;
		this.yVelocity = yVelocity;
		this.mass = mass;
		this.img = img;
	}

	public double calcDistance(Planet p) {
		return Math.sqrt((this.x - p.x) * (this.x - p.x) + (this.y - p.y) * (this.y - p.y));
	}
	
	public double calcPairwiseForce(Planet p) {
		//double G = 6.67 * Math.pow(10, -11); 
		double G = 6.67E-11;
		double r =  this.calcDistance(p);
		return G * this.mass * p.mass/ (r * r);
	}
	

	public double calcPairwiseForceX(Planet p) {
		double F = this.calcPairwiseForce(p);
		double r =  this.calcDistance(p);
		return F * (p.x - this.x) / r;
	}

	public double calcPairwiseForceY(Planet p) {
		double F = this.calcPairwiseForce(p);
		double r =  this.calcDistance(p);
		return F * (p.y - this.y) / r;
	}

	public void setNetForce(Planet[] planets) {
		double netForceXSum = 0;
		double netForceYSum = 0;
		for (Planet p : planets) {
			if (!p.equals(this)) {
				netForceXSum += this.calcPairwiseForceX(p);
				netForceYSum += this.calcPairwiseForceY(p);
			}
		}
		this.xNetForce = netForceXSum;
		this.yNetForce = netForceYSum;
	}

	public void draw() {
		/*
		double r = 0.5;
		circle(this.x, this.y, r);
		filledCircle(this.x, this.y, r);
		*/
		StdDraw.picture(this.x, this.y, "images/" + img);
	}

	public void update(double dt) {
		//this.setNetForce(planets);
<<<<<<< HEAD
		this.xAccel = xNetForce / this.mass;
		this.yAccel = yNetForce / this.mass;
		this.xVelocity += dt * xAccel;
		this.yVelocity += dt * yAccel;
=======
		this.xAcceleration = xNetForce / this.mass;
		this.yAcceleration = yNetForce / this.mass;
		this.xVelocity += dt * xAcceleration;
		this.yVelocity += dt * yAcceleration;
>>>>>>> dbae847ef78a2e9d00f1b15c34cca5acdb9ac90e
		this.x += dt*xVelocity;
		this.y += dt*yVelocity;
	}
}