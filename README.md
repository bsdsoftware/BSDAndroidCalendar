BSD Android Calendar
==========================

Calendario Android basato sulla libreria https://github.com/square/android-times-square 

Ci sono due tipi di calendario, uno some ListView e uno come GridView
Ho solo aggiunto delle funzionalità, perciò per vedere un utilizzo completo vedere nella pagina della libreria originale.

Esempio di utilizzo nel progetto CNA Bologna.

Usage
-----

Includi `CalendarPickerView` oppure `CalendarPickerGridView` nel layout XML.

```xml
<com.squareup.timessquare.CalendarPickerView
    android:id="@+id/calendar_view"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    />
```

<com.squareup.timessquare.CalendarPickerGridView
    android:id="@+id/calendar_view"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    />
```

This is a fairly large control so it is wise to give it ample space in your layout. On small
devices it is recommended to use a dialog, full-screen fragment, or dedicated activity. On larger
devices like tablets, displaying full-screen is not recommended. A fragment occupying part of the
layout or a dialog is a better choice.

In the `onCreate` of your activity/dialog or the `onCreateView` of your fragment, initialize the
view with a range of valid dates as well as the currently selected date.

```java
Calendar nextYear = Calendar.getInstance();
nextYear.add(Calendar.YEAR, 1);

CalendarPickerView calendar = (CalendarPickerView) findViewById(R.id.calendar_view);
Date today = new Date();
calendar.init(today, nextYear.getTime())
    .withSelectedDate(today);
```

The default mode of the view is to have one selectable date.  If you want the user to be able to
select multiple dates or a date range, use the inMode() method:

```java
calendar.init(today, nextYear.getTime())
    .inMode(RANGE);
```


Download
--------

Aggiungi al repository il percorso:
```groovy
repositories {
        jcenter()
        maven {
            url "http://dl.bintray.com/bsdsoftware/bsdsoftware"
        }
    }
```
e nel gradle file la dipendenza:
```groovy
compile 'it.bsdsoftware:bsd-android-calendar:1.0'
```

