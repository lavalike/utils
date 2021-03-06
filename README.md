# utils
> 工具库

[![Platform](https://img.shields.io/badge/Platform-Android-00CC00.svg?style=flat)](https://www.android.com)
[![](https://jitpack.io/v/lavalike/utils.svg)](https://jitpack.io/#lavalike/utils)

### 依赖导入

``` gradle
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

``` gradle
dependencies {
	implementation 'com.github.lavalike:utils:0.0.1'
}
```

### 应用界面
AppUtils
> 使用前请先初始化：AppUtils.install(Context)

``` java
public class AppUtils {
    public static void install(Application application);
    public static Application getApplication();
    public static Context getContext();
    public static int dip2px(float dip);
    public static float px2dip(int px);
    public static int sp2px(float spVal);
    public static float px2sp(float pxVal);
    public static int getScreenWidthPixels();
    public static int getScreenHeightPixels();
    public static Handler getHandler();
    public static Resources getResources();
    public static int getColor(int resId);
    public static Drawable getDrawable(int resId);
    public static String getString(int resId);
    public static String[] getStringArray(int resId);
    public static int getDimens(int resId);
    public static boolean isOnMainThread();
    public static void showSoftInput(View view);
    public static boolean hideSoftInput(View view);
    public static void setViewEnabled(View view, boolean enabled);
    public static int getStatusBarHeight();
    public static String getAppName();
    public static String getVersionName();
    public static int getVersionCode();
    public static Activity getRealActivity(Context ctx);
    public static String getRealFilePath(Uri uri);
}
```


### 加密
EncryptionUtil

``` java
public class EncryptionUtil {
    public static String getMD5(String s);
    public static String getMD5Small(String s);
    public static String getSHA256(String s);
    private static String byte2Hex(byte[] bytes);
    public static String getValueEncoded(String value);
    public static String AesDecrypt(String src);
}
```
Base64Util

``` java
public class Base64Util {
    public static String imageToBase64(String path, int quality);
    public static String imageToBase64(Bitmap bitmap, int quality);
    public static String fileToBase64(String path);
}
```

### IO管理
IOUtils

``` java
public class IOUtils {
    public static void close(Closeable... closeables);
}
```

### 数据解析
JsonUtils

``` java
public class JsonUtils {
    public static <T> T parseObject(String jsonString, Class<T> cls);
    public static <T> T parseObject(String jsonString, Type typeOfT);
    public static <T> T parseObject(JsonElement json, Class<T> cls);
    public static <T> T parseObject(String jsonString, Class<T> cls, Class<?>... generics);
    public static <T> List<T> parseArray(String jsonString, Class<T> generic);
    public static String toJsonString(Object object);
}
```

### 网络
NetUtils

``` java
public class NetUtils {
    public static boolean isAvailable();
    public static boolean isMobile();
    public static boolean isWifi();
    private static NetworkInfo getNetworkInfo();
    public static String getHostIP();
}
```

### 集合操作
IList

``` java
public class IList {
    public static <T> boolean isNotEmpty(List<T> list);
    public static <T> boolean isEmpty(List<T> list);
}
```

### 数据传递
DataTransfer

``` java
public class DataTransfer {
    public static DataTransfer get();
    public void put(@Nullable String key, @Nullable Object value);
    public Object getData(@Nullable String key);
    public Reference<?> remove(@Nullable String key);
    public void removeAll();
}
```