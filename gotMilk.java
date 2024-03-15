public boolean gotMilk(int i, String[] strings) {
  if(strings.length == 0){
    return false;
  } else if(strings[i].equals("milk")){
    return true;
  } else if(i != strings.length-1){
    return gotMilk(i+1, strings);
  } else {return false;}
}
