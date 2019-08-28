// Media.java

public class Media {
double media;
/**
* 
* @param datalist
*/
public double getMedia(String[] datalist, int n) {
	
	media = 0;
	
	for (int i = 0; i < n; i++)
		
		media += Double.parseDouble(datalist[i]);

	return media/n;

	}
}