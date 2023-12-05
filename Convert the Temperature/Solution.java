class Solution {
    public double[] convertTemperature(double celsius) {
        double ans[];
        double kelvin;
        double fahrenheit;

        kelvin = celsius + 273.15;
        fahrenheit = celsius * 1.80 + 32.00;

        ans = new double[] {kelvin, fahrenheit};

        return ans;
    }
}