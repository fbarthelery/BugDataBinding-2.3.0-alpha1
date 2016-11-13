Databinding bug in Android Studio 2.3.0-alpha1
==============================================

This project demonstrate a bug happening in Android Studio 2.3.0-alpha1

In this version, the generated code for the MainActivityBinding has a little
typo issue when referencing an inner class.

See the `res/layout/activity_main.xml` contains a declaration for a variable of
type `MainActivity.Handler`

```
    <data>
        <variable
                name="handler"
                type="com.geekorum.databindingbug.MainActivity.Handler"/>
    </data>
```

with Android Studio 2.2.2, the generated code for MainActivityBinding contains
the folloring correct declaration of variable : 

```
    // variables
    private com.geekorum.databindingbug.MainActivity.Handler mHandler;
```

In Android Studio 2.3.0-alpha1, the generated code for MainActivityBinding contains :

```
    // variables
    private com.geekorum.databindingbug.MainActivityHandler mHandler;
```

There is a missing dot between MainActivityBinding and Handler in the type declaration.
This prevent the compilation of the project

