// DesviacionStd.java

public class DesviacionStd {
/**
* 
* @param datalist
* @param media
*/

public double getDesvStd(String[] datalist, double media, double n) {
// TODO - implement DesviacionStd.getDesvStd
//throw new UnsupportedOperationException();

	double desvStd = 0;
	
	for (int i = 0; i < n; i++)
		desvStd += Math.pow(Double.parseDouble(datalist[i]) - media, 2);
	
	desvStd /= (n - 1);

	desvStd = Math.sqrt(desvStd);
		
	return desvStd;

	}
}