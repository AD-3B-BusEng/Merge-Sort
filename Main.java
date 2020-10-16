class Main {
  public static void main(String[] args) {
    int[] anArray = {7,5,11,2,16,4,18,28,12,30};
    System.out.println("Array voor sorteren:");
    for(int i = 0; i < anArray.length; i++){
      System.out.print(anArray[i] + " ");
    }
    System.out.println();
    
    MergeSort.sort(anArray);
    
    System.out.println("Array na sorteren:");
    for(int i = 0; i < anArray.length; i++){
      System.out.print(anArray[i] + " ");
    }
    
  }
}