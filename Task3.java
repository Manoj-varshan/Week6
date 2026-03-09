static String twoStrings(String s1, String s2) {
    for(int i = 0; i < s1.length(); i++){
        if(s2.contains("" + s1.charAt(i))){
            return "YES";
        }
    }
    return "NO";
}