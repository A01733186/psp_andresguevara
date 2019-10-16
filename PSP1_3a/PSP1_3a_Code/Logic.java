// Logic.java

public class Logic {

		private int n = 0;
		private String data1;
		private String data2;
		private String[] arrData1;
		private String[] arrData2;
		private double corLineal;

		public void logic1a() {

				Input myInput = new Input();
				Output myOut = new Output();
				Data myData = new Data();
				EstimacionCorLineal Estimacion = new EstimacionCorLineal();

				data1 = myInput.readData("set2.txt");
				data2 = myInput.readData("set4.txt");
				arrData1 = myData.saveData(data1);
				arrData2 = myData.saveData(data2);
				corLineal = Estimacion.getEstimacion(arrData1, arrData2);

				myOut.writeData("out4.txt", "Correlacion lineal = " + corLineal);
		}
}
