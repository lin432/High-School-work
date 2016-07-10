package classes;

public class LinearFunction implements LinearFunctionMethods {
	
	private double slope, yintc;
	
	public LinearFunction(double slope,double yintc)
	{
		this.slope = slope;
		this.yintc = yintc;
	}//saves variables in method

	@Override
	public double getSlope() {
		return slope;
	}//returns slope

	@Override
	public double getYintercept() {
		return yintc;
	}//returns y intercept

	@Override
	public double getRoot() {
		double y = 0;
		//set y as zero
		double x = (y-yintc)/slope;
		//puts it through equation
		return x;
	}

	@Override
	public double getYvalue(double x) {
		double y = slope*x+yintc;
		//runs equation and returns
		return y;
	}

	@Override
	public double getXvalue(double y) {
		double x = (y-yintc)/slope;
		//runs through equation and returns
		return x;
	}
	
	

}
