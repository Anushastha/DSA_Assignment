package OtherQues;//The cache method known as Least Frequently Used, or simply LFU, controls computer memory.
//When the cache is filled and more memory is required, it accomplishes this by counting how
//often a block is referenced in the memory and deleting the block with the lowest frequency.

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Que4a<K, V> {

    private final Map<K, V> cache;     // map to store key-value pairs
    private final Map<K, Integer> freq;     // map to store frequency of each key
    private final Map<Integer, LinkedHashSet<K>> freqKeys;    // map to store a set of keys for each frequency value
    private final int capacity;     // maximum number of elements the cache can hold
    private int minFreq;     // the minimum frequency of any key in the cache

    public Que4a(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>();
        freq = new HashMap<>();
        freqKeys = new HashMap<>();
        minFreq = 0;
    }

    public synchronized void add(K key, V value) {
        if (cache.size() >= capacity) {
            evict();
        }
        cache.put(key, value);
        freq.put(key, 1);
        freqKeys.computeIfAbsent(1, k -> new LinkedHashSet<>()).add(key);
        minFreq = 1;
    }

    public synchronized V get(K key) {
        if (!cache.containsKey(key)) {
            return null;
        }
        int curFreq = freq.get(key);
        freq.put(key, curFreq + 1);
        freqKeys.get(curFreq).remove(key);
        if (curFreq == minFreq && freqKeys.get(curFreq).isEmpty()) {
            minFreq++;
        }
        freqKeys.computeIfAbsent(curFreq + 1, k -> new LinkedHashSet<>()).add(key);
        return cache.get(key);
    }

    public synchronized void remove(K key) {
        if (!cache.containsKey(key)) {
            return;
        }
        int curFreq = freq.get(key);
        freq.remove(key);
        freqKeys.get(curFreq).remove(key);
        cache.remove(key);
        if (curFreq == minFreq && freqKeys.get(curFreq).isEmpty()) {
            minFreq++;
        }
    }

    private void evict() {
        Set<K> evictKeys = freqKeys.get(minFreq);
        K evictKey = evictKeys.iterator().next();
        evictKeys.remove(evictKey);
        cache.remove(evictKey);
        freq.remove(evictKey);
    }

}