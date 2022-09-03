# Contravariant
- Contravariant artinya kita bisa melakukan subtitusi supertype (parent) dengan subtype (child)
- Caranya agar generic object kita menjadi contravariant adalah dengan menggunakan kata kunci (? super SubClass)
- Artinya saat kita membuat object Contoh<Object>, maka bisa disubtitusi menjadi Contoh<? super String>
- Contravariant bisa read dan write, namun perlu berhati-hati ketika melakukan read, terutama jika sampai parentnya punya banyak child