class OutputNumbers {
  public static void main(String[] args) {
    for (int i = 0; i <= 100; i++){
      if(i % 3 == 0) {
        System.out.print("3*" + i/3 + "\n");
      } else {
          System.out.print(i + " ");
      }    
    }
  }
}
