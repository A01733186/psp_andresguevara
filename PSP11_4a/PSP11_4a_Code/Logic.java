// Logic.java

public class Logic {

		private int n = 0;
		private String data1;
		private String data2;
		private String[] arrData1;
		private String[] arrData2;
		private double[] ranges;

		public void logic1a() {

				Input myInput = new Input();
				Output myOut = new Output();
				Data myData = new Data();
				Ranges RSR = new Ranges();

				data1 = myInput.readData("set1.txt");
				data2 = myInput.readData("set2.txt");
				arrData1 = myData.saveData(data1);
				arrData2 = myData.saveData(data2);
				double[] ranges = RSR.computeRanges(arrData1, arrData2);

				myOut.writeData("out1.txt", "Relative Size Ranges = " + "\n" + printArray(ranges));
		}

		public static String printArray(double[] array) {
				String result = "";
				for(int i = 0; i < array.length; i++) {
						result += "\n" + array[i];
				}
				return result;
		}

}
