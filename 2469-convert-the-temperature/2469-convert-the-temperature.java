class Solution
{
    public double[] convertTemperature(double celsius) 
    {
        return new double[] {celsius + 273.15,(celsius * 1.80) + 32.00};
          
    }
}



/**class Solution {
    public double[] convertTemperature(double celsius) {
     
        double temp [] = {celsius + 273.15,(celsius * 1.80) + 32.00};
          
        return temp;
    }
}**/





/**class Solution {
    public double[] convertTemperature(double celsius) {
     double kelvin = celsius + 273.15;
        double fahrenheit = (celsius * 1.80) + 32.00;
        double temp [] = {kelvin , fahrenheit};
          
        return temp;
    }
}**/