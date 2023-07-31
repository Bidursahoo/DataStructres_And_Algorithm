class HellloWorld {
    public int minMaxDifference(int num) {
        String firstString= num+"";
        String scondString=num+"";
        char c=firstString.charAt(0),ch=firstString.charAt(0);
        for(int i=0; i<firstString.length(); i++){
            if(firstString.charAt(i)!='9'){
                c=firstString.charAt(i);
                break;
            }
        }
        for(int i=0; i<firstString.length(); i++){
            if(firstString.charAt(i)==c) firstString=firstString.substring(0,i)+"9"+firstString.substring(i+1, firstString.length());
        }
        for(int i=0; i<firstString.length(); i++){
            if(scondString.charAt(i)==ch) scondString=scondString.substring(0,i)+"0"+scondString.substring(i+1, firstString.length());
        }
        int mx=Integer.parseInt(firstString),mn=Integer.parseInt(scondString);
        return mx-mn;

    }
}