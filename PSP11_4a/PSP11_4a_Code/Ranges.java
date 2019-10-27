import java.lang.Math;

public class Ranges {

    public double[] computeRanges(String[] dataX, String[] dataY) {
        double[] Xi = computeXi(dataX, dataY);
        double[] LnXi = computeLnXi(Xi);
        double AvgXi = computeAvgXi(Xi);
        double AvgLnXi = computeAvgLnXi(LnXi);
        double[] LnXi2 = computeLnXi2(LnXi, AvgLnXi);
        double Var = computeVar(LnXi2, AvgLnXi);
        double StdDev = computeStdDev(Var);
        double VS = computeVS(AvgLnXi, StdDev);
        double S = computeS(AvgLnXi, StdDev);
        double M = computeM(AvgLnXi);
        double L = computeL(AvgLnXi, StdDev);
        double VL = computeVL(AvgLnXi, StdDev);

        double[] ranges = {VS, S, M, L, VL};
        return ranges;
    }

    public double[] computeXi(String[] dataX, String[] dataY) {
        double[] result = new double[dataX.length];
        for(int i = 0; i < dataX.length; i++) {
            result[i] = Double.parseDouble(dataX[i]) / Double.parseDouble(dataY[i]);
        }
        return result;
    }

    public double[] computeLnXi(double[] dataXi) {
      double[] result = new double[dataXi.length];
      for(int i = 0; i < dataXi.length; i++) {
        result[i] = Math.log(dataXi[i]);
      }
      return result;
    }

    public double computeAvgXi(double[] dataXi) {
        double result = 0;
        for(int i = 0; i < dataXi.length; i++) {
            result += dataXi[i];
        }
        result /= dataXi.length;
        return result;
    }


    public double computeAvgLnXi(double[] dataLnXi) {
        double result = 0;
        for(int i = 0; i < dataLnXi.length; i++) {
            result += dataLnXi[i];
        }
        result /= dataLnXi.length;
        return result;
    }

    public double[] computeLnXi2(double[] dataLnXi, double AvgLnXi) {
        double[] result = new double[dataLnXi.length];
        for(int i = 0; i < dataLnXi.length; i++) {
          result[i] = Math.pow(dataLnXi[i] - AvgLnXi, 2);
        }
        return result;
    }

    public double computeVar(double[] dataLnXi2, double AvgLnXi) {
        double result = 0;
        for(int i = 0; i < dataLnXi2.length; i++) {
            result += dataLnXi2[i];
        }
        result /= (dataLnXi2.length - 1);
        return result;
    }

    public double computeStdDev(double Var) {
        double result = 0;
        result = Math.sqrt(Var);
        return result;
    }

    public double computeVS(double AvgLnXi, double StdDev) {
        double result = 0;
        double partial = AvgLnXi - 2*StdDev;
        result = Math.exp((partial));
        return result;
    }

    public double computeS(double AvgLnXi, double StdDev) {
        double result = 0;
        double partial = AvgLnXi - StdDev;
        result = Math.exp((partial));
        return result;
    }

    public double computeM(double AvgLnXi) {
        double result = 0;
        double partial = AvgLnXi;
        result = Math.exp((partial));
        return result;
    }

    public double computeL(double AvgLnXi, double StdDev) {
        double result = 0;
        double partial = AvgLnXi + StdDev;
        result = Math.exp((partial));
        return result;
    }

    public double computeVL(double AvgLnXi, double StdDev) {
        double result;
        double partial = AvgLnXi + 2*StdDev;
        result = Math.exp((partial));
        return result;
    }
}
