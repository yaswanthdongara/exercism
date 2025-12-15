class ReverseString {

    String reverse(String inputString) {
        StringBuilder result = new StringBuilder();
        int l = inputString.length() - 1;
        char array[] = inputString.toCharArray();
        while(l >= 0){
            result.append(array[l]);
            l -= 1;
        }
    return result.toString();
    }
  
}
