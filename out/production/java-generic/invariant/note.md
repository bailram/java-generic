#Invariant

- Secara default, saat kita membuat generic parameter type, sifat parameter tersebut adalah invariant
- Invariant artinya tidak boleh di subtitusi dengan subtype (child) atau supertype (parent)
<br>Artinya
- ``ketika kita membuat object Contoh<String>, maka tidak sama dengan Contoh<Object>. kalau polymorphism harusnya String adalah supertype dari Object``
- ``begitu juga sebaliknya, saat membuat object Contoh<Object>, maka tidak sama dengan Contoh<String>. yang mana harusnya String adalah subtype atau turunan dari class Object``