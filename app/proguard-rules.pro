# Add project specific ProGuard rules here.
# By default, the flags in this file are appended to flags specified
# in E:\android_sdk/tools/proguard/proguard-android.txt
# You can edit the include path and order by changing the proguardFiles
# directive in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# Add any project specific keep options here:

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

-optimizationpasses 5
# 指定代码的压缩级别
-dontusemixedcaseclassnames
# 是否使用大小写混合
-dontskipnonpubliclibraryclasses
# 是否混淆第三方jar
-dontpreverify
# 混淆时是否做预校验
-verbose
# 混淆时是否记录日志
-optimizations !code/simplification/arithmetic,!field/*,!class/merging/*
# 混淆时所采用的算法

-keep class * implements android.os.Parcelable {
# 保持 Parcelable 不被混淆
  public static final android.os.Parcelable$Creator *;
}


############ greedao ################
-keep class de.greenrobot.dao.** {*;}
-keepclassmembers class * extends de.greenrobot.dao.AbstractDao {
    public static java.lang.String TABLENAME;
}
-keep class **$Properties
# If you do not use SQLCipher:
-dontwarn org.greenrobot.greendao.database.**
# If you do not use Rx:
-dontwarn rx.**

######bugly############################
-dontwarn com.tencent.bugly.**
-keep public class com.tencent.bugly.**{*;}

########## ok http #####################
-dontwarn com.squareup.okhttp.**

-keep class com.squareup.okhttp.** { *;}

-dontwarn okio.**

######## rx java ###################
-dontwarn sun.misc.**

-keepclassmembers class rx.internal.util.unsafe.*ArrayQueue*Field* {
   long producerIndex;
   long consumerIndex;
}

-keepclassmembers class rx.internal.util.unsafe.BaseLinkedQueueProducerNodeRef {
    rx.internal.util.atomic.LinkedQueueNode producerNode;
}

-keepclassmembers class rx.internal.util.unsafe.BaseLinkedQueueConsumerNodeRef {
    rx.internal.util.atomic.LinkedQueueNode consumerNode;
}

-dontnote rx.internal.util.PlatformDependent