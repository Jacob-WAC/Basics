import java.util.ArrayList;

public class Basics {
  //1
  public void printAll() {
    int num = 1;
    while (num < 256) {
      System.out.println(num);
      num++;
    }
  }
  
  //2
  public void printOdd() {
    int num = 1;
    while (num < 256) {
      if (num % 2 != 0){
        System.out.println(num);
      }
      num++;
    }
  }
  //3
  public int sigma() {
    int num = 1;
    for (int i = 2;i < 256;i++){
      num += i;
    }
    return num;
  }
  //4
  public void showArray(int[] arr) {
    for(int i = 0; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  //5
  public void findMax(int[] arr) {
    int greatest = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > greatest){
        greatest = arr[i];
      }
    }
    System.out.println(greatest);
  }
  //6
  public ArrayList<Integer> oddArr() {
    ArrayList<Integer> y = new ArrayList<Integer>();
    for (int i = 0; i < 256; i++) {
      if (i % 2 != 0){
        y.add(i);
      }
    }
    return y;
  }
  //7
  public void getAverage(int[] arr) {
    int sum = arr[0];
    for (int i = 1; i < arr.length; i++) {
      sum += arr[i];
      
    }
    int avg = sum / arr.length;
    System.out.println(avg);
  }
//8
  public int greaterThan(int[] arr, int y) {
    int numbersGreaterThan = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > y){
        numbersGreaterThan++;
      }
    }
    return numbersGreaterThan;
  }
//9
  public int[] square(int[] arr){
  for (int i = 0; i < arr.length; i++) {
    arr[i]= arr[i] * arr[i];
  }
  return arr;
  }
//10
public int[] noNegatives(int[] arr) {
  for (int i = 0; i < arr.length; i++) {
    if (arr[i] < 0){
      arr[i] = 0;
    }
  }
  return arr;
}
//11
public int[] mMa(int[] arr){
  int[] mMaArr = {arr[0],arr[0],0};
  int sum = 0;
  for (int i = 0; i < arr.length; i++) {
    if (arr[i] > mMaArr[0]){
      mMaArr[0] = arr[i];
    }
    if (arr[i] < mMaArr[1]){
      mMaArr[1] = arr[i];
    }
    sum += arr[i];
  }
  mMaArr[2] = sum / arr.length;
  return mMaArr;
}
//12
public int[] shiftArr(int[] arr){
  int first = arr[0];
  for (int i = 0; i < arr.length-1; i++) {
    arr[i] = arr[i + 1];
  }
  arr[arr.length-1] = first;

  return arr;
}




}

