# cardview_with_shadow
Module allows change shadow color in cardview<br/>  

For using this module add in your gradle this code:
```
allprojects {
    repositories {
        jcenter()
        maven { url 'https://jitpack.io' }
    }
}
```
 Add the dependency:
 ```
 dependencies {
	        implementation 'com.github.Stalker11:cardview_with_shadow:r.r.r'
	}
  ```
  Where r.r.r last release version.<br/>
  For implement this module in your project you have to set shadow parameters into xml file, for instance:
  ```
  <com.olegel.android.cardview_with_shadow.CardView
      android:id="@+id/custom_card_view"
      android:layout_width="wrap_content"
      android:layout_height="wrap_content"
      app:cardCornerRadius="10dp"
      app:cardElevation="5dp"
      app:cardview_shadow_end_color="@color/colorAccent"
      app:cardview_shadow_start_color="@color/colorPrimaryDark">
      
      <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/app_name"/>

  </com.olegel.android.cardview_with_shadow.CardView>
  ```
  If you have to change color in code you can use method, for example:
  ```
   custom_card_view.setShadows(resources.getColor(R.color.colorGreen), resources.getColor(R.color.colorBlue));
   ```
    
