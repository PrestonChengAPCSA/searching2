public int scoresSpecial(int[] a, int[] b) {
  return findLargestScoreA(a) + findLargestScoreB(b);
}

public int findLargestScoreA(int[] a){
  int largestInA = 0;
  for(int i = 0; i < a.length; i++){
    if(a[i] % 10 == 0 && a[i] > largestInA){
      largestInA = a[i];
    }
  }
  return largestInA;
}

public int findLargestScoreB(int[] b){
  int largestInB = 0;
  for(int i = 0; i < b.length; i++){
    if(b[i] % 10 == 0 && b[i] > largestInB){
      largestInB = b[i];
    }
  }
  return largestInB;
}
