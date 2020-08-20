# CircularDeterminatePB
A custom progressbar programmed to animate onclik.
Here's a look at the custom progressbar xml:
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
