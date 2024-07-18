public class RandomString {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }
    static String generate(int size){
        StringBuffer buffer =new StringBuffer();
        for(int i=0;i<size;i++){
            //to convert first random ascii value to char
            //then to string
            buffer.append(Character.toString((char)(getRandom())));
        }
        return buffer.toString();
    }
    //get random char ; lowercase
    static int getRandom(){
        return (int)Math.floor(Math.random()*26+97);
    }
}
