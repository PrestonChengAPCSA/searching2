public boolean gotMilkList(int i, ArrayList <String> strings) {
  if(strings.size() == 0){
    return false;
  } else if(strings.get(i).equals("milk")){
    return true;
  } else if(i != strings.size()-1){
    return gotMilkList(i+1, strings);
  } else {return false;}
}
