public int scoresAverage(int[] scores) {
  int firsthalf = average(scores,0,scores.length/2);
  int secondhalf =average(scores, scores.length/2, scores.length);
  if(firsthalf < secondhalf){ 
    return secondhalf;
  } else {
    return firsthalf;
  }

}

public int average(int[]scores, int start, int end){
  int total = 0;
  int finalNum = 0;
  for(int i = start; i < end; i ++){
    total = total + scores[i];  
  }
  if(end-start != 0){
      finalNum = total/(end-start);
  }

  return finalNum;
}
