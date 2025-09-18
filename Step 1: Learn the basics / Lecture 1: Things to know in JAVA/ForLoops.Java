public class Main{
  public static void main(String[] args){
  int i = 0;
  for(i=0; i<5; i++){
    System.out.println("the loop is running for "+ i + "th time");
  }
  }
}

// nested for loops

public class Main{
  public static void main(String[] args){
  int i = 0;
  int j = 0;

  for(i=0; i<5; i++){
    for (j=0;j<3;j++){
    System.out.println("the loop is running for i = "+ i + "th time because of j = "+ j);
  }
  }
  }
}

// for each loops

String[] cars = {"aditya", "ashok", "pise"};
  for(String car: cars){
          //exp
}
