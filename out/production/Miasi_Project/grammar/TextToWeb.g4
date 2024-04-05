grammar TextToWeb;

// Główne reguły
page: 'Strona' STRING '{' pageContent '}';
pageContent: (theme | font | section | header )*;

theme: 'Motyw' STRING;
font: 'Czcionka' STRING;
backgroundColor: 'KolorTła' STRING;
section: 'Sekcja' STRING '{' sectionContent '}';
header: 'Naglowek' STRING '{' headerAttributes '}';
sectionContent: (alignment | backgroundColor | text | image | header | section)*;

// Elementy sekcji
alignment: 'Rozmieszczenie' STRING;
text: 'Tekst' STRING '{' textAttributes '}';
image: 'Obraz' STRING '{' imageAttributes '}';
list: 'Lista' '{' 'Typ' STRING listItem* '}';
listItem: 'Element' STRING;

// Atrybuty
textAttributes: (fontColor | fontSize | alignment)*;
imageAttributes: (width | alignment)*;
headerAttributes: (level | fontColor)*;

// Atrybuty wspólne
fontColor: 'KolorCzcionki' STRING;
fontSize: 'Rozmiar' STRING;
width: 'Szerokość' STRING;
level: 'Poziom' STRING;
color: 'Kolor' STRING;

// Tokeny
STRING: '"' (~["\r\n])* '"';
WS: [ \t\r\n]+ -> skip;
