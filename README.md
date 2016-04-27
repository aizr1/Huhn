**# Huhn**

Infoproject #1 


OOP - Hühnerhof-Aufgabe
========================

Vorbemerkungen:
Die vorliegende ca. 30 Jahre alte (von mir etwas modifizierte) Beispiel-Aufgabe stammt aus der Wissensverarbeitung (Teilgebiet der Künstlichen Intelligenz) zur Repräsentation objektorientierten Wissens. Unter anderem hieraus hat sich die OOP entwickelt.
Verwenden Sie die in dieser Anleitung benutzten Bezeichnungen zwecks Erleichterung der Betreuung und der Kommunikation untereinander.

##################################################################
Eine alternative Meinung von
Alexander Alexandrowitsch Stepanow (geb. am 16. November 1950 in Moskau): Pionier auf dem Gebiet der Informatik. Sein Forschungsschwerpunkt ist die Generische Programmierung und er gilt als hauptsächlicher Schöpfer der C++ Standard Template Library. Stepanow studierte in Moskau Mathematik und arbeitet derzeit (d.h. 2013) bei Adobe Systems. Er ist Vater von acht Kindern.
Die OOP sei "ein fast genauso großer Schwindel wie die Künstliche Intelligenz".
##################################################################

Die Aufgabe und Gedanken zur Lösung
===================================

Programmieren Sie ein Informationssystem zu den Hühnern eines Hühnerhofes. Berücksichtigen Sie 2 Hühnerrassen: Leghorn und Perlhuhn.

Erzeugen Sie mittels Eclipse ein Projektverzeichnis Huhn, ein huhn_package und eine Klasse Main_Class, welche nur die Methode main beinhaltet.

Erzeugen Sie eine Klasse Huhn im huhn_package. Diese enthalte folgende Eigenschaften, die für alle Hühner zutreffen, ohne dass bereits konkrete Hühner im Programm existieren:

name	-	Jedes konkrete Huhn hat einen Namen.

flügel	-	Gemeint ist die ist die Anzahl der Flügel, die standardmäßig auf Klassenebene
	auf 2 gesetzt wird. Abweichungen in seltenen Ausnahmefällen sind möglich
	(wird später geklärt). Welcher Datentyp ist hier angebracht?

eier	-	Anzahl der Eier, die ein konkretes Huhn (im Durchschnitt) pro Tag legt

gewicht	-	Körpergewicht eines konkreten Huhnes

geschlecht	-	Als Werte sollten hier 'w' bzw. 'm' vorgesehen sein.

suppenhuhn	-	Logische Eigenschaft eines jeden Huhnes, die mit true oder
	false (Standardwert) zu belegen ist.

Es handelt sich für alle Instanzen um höchst persönliche Daten, die niemanden etwas angehen. Deshalb sollten sie mit dem Modifikator private vereinbart werden.

Eine Methode der Klasse Huhn
----------------------------
Falls der Quotient eier/gewicht nicht ein gewisses Limit (double limit) erreicht, ist die Variable suppenhuhn auf true zu setzen. Dies soll durch die Methode suppenmethode erreicht werden, der natürlich der Parameter limit mitzuteilen ist.

Unterklassen
------------
Erzeugen Sie die Unterklasse Leghorn wie üblich über
File - New - Class
Das Ergebnis wird sein:
	public class Leghorn
	{ ... }
Ändern Sie die erste Zeile, so dass Leghorn als Erweiterung (Spezialisierung) der Klasse Huhn verstanden wird:
	public class Leghorn extends Huhn
	{ ... }
Leghorn enthalte lediglich einen Konstruktor, d.h. eine Methode, mit der konkrete Hühner der Leghorn-Rasse erzeugt werden können.
Man kann sich darauf verlassen, dass alle Eigenschaften (ggf. mit Wert) und Methoden von Huhn in die Klasse Leghorn vererbt werden. Z.B. steht name zur Verfügung, natürlich auch bei den noch zu erzeugenden konkreten Leghorn-Hühnern.

Der Leghorn-Konstruktor:
Die erste Zeile sollte folgendes Aussehen haben:

	public Leghorn(String name, double eier, double gewicht,
	char geschlecht)

