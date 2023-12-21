public class search_in_string {
    static boolean search(String str,char target){
        if(str.length()==0){
            return false;
        }//<string>.toCharArray() converts string to array of characters
        for(char ch:str.toCharArray() ){
            if(ch==target){
                return true;
            }
        }return false;
    }
}
