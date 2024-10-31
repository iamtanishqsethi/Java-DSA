public class KarpRabin {
    //rolling hash
    private final int PRIME=101;//can take any prime
    private double calculateHash(String str){
        double hash=0;
        for(int i=0;i<str.length();i++){
            hash=hash+str.charAt(i)*Math.pow(PRIME,i);//this will return the hash value
        }
        return hash;
    }
    private double updateHash(double prevHash,char oldChar,char newChar,int patternLength){
        double newHash=(prevHash-oldChar)/PRIME;
        newHash= newHash+newChar*Math.pow(PRIME,patternLength-1);
        return newHash;
    }
    public void search(String text,String pattern){
        int patternLen=pattern.length();
        double patternHash=calculateHash(pattern);
        double textHash=calculateHash(text.substring(0,patternLen));//calculating initial hash value for the first substring
        for(int i=0;i<=text.length()-patternLen;i++){//THIS IS SIMILAR TO SLIDING WINDOW
            //as we are taking windows, the max 'i' I can go is till the text len - pattern len
            if(textHash==patternHash){
                if(text.substring(i,i+patternLen).equals(pattern)){
                    //if the hash is equal & the substrings are equal
                    System.out.println("Pattern found at index:"+i);
                    break;
                }
            }//not found ? , move forward
            if(i<text.length()-patternLen){
                textHash=updateHash(textHash,text.charAt(i),text.charAt(i+patternLen),patternLen);
            }
        }
    }
}
