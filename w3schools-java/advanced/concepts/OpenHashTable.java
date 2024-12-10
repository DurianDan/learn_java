package concepts;

import java.util.Arrays;

// `Open Hash Table` are a type of Hash Table.
// Upon collision, the new data is stored in the next index of array.
// `Close Hash Table` use specific data structure to resolve collison (like linked list) 
public class OpenHashTable {
    static class Entry {
        byte[] key;
        short min;
        short max;
        long sum = 0;
        long count = 0;
        int hash;

        void merge(OpenHashTable.Entry other) {
            min = (short) Math.min(min, other.min);
            max = (short) Math.max(max, other.max);
            sum += other.sum;
            count += other.count;
        }
    }

    static final int bits = 14;
    // bitwise operation
    static final int tableSize = 1 << bits; // 16k
    static final int mask = tableSize - 1;
    final Entry[] entries = new Entry[tableSize];

    void add(byte[] buf, int sLen, short val, int hash) {
        int idx = hash & mask;

        while (true) {
            Entry entry = entries[idx];

            // key not present, so add it
            if (entry == null) {
                entry = entries[idx] = new Entry();
                entry.key = Arrays.copyOf(buf, sLen);
                entry.min = entry.max = val;
                entry.sum += val;
                entry.count++;
                entry.hash = hash;
                break;
            } else {
                if (
                    entry.hash == hash
                    && entry.key.length == sLen
                    && Arrays.equals(
                        entry.key,
                        0,
                        sLen,
                        buf,
                        0,
                        sLen)
                ){
                    entry.min = (short) Math.min(entry.min, val);
                    entry.max = (short) Math.max(entry.max, val);
                    entry.sum += val;
                    entry.count++;
                    break;
                } else {
                    idx = (idx + 1) & mask;
                }
            }
        }
    }
}