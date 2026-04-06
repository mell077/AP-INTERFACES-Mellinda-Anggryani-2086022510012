Payable.java
sebuah Interface, yang fungsinya sebagai Kontrak Kerja. Di sini kita menetapkan aturan bahwa siapa pun atau apa pun yang masuk ke dalam sistem keuangan kita wajib memiliki fungsi getPaymentAmount() (hitung jumlah bayaran). Kita tidak peduli bagaimana cara hitungnya—apakah itu gaji bulanan, komisi, atau tagihan vendor—yang penting mereka punya cara untuk mengeluarkan angka nominal pembayarannya.

invoice.java
Kode ini menunjukkan bahwa sistem pembayaran kita tidak hanya untuk karyawan, tetapi juga untuk tagihan barang (Invoice). Meskipun Invoice sama sekali tidak berhubungan dengan Employee, keduanya sama-sama menggunakan kontrak Payable. Hal ini memungkinkan sistem untuk menghitung jumlah bayaran secara otomatis dengan rumus yang relevan bagi barang, yaitu mengalikan jumlah item (quantity) dengan harga per unit (pricePerItem).

Employee.java
Kode ini mendefinisikan Employee sebagai kelas abstrak yang berfungsi sebagai cetak biru dasar bagi semua jenis karyawan. Karena menggunakan kontrak Payable, setiap karyawan nantinya wajib bisa dibayar, namun metode pembayarannya sengaja tidak dituliskan di sini karena setiap posisi memiliki rumus gaji yang berbeda-beda—tugas tersebut diserahkan kepada kelas turunannya (subclass) yang lebih spesifik

SalariedEmployee.java
Kode ini merupakan bentuk nyata dari karyawan tetap yang memiliki gaji mingguan pasti. Karena kelas ini adalah turunan dari Employee, maka ia wajib mengisi detail pembayaran yang sebelumnya masih kosong, di mana nilai bayarannya (getPaymentAmount) diambil langsung dari total gaji mingguan (weeklySalary) yang sudah ditetapkan

Main.java
Kode ini adalah bagian utama yang mendemonstrasikan kekuatan Polimorfisme. Meskipun SalariedEmployee (orang) dan Invoice (tagihan barang) adalah objek yang berbeda, keduanya dapat disatukan dalam satu daftar (List) karena sama-sama merupakan Payable. Saat dijalankan dalam perulangan, sistem secara cerdas akan langsung memanggil rumus hitung yang tepat untuk masing-masing objek tersebut secara otomatis.