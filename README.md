BSD Android Calendar
==========================

Calendario Android basato sulla libreria https://github.com/square/android-times-square 

Ci sono due tipi di calendario, uno some ListView e uno come GridView
Ho solo aggiunto delle funzionalità, perciò per vedere un utilizzo completo vedere nella pagina della libreria originale.

Esempio di utilizzo nel progetto CNA Bologna.

Utilizzo
-----

Includi `CalendarPickerView` oppure `CalendarPickerGridView` nel layout XML.

```xml
<com.squareup.timessquare.CalendarPickerView
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:id="@+id/calendar_view"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    />
```

```xml
<com.squareup.timessquare.CalendarPickerGridView
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:id="@+id/calendar_view"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:numColumns="4"
    />
```

Rispetto alla libreria originale sono stati aggiunti alcuni parametri:

```xml
    app:tsquare_cellDisabledColor="@color/transparent"
```
Colore di sfondo delle celle non del mese corrente.

```xml
    app:tsquare_formatDayNameHeaderWeek="E"
```
Formato del nome del giorno della settimana nell'hedear di ogni mese.
Valori accettati: E, EE, EEE, EEEE, e, ee, eee, eeee, Ee, Eee, Eeee
(esempi: L, LU, LUN, LUNEDI', l, lu, lun, lunedì, Lu, Lun, Lunedì)

```xml
    app:tsquare_titleMonthToUpperCase="true"
```
Trasforma l'header con il nome del mese in caratteri maiuscoli

```xml
    app:tsquare_headerDayWeekBackgroundDrawable="@drawable/border_bottom"
```
Mette un drawable di sfondo all'header con i nomi dei giorni della settimana 

```xml
    app:tsquare_headerDayWeekBackgroundColor="@color/blue"
```
Mette un colore di sfondo all'header con i nomi dei giorni della settimana 

```xml
    app:tsquare_gravityTitleMonth="right"
```
Applica il gravity all'header con il nome del mese.
Valori accettati: left, right, center

```xml
    app:tsquare_typefaceHeaderDayWeek="bold"
```
Applica all'header con il nome dei giorni della settimana uno stile. 

```xml
    app:tsquare_typefaceCellDays="normal"
```
Applica ai numeri nelle celle con il numero del giorno uno stile.

Questi ultimi due stili possono essere:
bold, italic, normal, bold_italic


Download
--------

Aggiungere al repository il percorso:
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

