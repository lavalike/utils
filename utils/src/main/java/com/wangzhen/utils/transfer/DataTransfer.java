package com.wangzhen.utils.transfer;

import org.jetbrains.annotations.Nullable;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;

/**
 * data transfer helper
 * Created by wangzhen on 2020/8/19.
 */
public class DataTransfer {
    private static DataTransfer mInstance;
    private final Map<String, SoftReference<?>> mCache = new HashMap<>();

    public static DataTransfer get() {
        if (mInstance == null) {
            synchronized (DataTransfer.class) {
                if (mInstance == null) {
                    mInstance = new DataTransfer();
                }
            }
        }
        return mInstance;
    }

    public void put(@Nullable String key, @Nullable Object value) {
        mCache.put(key, new SoftReference<>(value));
    }

    @Nullable
    public Object getData(@Nullable String key) {
        SoftReference<?> softReference = mCache.get(key);
        return softReference == null ? null : softReference.get();
    }

    @Nullable
    public Reference<?> remove(@Nullable String key) {
        return mCache.remove(key);
    }

    /**
     * clear all cache
     */
    public void removeAll() {
        mCache.clear();
    }
}
