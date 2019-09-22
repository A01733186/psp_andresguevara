public class Logic2{
  private int n = 0;
	private String data;
	private String[] arrData;
  private int lines = 0;
  private int methods = 0;

  public void logic2a() {

		Input myInput = new Input();
		Output myOut = new Output();
		Data myData = new Data();
    LineCounter myLines = new LineCounter();
    MethodCounter myMethods = new MethodCounter();

		data = myInput.readData("input1.txt");
		arrData = myData.saveData(data);
    lines = myLines.countLines(arrData);
    methods = myMethods.countMethods(arrData);

		myOut.writeData("out1.txt", "Lines of code = " + lines + "\nMethods = " + methods);
	}
}
