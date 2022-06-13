## Java unit test

source : programmer zaman now


### Tag
- tambahkan tag (tanda) dengan menggunakan annotation @Tag
- kita bisa fleksibel  ketika menjalan  unit test, bisa memilih tag mana yang mau di include atau di exclude
- Jika kita menambahkan tag di class unit test, secara otomatis semua function unit test di dalam class tersebut akan memiliki tag tersebut
- annotation @Tags untuk menambahkan beberapa tag dalam class atau function


### TestMethodOrder
- Mengurutkan test
- @Order(nomor urut)

### Test Lifecycle
- annotation @TestInstance default nya adalah Lifecycle.PER_METHOD, artinya tiap method akan dibuat sebuah instance / object baru
- Kita bisa merubahnya menjadi Lifecycle.PER_CLASS jika mau, dengan demikian instance / object test haya dibuat sekali per class, dan method test akan menggunakan object test yang sama
- Lifecycle.PER_CLASS bisa kita manfaatkan jika ingin membuat test yang tergantung dengan test lain


### Test di dalam test
- annotation @nested
- jika test sudah terlalau banyak, lebih baik di pecah menjadi beberapa test class, lalu digrouping sesuai jenis method test nya

### TestInfo
- mendapatkan informasi dari subuah test


### Dependency Injection
- adalah bagaimana kita bisa memasukkan dependency (object/instance) ke dalam unit test secara otomatis tanpa proses manual
- Saat kita menambah parameter di function unit test, sebenarnya kita bisa secara otomatis memasukkan parameter tersebut dengan bantuan ParameterResolver
- Contohnya TestInfo yang kita bahas sebelumya, sebenarnya objectnya dibuat oleh TestInfoParameterResolver

