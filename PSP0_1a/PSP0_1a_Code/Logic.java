// Logic.java

public class Logic {

	private int n = 0;
	private String data;
	private String[] arrData;
	private double media;
	private double desv;

	public void logic1a() {

		Input myInput = new Input();
		output myOut = new output();
		Data myData = new Data();
		Media myMedia = new Media();
		DesviacionStd myDesv = new DesviacionStd();

		data = myInput.readData("set2.txt");
		arrData = myData.saveData(data);
		n = arrData.length;
		media = myMedia.getMedia(arrData, n);
		desv = myDesv.getDesvStd(arrData, media, n);

		myOut.writeData("out1.txt", "Media = " + media + " Desv. = " + desv);
	}
}
