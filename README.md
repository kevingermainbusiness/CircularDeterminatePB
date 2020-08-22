# CircularDeterminatePB
A custom progressbar programmed to animate onclik.
Here's a look at the custom progressbar ```circle.xml```:
```xml 
<?xml version="1.0" encoding="utf-8"?>
<layer-list xmlns:android="http://schemas.android.com/apk/res/android">
<item>
    <shape
        android:shape="ring"
        android:thicknessRatio="16"
        android:useLevel="false">
        <solid android:color="#ddd"/>
    </shape>
</item>
    <item>
        <rotate
            android:fromDegrees="270"
            android:toDegrees="270">
            <shape
                android:shape="ring"
                android:thicknessRatio="16"
                android:useLevel="true">
                <gradient
                    android:startColor="@color/colorAccent"
                    android:centerColor="@color/colorPrimary"
                    android:endColor="@color/colorPrimaryDark"
                    android:type="sweep"/>
            </shape>
        </rotate>
    </item>
</layer-list>
```
Add this to your ```styles.xml``` file:
```xml
    <!-- Base application theme. -->
    <style name="AppTheme" parent="Theme.AppCompat.Light.DarkActionBar">
        <!-- Customize your theme here. -->
        <item name="colorPrimary">@color/colorPrimary</item>
        <item name="colorPrimaryDark">@color/colorPrimaryDark</item>
        <item name="colorAccent">@color/colorAccent</item>
    </style>

    <style name="CircularDeterminateProgressBar">
        <item name="android:indeterminateOnly">false</item>
        <item name="android:progressDrawable">@drawable/circle</item>
    </style>
```