D.h. zum "Konstruieren" eines konkreten Leghorn-Huhnes müssen 4 Parameter mitgeteilt werden.
Auf die von der Klasse Huhn geerbten privaten Daten kann nur mittels der set-Methoden zugegriffen werden, um sie neu zu setzten; diese Methoden sind ebenfalls von Huhn vererbt worden, stehen also zur Verfügung:

	set_name(name);	// Aktueller Parameter name entspricht
	// formalem Parameter von Leghorn(...) .

Analog ist mit den anderen Daten zu verfahren.

Sollte gewicht<1.3 sein, obwohl es sich um einen Hahn handelt, muss ein Fehler vorliegen. Dann soll automatisch der Gewichtswert auf 1.5 gesetzt werden. Ebenso ist mit eier zu verfahren: Wenn der übergebene Wert bei einem Hahn ungleich 0 ist, dann ist eier=0. zu setzen. Nutzer wünschen dazu im Allgemeinen eine Information.

Ferner ist zu beachten, dass Leo wegen eines Unfalls in seiner Jugend nur einen Flügel hat. Der von Huhn vererbte Wert 2 ist also zu korrigieren.

Schließlich ist noch der Wert für suppenhuhn zu belegen. Dies geschieht durch Aufruf von suppenmethode mit dem (frei gewählten) Parameter 0.5  (eigentlich auch eine
set-Methode, die konsequenterweise set_suppenhuhn heißen müsste) .

Die eigentliche Konstruktion der Tiere erfolge im Hauptprogramm main .
Das Java-Objekt lisa hat den Namen "Lisa " (immer 5 Zeichen wegen eines schönen Ausgabebildes) , legt pro Tag (im Durchschnitt) 0.7 Eier bei einem Körpergewicht von
1.8 kg und ist weiblich.
lisa wird durch folgenden Konstruktor-Aufruf erzeugt:

	lisa = new Leghorn("Lisa ", 0.7, 1.8, 'w');

Es folgen die Befehle

	lola = new Leghorn("Lola ", 0.9, 1.4, 'w');
	leo  = new Leghorn("Leo  ", 0.9, 1.9, 'm');

Die letzte 0.9 ist ein Kopierfehler, der automatisch korrigiert wird für Hähne.
Nach der eigentlichen Konstruktion sind alle Daten des aktuellen Huhnes auszugeben - mit 
Hinweis darauf, ob das Huhn zum Schlachten vorgesehen ist.

Der Perlhuhn-Konstruktor und seine Aufrufe:
Im Prinzip wird analog verfahren, aber normale weibliche Perlhühner wiegen einheitlich 1.2 kg, Hähne dagegen 1.4 kg . Der Konstruktor benötigt daher nur drei Argumente.
Konstruktor-Aufrufe (in main ):

	paula = new Perlhuhn("Paula", 1.2, 'w');
	pia   = new Perlhuhn("Pia  ", 0.3, 'w');
	paul  = new Perlhuhn("Paul ", 0.0, 'm');

Gesamtstruktur:	Huhn
	/	\
	Leghorn	Perlhuhn
	/	|	\	/	|	\
	Lisa	Lola	Leo	Pia	Paula	Paul

Starten Sie das Programm main .

Ein böser Fehler:
Es stellt sich mit den angegebenen Daten heraus, dass vier Tiere zu schlachten wären, was auffallend viel ist. Ein kurzes Nachdenken führt zu der Erkenntnis, dass Hähne nicht allein aus dem Grund geschlachtet werden dürfen, weil sie 0.0 Eier legen. Ändern Sie die Konstruktoren so, dass die Hähne überleben.

Anzahl-Berechnungen
-------------------
Definieren Sie in der Klasse Leghorn eine statische Variable anz_lh , welche die Anzahl der Instanzen vom Typ Leghorn speichern soll:
	
	static int anz_lh = 0;  // Anzahl der Leghorn-Hühner

anz_lh ist im Konstruktor Leghorn(...) immer um 1 zu erhöhen, wenn der Konstruktor aufgerufen wird. Verfahren Sie in der Klasse Perlhuhn analog: Berechnen Sie die Anzahl anz_ph . Die Gesamtzahl der Instanzen ist nun natürlich gleich anz_lh+anz_ph . Berechnen Sie dennoch die Anzahl der Hühner, indem Sie einen Konstuktor Huhn() programmieren, in dem lediglich eine statische Variable anz_hühner zu erhöhen ist. Das funktioniert, obwohl es nicht direkt Instanzen der Klasse Huhn gibt, sondern nur Leghorn- und Perlhühner, die aber auch als Hühner gelten.

