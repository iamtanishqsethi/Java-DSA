import javax.swing.text.html.parser.Entity;

public class CustomHashMap {
    private Entity[] entities;
    public CustomHashMap(){
        entities= new Entity[100];
    }
    public void put(String key, String value){
        int hash= Math.abs(key.hashCode()%entities.length);
        entities[hash]= new Entity(key,value);//over-riding
    }
    public String get(String key){
        int hash=Math.abs(key.hashCode()%entities.length);
        if(entities[hash]!=null && entities[hash].key.equals(key)){
            return entities[hash].value;
        }
        return null;
    }
    public void remove(String key){
        int hash=Math.abs(key.hashCode()%entities.length);
        if(entities[hash]!=null && entities[hash].key.equals(key)){
            entities[hash]=null;
        }
    }
    private class Entity{
        String key;
        String value;
        public Entity(String  key,String value){
            this.key=key;
            this.value=value;
        }
    }
}
