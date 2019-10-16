import java.lang.Math;

public class EstimacionCorLineal {

    public double getEstimacion(String[] datalistX, String[] datalistY) {
        double sumX = getSumX(datalistX);
        double sumY = getSumY(datalistY);
        double sumXX = getSumXX(datalistX);
        double sumXY = getSumXY(datalistX, datalistY);
        double sumYY = getSumYY(datalistY);
        double avgX = getAvg(datalistX);
        double avgY = getAvg(datalistY);
        double B1 = getB1(sumXY, avgX, avgY, sumXX);
        double rXY = getrXY(sumXY, sumX, sumY, sumXX, sumYY);
        double rr = getRR(rXY);
        double B0 = getB0(B1, avgX, avgY);
        double xK = 386;
        double yK = getyK(B0, B1, xK);
        /* Testing
        System.out.println(sumX);
        System.out.println(sumY);
        System.out.println(sumXX);
        System.out.println(sumXY);
        System.out.println(sumYY);
        System.out.println(avgX);
        System.out.println(avgY);
        System.out.println(B1);
        System.out.println(rXY);
        System.out.println(rr);
        System.out.println(B0);
        System.out.println(xK);
        System.out.println(yK);
        */
        return yK;
    }

    public double getSumX(String[] datalist) {
        double sum = 0;
        for(int i = 0; i < datalist.length; i++) {
            sum += Double.parseDouble(datalist[i]);
        }
        return sum;
    }

    public double getSumY(String[] datalist) {
        double sum = 0;
        for(int i = 0; i < datalist.length; i++) {
            sum += Double.parseDouble(datalist[i]);
        }
        return sum;
    }

    public double getSumXY(String[] datalistX, String[] datalistY) {
        double sum = 0;
        for(int i = 0; i < datalistX.length; i++) {
            sum += (Double.parseDouble(datalistX[i])*Double.parseDouble(datalistY[i]));
        }
        return sum;
    }

    public double getSumXX(String[] datalist) {
        double sum = 0;
        for(int i = 0; i < datalist.length; i++) {
            sum += (Double.parseDouble(datalist[i])*Double.parseDouble(datalist[i]));
        }
        return sum;
    }

    public double getSumYY(String[] datalist) {
        double sum = 0;
        for(int i = 0; i < datalist.length; i++) {
            sum += (Double.parseDouble(datalist[i])*Double.parseDouble(datalist[i]));
        }
        return sum;
    }

    public double getAvg(String[] datalist) {
        double avg = 0;
        for(int i = 0; i < datalist.length; i++) {
            avg += Double.parseDouble(datalist[i]);
        }
        avg /= datalist.length;
        return avg;
    }

    public double getB1(double sumXY, double AvgX, double AvgY, double sumXX) {
        double n = 0;
        double d = 0;
        n = sumXY - 10*AvgX*AvgY;
        d = sumXX - 10*AvgX*AvgX;
        double result = n/d;
        return result;
    }

    public double getrXY(double sumXY, double sumX, double sumY, double sumXX, double sumYY) {
        double n = 0;
        double d = 0;
        n = 10*sumXY - sumX*sumY;
        d = Math.sqrt((10*sumXX - sumX*sumX) * (10*sumYY - sumY*sumY));
        double result = n/d;
        return result;
    }

    public double getRR(double rXY) {
        double result = rXY*rXY;
        return result;
    }

    public double getB0(double B1, double avgX, double avgY) {
        double result = avgY - B1*avgX;
        return result;
    }

    public double getyK(double B0, double B1, double xK) {
        double result = B0 + B1*xK;
        return result;
    }
}
