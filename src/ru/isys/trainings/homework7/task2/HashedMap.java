package ru.isys.trainings.homework7.task2;

import ru.isys.trainings.homework7.task1.LinkList;

public class HashedMap<K, V> {

    private final static int INITIAL_CAPACITY = 16;

    private LinkList<MapItem<K, V>>[] buckets;
    private int capacity;

    public HashedMap() {
        this(INITIAL_CAPACITY);
    }

    public HashedMap(int capacity) {
        this.capacity = capacity;
        this.buckets = new LinkList[capacity];
    }

    public void put(K key, V value) {
        int index = calculateIndex(key);
        MapItem<K, V> node = new MapItem<>(key.hashCode(), key, value);
        if (buckets[index] == null) {
            LinkList<MapItem<K, V>> list = new LinkList<>();
            list.add(node);
            buckets[index] = list;
        } else {
            MapItem<K, V> nodeFoundByKey = findNodeByKey(key, buckets[index]);
            if (nodeFoundByKey == null) {
                buckets[index].add(node);
            } else {
                nodeFoundByKey.setValue(value);
            }
        }
    }

    public V get(K key) {
        int index = calculateIndex(key);
        MapItem<K, V> nodeFound = findNodeByKey(key, buckets[index]);
        if (nodeFound != null) {
            return nodeFound.getValue();
        }
        return null;
    }

    public boolean containsKey(K key) {
        int index = calculateIndex(key);
        MapItem<K, V> nodeFound = findNodeByKey(key, buckets[index]);
        if (nodeFound != null) {
            return true;
        }
        return false;
    }

    public boolean containsValue(V value) {
        for (LinkList<MapItem<K, V>> bucket : buckets) {
            if (bucket != null) {
                MapItem<K, V> nodeFound = findNodeByValue(value, bucket);
                if (nodeFound != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public void remove(K key) {
        int bucketIndex = calculateIndex(key);
        int itemIndex = -1;
        if (buckets[bucketIndex] == null) {
            return;
        }
        for (MapItem<K, V> mapItem : buckets[bucketIndex]) {
            if (itemIndex == -1) itemIndex = 0;
            if (key.hashCode() == mapItem.getHash()) {
                if (key.equals(mapItem.getKey())) {
                    break;
                }
            }
            itemIndex++;
        }
        if (itemIndex != -1) {
            buckets[bucketIndex].remove(itemIndex);
        }
    }

    public int size() {
        int result = 0;
        for (LinkList<MapItem<K, V>> item : buckets) {
            if (item != null) {
                if (!item.isEmpty()) {
                    result += item.size();
                }
            }
        }
        return result;
    }

    public boolean isEmpty() {
        for (LinkList<MapItem<K, V>> item : buckets) {
            if (item != null && !item.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public void clear() {
        for (LinkList<MapItem<K, V>> bucket : buckets) {
            bucket.clear();
        }
    }

    private int calculateIndex(K key) {
        if (key == null) {
            return 0;
        }
        return key.hashCode() & (capacity - 1);
    }

    private MapItem<K, V> findNodeByKey(K key, LinkList<MapItem<K, V>> bucket) {
        if (key == null) {
            for (MapItem<K, V> mapItem : bucket) {
                if (mapItem.getKey() == null) {
                    return mapItem;
                }
            }
        } else {
            for (MapItem<K, V> mapItem : bucket) {
                if (key.hashCode() == mapItem.getHash()) {
                    if (key.equals(mapItem.getKey())) {
                        return mapItem;
                    }
                }
            }
        }
        return null;
    }

    private MapItem<K, V> findNodeByValue(V value, LinkList<MapItem<K, V>> bucket) {
        for (MapItem<K, V> mapItem : bucket) {
            if (mapItem.getValue().equals(value)) {
                return mapItem;
            }
        }
        return null;
    }

    private class MapItem<K, V> {
        final int hash;
        final K key;
        V value;

        public MapItem(int hash, K key, V value) {
            this.hash = hash;
            this.key = key;
            this.value = value;
        }

        public int getHash() {
            return hash;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
}


