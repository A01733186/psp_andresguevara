public class MethodCounter {

  public int countMethods(String[] arrData) {
    int methods = 0;
      for(int i = 0; i < arrData.length; i++) {
        if(arrData[i].contains("(") && arrData[i].contains(")") && arrData[i].contains("{")) {
          if(arrData[i].contains("public") || arrData[i].contains("protected") || arrData[i].contains("private")) {
            methods++;
          }
        }
      }
      return methods;
  }
}
