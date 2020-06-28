# APPL1-SOLID
Khoirunnisa Putri Kania - 181524014

<b> 1. Stream Progress </b>

Hal utama yang dilakukan oleh program ini adalah menghitung persentase bytes sent / length. Class ini telah mengaplikasikan prinsip SRP karena setiap classnya hanya memiliki satu responsibility.
Selain itu, telah diimplementasikan juga prinsip OCP. Maksud dari prinsip ini adalah kita dapat membuat atau menambah fitur baru tanpa mengubah suatu class yang telah dibuat. Hal ini terlihat dari penggunaan interface IStreamable yang dapat diimplements oleh File dan Music. Jika suatu saat ingin ditambah Video, hanya perlu membuat class baru yang mengimplement IStreamable.
Selanjutnya prinsip LSP yang juga terdapat pada program ini. Hasil dari method CalculateCurrentPercent() pada class StreamProgramInfo dapat dengan mudah mengembalikan nilai sesuai class mana yang dilewatkan pada parameter konstruktor class StreamProgramInfo meskipun tidak mengextend class tersebut.

<b> 2. Graphic Editor </b>

Tidak terlalu berbeda dengan program nomor 1, pada program graphic editor ini juga setiap class telah mengaplikasikan SRP, OCP, LSP. ketika macam-macam shape telah mengimplement IShape maka akan dengan mudah untuk melakukan draw pada class GraphicEditor hanya dengan melakukan passing parameter shape yang dimaksud ke class GraphicEditor.

<b> 3. Detail Printer </b>

Pada program detail printer ini terdapat sebuah parent class yaitu employee. Employee dapat terdiri dari berbagai macam jabatan, salah satunya adalah manager. Konsep LSP diterapkan pada hal ini yaitu dengan class manager mengextend class employee.

<b> 5. Security Door </b>

Program ini menerapkan prinsip ISP yaitu lebih memilih untuk membuat beberapa interface dengan tujuan spesifik daripada satu interface tetapi memiliki banyak tujuan, terlihat dari pembuatan interface IRequestKeyCard, IRequestPinCode, dan ISecurityUI.