Hühner-Arrays
-------------
Momentan existieren die Hühner als ungeordnete Individuen. Sollen z.B. alle Namen ausgegeben werden, muss jedes Huhn im Programm einzeln angesprochen werden.
Deshalb wird jetzt im Hauptprogramm main ein Array h vom Basistyp Huhn mit anz_hühner Komponenten angelegt; dann werden die Hühner eingespeichert:

	h[0] = lisa; ... h[5] = paul;

Das kostet kaum Speicherplatz; die Daten werden dabei nicht kopiert. Z.B. h[0] ist eine Referenz (also eine Adresse) auf das Datenobjekt lisa . Ändern Sie probehalber den Namen von h[0] (z.B. h[0].set_name("Liesa") ) und geben Sie dann den Namen des Objektes lisa aus (natürlich mit der get-Methode). Realisieren Sie, dass das Ergebnis Liesa sein muss, obwohl doch in h[0] geändert wurde.
Bemerkenswert ist, dass das Einspeichern in das Hühner-Array ohne Berücksichtigung der Rassenzugehörigkeit funktioniert (wegen des Basistyps Huhn).

Erzeugen Sie analog zwei weitere Arrays l und p für die Leghorn- und die Perlhühner. Sorgen Sie für ausreichend Speicherplatz, falls mal ein paar Hühner hinzugekauft werden.

Nun geben Sie - um den Vorteil des Array’s zu genießen - mal alle Namen, die in den h[i] stecken, mittels einer for‑Schleife hintereinander aus.


Ein freudiges Ereignis
----------------------
Am heutigen Vormittag ist ein weibliches Leghorn-Küken geschlüpft, das Lilo getauft wurde.
In main ist dazu ein neues Objekt anzulegen:

	lilo = new Leghorn("Lilo ", 0.0, 0.052, 'w');

Natürlich kann Lilo noch keine Eier legen, da sie mit 52 Gramm weniger als ein Ei wiegt.
Jetzt müssen wir unbedingt die Folgen unseres Tuns bedenken und die Programmierung der suppenmethode anpassen: Sorgen Sie dafür, dass bei einem Gewicht unter 1 Kilogramm der suppenhuhn-Wert immer auf false gesetzt wird.

Noch ist lilo nicht in das Array h integriert. Das zu tun ist nicht ganz einfach, weil der verfügbare Speicherplatz voll belegt ist. Vom Datentyp her (d.h. bez. der Klassenzugehörigkeit) gibt es kein Problem; für Java ist Lilo ein Huhn. Erweitern Sie h um eine Speicherzelle, und speichern Sie lilo als Element h[6] ein (siehe Vorlesung).

Bemerkung:
Wäre lilo mit einem Konstruktor Huhn(...) erzeugt worden, wäre ein Einspeichern in l nicht möglich, weil die Klasse Leghorn spezieller ist.

Führen Sie nach eigenem Ermessen noch einige Experimente aus.


Zusatzaufgaben (für die "Schnellen"):
--------------

Sortieren Sie das Array h nach den Einträgen zur Eieranzahl.
Löschen Sie die Suppenhühner aus dem Array: Wenn die Suppenhuhn-Eigenschaft wahr ist, muss 

h[i] = null;

gesetzt werden, was bedeutet, dass die Referenz auf das Objekt gelöscht wird.

Verwenden Sie alternativ zum Array h eine Arrayliste al .

Vereinbarung:	ArrayList <Huhn> al ArrayList();

Ohne Nennung des Basistyps Huhn wären alle Elemente vom Typ Object . Dann stünde z.B. die Methode get_name() im Folgenden nicht zur Verfügung.

Fügen sie alle fünf nun noch lebenden Hühner ein. Geben Sie die Namen in einer for-Schleife aus:

Die Namen müssen angesprochen werden mit al.get(i).get_name() .
Erklärung dazu:

al	-	die Liste
get(i)	-	Methode aus ArrayList , ererbt von al
al.get(i)	-	i-tes Huhn in der Liste al
al.get(i).get_name()	-	Name des Huhnes al.get(i)

Überzeugen Sie sich, dass jetzt das Löschen viel einfacher geht.

