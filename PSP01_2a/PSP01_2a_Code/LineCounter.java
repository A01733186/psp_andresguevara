import org.apache.commons.lang3.StringUtils;

public class LineCounter {

  public int countLines(String[] arrData) {
    int c = arrData.length;
    for(int i = 0; i < arrData.length; i++) {
      if(arrData[i].contains("//") || StringUtils.isBlank(arrData[i]) == true) {
        c--;
      }
    }
    return c;
  }

}
