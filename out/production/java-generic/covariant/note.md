# Covariant
- Covariant artinya melakukan subtitusi subtype (child) dengan supertype (parent)
- Caranya agar generic object kita menjadi covariant adalah dengan menggunakan kata kunci (? extends ParentClass)
- Artinya ketika kita membuat object Contoh<String>, maka bisa disubtitusi menjadi Contoh<? extends Object>
- Covariant adalah read-only, jadi kita tidak bisa mengubah data generic nya