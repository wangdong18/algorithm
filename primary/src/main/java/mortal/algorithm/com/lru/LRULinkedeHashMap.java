package mortal.algorithm.com.lru;

import java.util.LinkedHashMap;

/**
 * @Author: mortal
 * @Date: 2022/3/7 21:41
 */
public class LRULinkedeHashMap<K,V> extends LinkedHashMap<K,V> {
    private  int capacity;
    LRULinkedeHashMap(int capacity){
        super(capacity,0.75f,true);
        this.capacity = capacity;
    }


}
