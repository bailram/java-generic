# Bounded Type Parameter
- Kadang kita ingin membatasi data yang boleh digunakan di generic parameter type
- Kita bisa menambahkan constraint di generic parameter type dengan menyebutkan tipe yang diperbolehkan
- Secara otomatis, type data yang bisa digunakan adalah type yang dsudah kita sebutkan, atau class-class turunannya
- Secara default, contraint type untuk generic parameter type adalah Object, sehingga semua tipe data bisa digunakan

# Multiple Bounded Type Parameter
- Kadang kita ingin membatasi tipe data dengan beberapa jenis tipe data di generic parameter type
- Kita bisa menambahkan beberapa bounded type parameter dengan karakter & setelah bounded type pertama
- Jika ingin menambahkan lagi, cukup gunakan karakter & diikuti bounded type nya lagi
- Parameter ke 2,3,dst hanya diperbolehkan interface, karena di java tidak diperbolehkan memiliki parent lebih dari 1
