class Solution {
    public double[] convertTemperature(double celsius) {
     double kelvin = celsius + 273.15;
        double fahrenheit = (celsius * 1.80) + 32.00;
        double temp [] = new double [2];    
          temp [0] = kelvin;
        temp [1] = fahrenheit;
        return temp;
    }
}