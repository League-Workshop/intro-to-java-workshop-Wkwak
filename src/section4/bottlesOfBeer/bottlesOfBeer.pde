for (int i = 99; i>0; i--) {
  for (int b = 0; b<3; b++) {
    print(i + " bottles of beer");
    
    if (b==0 || b ==2) {
      print(" on the wall.");
    }
    if (b==1){
      print("Take one down and pass it around");
    }
  }
  println();
}