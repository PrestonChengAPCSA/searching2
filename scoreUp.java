public int scoreUp(String[] key, String[] answers) {
  int totalScore = 0;
  
  for(int i = 0; i < key.length; i++){
    if(key[i] == answers[i]){
      totalScore = totalScore + 4;
    }  else if(key[i] != answers[i] && answers[i] != "?"){
      totalScore--;
    }
  }
      return totalScore;
}

